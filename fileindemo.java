package iodemo;

import java.io.FileInputStream;


public class fileindemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 FileInputStream fin=new FileInputStream("D:\\testout.txt");
    	 // int i= fin.read();
    	 //System.out.print ((char)i);
    	 
    	 int i=0;
    	 while ((i=fin.read())!=-1){
    		System.out.print((char)i); 
    	 }
     fin.close();
     }
           catch (Exception e) {
        	   //TODO Auto-generated catch block
        	   System.out.println(e);
        	   
           }
	
	}
}
