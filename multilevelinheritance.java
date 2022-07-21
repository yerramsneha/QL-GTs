package Inheritance;

public class multilevelinheritance 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	}
}
class Shape {
    public void display() {
       System.out.println("Inside display");
    }
 }
 class Rectangle extends Shape {
    public void area() {
       System.out.println("Inside area");
    }
 }
 class Cube extends Rectangle {
    public void volume() {
       System.out.println("Inside volume");
    }
 }
 class tester {
    public static void main(String[] arguments) {
       Cube cube = new Cube();
       cube.display();
       cube.area();
       cube.volume();
    }
 }