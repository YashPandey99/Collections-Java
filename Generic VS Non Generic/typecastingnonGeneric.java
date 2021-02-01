import java.util.*; 
  
class typecastingnonGeneric { 
    public static void main(String[] args) 
    { 
        // Creating an ArrayList without any type specified 
        ArrayList al = new ArrayList(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
  
        // For every retrieval, 
        // it needs to be casted to String for use 
        String s1 = (String)al.get(0); 
        String s2 = (String)al.get(1); 
    } 
} 