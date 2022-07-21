package miss;

public class Stringdemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="java";
        char ch[]= {'s','t','r','i','n','g','s'};
        String s2=new String(ch);//converting char array to string
        String s3=new String("example");//converting Java string array by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String txt ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is:" +txt);
        String txt1 ="Hello everyone";
        System.out.println(txt1.toUpperCase());  //outputs "HELLO EVERYONE"
        System.out.println(txt1.toLowerCase());   //outputs "hello everyone"
        String txt2 = "Please locate where 'locate occurs!";
        System.out.println(txt2.indexOf("locate"));  //outputs 7

    }

}
		