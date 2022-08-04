package wrapper;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
        long y = x;  
        float z = y; //widenning
        System.out.println("Int value "+x);
        System.out.println("Long value "+y);
        System.out.println("Float value "+z);
        //narrowing
        double d = 166.66;
        long l = (long)d;
        int i = (int)l;
        System.out.println("double type: "+d);
        System.out.println("long type: "+l);  
        System.out.println("int type: "+i);
	}

}
