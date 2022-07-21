package realexample;

public class A7interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface Printable{  
void print();  
}  
interface Showable{  
void show(); 
}  
class A7 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
public void display(){System.out.println("balu");}
public static void main(String args[]){ 
	A7 obj = new A7();  
	obj.print();  
	obj.show();
	obj.display();
	 }  
	}  
