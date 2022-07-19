package classes;

public class THIS {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
           Student s1=new Student(111,"ankit",5000f);
           Student s2=new Student(112,"Sumit",6000f);
           s1.display();
           s2.display();
           
           
	}

}

//=======================================================

class Student
{
	int rollno;
	String name;
	Float fee;
	Student(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
	
	void m()
	{
		System.out.println("hello m");
	}
}

