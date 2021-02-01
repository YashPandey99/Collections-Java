import java.util.*; 
  
class typecastingGeneric { 
    public static void main(String[] args) 
    { 
        // Creating an ArrayList with String specified 
        ArrayList<String> al = new ArrayList<String>(); 
  
        al.add("Sachin"); 
        al.add("Rahul"); 
  
        // Retrieval can be easily 
        // without the trouble of casting 
        String s1 = al.get(0); 
        String s2 = al.get(1); 
    } 
} 