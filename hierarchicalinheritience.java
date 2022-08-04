package inheritence;
class human{  
void eat(){System.out.println("eating...");}  
}  
class parent extends human{  
void walk(){System.out.println("walking...");}  
}  
class child extends human{  
void talk(){System.out.println("talking...");}  
}  

  

public class hierarchicalinheritience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c= new child();  
		c.talk();  
		c.eat();  
		//c.walk();//C.T.Error  
		
	}

}
