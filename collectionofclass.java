package Collectionoffreamework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionofclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> destination_List = new ArrayList<>();
		
		destination_List.add("Shoes");
        destination_List.add("Toys");
        destination_List.add("Horse");
        destination_List.add("Tiger");
        
        System.out.println(
                "The Original Destination list is ");
     
            for (int i = 0; i < destination_List.size(); i++)
            {
                System.out.print(destination_List.get(i) + " ");
            }
            System.out.println();
            
            List<String> source_List = new ArrayList<>();
            
            source_List.add("Bat");
            source_List.add("Frog");
            source_List.add("Lion");
     
            Collections.copy(destination_List, source_List);
            
            System.out.println("The Destination List After copying is ");
         
                for (int i = 0; i < destination_List.size(); i++) 
                {
                    System.out.print(destination_List.get(i) + " ");
                }
	}

}
