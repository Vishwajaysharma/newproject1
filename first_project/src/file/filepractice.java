package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class filepractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      File f = new File ("C:/Users/Vishwajay Sharma/OneDrive/Desktop/exyz.txt");

     System.out.println( f.exists());
     System.out.println( f.isFile()); 
     System.out.println( f.isDirectory());
     System.out.println( f.getAbsolutePath());
     System.out.println( f.getName());
     System.out.println( f.getParent());
     System.out.println( f.getParentFile());
     System.out.println( f.getParent());
     System.out.println( f.canRead());
     System.out.println( f.canWrite());
     
     System.out.println(f.setWritable(true));
     System.out.println( f.canWrite());
     System.out.println( f.isHidden());
     
     System.out.println( f.isHidden());
     
     
     //"C:\Users\Vishwajay Sharma\OneDrive\Desktop\exyz.txt"
	}

}
