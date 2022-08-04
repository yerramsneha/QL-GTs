package testRun;

class Employee{
    int EmpID;
    String name;
    float salary;
    public void display(){
        System.out.println("Name" + "\t" + "ID" + "\t" + "Salary");
    }
}

public class funRun extends Employee{

	public static void main(String[] args) {
	    Employee emp[] = new Employee[5];
	    emp[0] = Employee(001, "Cat", 5000);
	    emp[1] = Employee(002, "Dog", 6000);
	    emp[2] = Employee(003, "Lion", 7000);
	    emp[3] = Employee(004, "Elephant", 5000);
	    emp[4] = Employee(005, "Monkey", 5000);
	    
       for(Employee key : emp){
            if(key.salary >= 5000){
                key.display();
            }
        }
	}

	private static Employee Employee(int i, String string, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}



