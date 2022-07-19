package presentation;
 class employee //single_inheritance
{
	int salary=40000;
	}

   class programmer extends employee 
{
	int bonus =10000;
	 public static void main(String[] args) 
	 {
	 programmer pr=new programmer();
	 System.out.println("programmer salary is "+pr.salary);
	 System.out.println("bonus of porgrammer is "+pr.bonus);
	 }
 }


