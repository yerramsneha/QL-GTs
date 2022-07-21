package iodemo;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class fileiodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
    	   String s="Welcome to javaTpoint.";
    	   byte b[]=s.getBytes();//converting string into byte array
    	   fout.write(b);
    	   // fout.write(65);
    	   fout.close();
    	   System.out.println("Success....");
       }catch (Exception e) {
    	   // TODO Auto-generated catch block
    	   System.out.println(e);
       }
	}

}
