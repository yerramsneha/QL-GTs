package oops;

public class superdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
        d.animalsound();

	}

}
class Animal { // Superclass (parent)
    String color = "black";
    public void animalsound() {
        System.out.println("The animal makes a sound");         
    }
    Animal()
    {
        System.out.println("Hello i am from constructor");
    }
}
     class Dog extends Animal
     { //Subclass (child)
         Dog()
         {
             super();
             System.out.println("This is call from child constructor");
         }
         public void animalsound()
         {
             super.animalsound(); // call the superclass method
             System.out.println("The dog says: bow bow");
             System.out.println(super.color);

         }
     }