package miss;

public class practisedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface printable{  
void print();  
}  
class practise implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
practise obj = new practise();  
obj.print();  
 }  
}  