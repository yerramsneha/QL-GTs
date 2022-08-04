package interfacedemo;

 interface drawable {

public	static void draw1() {
		// TODO Auto-generated method stub
		
}
		public static void draw() { 
							}  
							//Implementation: by second user  
							class Rectangle implements drawable{  
							public void draw(){System.out.println("drawing rectangle");}  
							}  
							class Circle implements drawable{  
							public void draw(){System.out.println("drawing circle");}  
							}  
							//Using interface: by third user  
							class testinference1{  
							public void main(String args[]){  
							Circle drawable = new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
							drawable.draw();  
							}  
					}
		

			
	}

