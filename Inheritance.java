package FunRun;

class Animal {
	String type;
	int age;
	String eyesColor;
	String furColor;
	int totalCount;
	String favouriteFood;
}

class Cat extends Animal 
{
	type = "pet";
	age = 4;
	eyesColor = "Blue";
	furColor = "White";
	totalCount = 2;
	favouriteFood = "Mouse, Fish";
	String name = "Billy";
}

public class Inheritance extends Cat{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		System.out.println(cat.name);
		System.out.println(cat.eyesColor);
		System.out.println(cat.furColor);
		System.out.println(cat.age);
	}

}
