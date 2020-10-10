import java.util.*; 
  
public class JoinTwoArrayList { 
    public static void main(String args[]) 
    { 
  
        // Get the ArrayList1 
        ArrayList<String> 
            list1 = new ArrayList<String>(); 
  
        // Populate the ArrayList 
        list1.add("Live"); 
        list1.add("Laugh"); 
        list1.add("Love"); 
  
        // Print the ArrayList 1 
        System.out.println("ArrayList 1: "
                           + list1); 
  
        // Get the ArrayList2 
        ArrayList<String> 
            list2 = new ArrayList<String>(); 
  
        list2.add("Beginner"); 
        list2.add("Programming Aspirant"); 
  
        // Print the ArrayList 2 
        System.out.println("ArrayList 2: "
                           + list2); 
  
        // Join the ArrayLists 
        // using Collection.addAll() method 
        list1.addAll(list2); 
  
        // Print the joined ArrayList 
        System.out.println("Joined ArrayLists: "
                           + list1); 
    } 
} 



