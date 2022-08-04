package wrapper;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="krishna";
        char ch[]= {'m','a','h','e','s','h'};
        String s2=new String(ch);
        String s3=new String("Lucky");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String txt="satyasrilucky";
        System.out.println("The length of the text string is:" +txt.length());
        String txt1="Hello krishna";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());
        String txt2="open the 'door' please";
        System.out.println(txt2.indexOf("door"));
	}

}
