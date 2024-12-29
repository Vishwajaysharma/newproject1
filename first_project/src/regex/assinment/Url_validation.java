package regex.assinment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url_validation {
	
	public static String xdata = "visit our web site at https://www.amazon.com or https://flipkart.com";
    
	public static void main(String[] args) {
	

		Pattern p = Pattern.compile("https://(www\\.)?[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}(/[a-zA-Z0-9-./]*)?");
		Matcher m = p.matcher(Url_validation.xdata);
         	while (m.find()) {
		
		               System.out.println(m.group());
	         }
		//boolean b = m.matches();
	//	System.out.println(b);
		
		
		
		
		
	}

}
