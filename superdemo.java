package opps;

public class superdemo {

	public static void main(String[] args) {
		Dog d =new Dog();
		d.printColor();
		// TODO Auto-generated method stub

	}

}
class Animal{
	String color ="white";
	
}
class Dog extends Animal{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  



