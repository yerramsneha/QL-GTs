package Array;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Classofcollection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        List<String> list1 = new ArrayList<String>();
        list1.add("C");
        list1.add("Core Java");
        list1.add("Advance Java");
        
        System.out.println("Initial collection value:" +list1);
        Collections.addAll(list1, "Servlet","JSP");
        
        System.out.println("After adding elements collection value:" +list1);
        String[] strArr = {"C#", ".Net"};
        
        Collections.addAll(list1, strArr);
        System.out.println("After adding array collection value:" +list1);
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(46);
        list.add(67);
        list.add(24);
        list.add(16);
        list.add(8);
        list.add(12);
        System.out.println("value of maximum element from the collection: " + Collections.max(list));
        System.out.println("value of maximum element from the collection: " + Collections.min(list));
           
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        
        System.out.println("sorting in reverse order");
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        System.out.println(list1);
        Collections.sort(list,Collections.reverseOrder());
        
	}

}
