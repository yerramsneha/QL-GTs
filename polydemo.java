package oops;

public class polydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Animal();
        Animal mypig = new Pig();
        Animal mydog = new Dog();
        myAnimal.animalsound();
        mypig.animalsound();
        mydog.animalsound();
	}

}
class Animal {
    public void animalsound() {
        System.out.println(" The animal makes a sound");

    }
}

class Pig extends Animal {
  public void animalsound() {
      System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalsound() {
      System.out.println("The dog says: bow bow");

  }
}
