package iodemo;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class fileoutdemo {


		    public static void main(String[] args)
		    {
		        // TODO Auto-generated method stub
		       try {
		           FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
		           
		          
		           fout.write(65);
		          
		           fout.close();
		           System.out.println("Success....");
		           
		       }
		       catch (Exception e) {
		           // TODO Auto-generated catch block
		           System.out.println(e);
		       }
		    }

		
	}


