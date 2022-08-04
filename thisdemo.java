package demo2;

public class thisdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(24,"indra",5000f);
        Student s2=new Student(25,"uday",6000f);
        s1.display();
        s2.display();
        s1.n();
    }

}

class Student
{
    int rollno;
    String name;
    float fee;
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
    void n()
    {
        System.out.println("hello n");
   //m();//same as this.m()
        this.m();

	}

}
