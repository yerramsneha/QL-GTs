package opps;

public class inheritancedemo {

	public static void main(String[] args) {
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
		
			      Rectangle rect = new Rectangle();
			      rect.display();
			      rect.area();
			   }
		

	}


