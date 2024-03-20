import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("Ram", 25);
        hash.put("Sri", 30);
        hash.put("Abi", 35);
        System.out.println(hash);
        System.out.println("Age of John: " + hash.get("Sri"));

       
        hash.put("Sri", 26);
        System.out.println(hash);
        System.out.println("Updated age of John: " + hash.get("Sri"));

        
        hash.remove("Sri");
        System.out.println(hash);
        System.out.println("Jane's age removed. Contains Jane? " + hash.containsKey("Sri"));
    }
}
