package FunRun;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {123, 456, 789, 234, 456, 678};  //Custom
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
   
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }

        int sum = 0;  
     
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("\n"+"\n"+"\n" + "Sum of all the elements of an array: " + sum);  
	}

}
