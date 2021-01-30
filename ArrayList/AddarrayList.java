import java.util.ArrayList;
import java.util.List;

/**
 * AddarrayList
 */
public class AddarrayList {

    public static void main(String[] args) {
        List <String> obj = new ArrayList<>();
        obj.add("Yash");
        obj.add(0,"Lokesh");
        List <String> obj2 = new ArrayList<>(obj);
        System.out.println(obj2);
        
    }
}