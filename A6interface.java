package realexample;

public class A6interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface printable{  
void print();  
}  
class A6 implements printable{  
public void print(){System.out.println("Hello");}  
public static void main(String args[]){  
A6 obj = new A6();  
obj.print();  
 }  
}  