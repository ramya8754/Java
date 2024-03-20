import java.util.*;
public class ArrayList2 {
   public static void main(String[] args) {
     String[] arr = {"a" , "b" , "c", "d", "a" , "b"};
     System.out.println(arr);

     // List
     ArrayList<String> arrList =  new ArrayList<String>(Arrays.asList(arr));
     System.out.println(arrList);
     // LinkedLish
     LinkedList<String> linkedlist =  new LinkedList<String>(Arrays.asList(arr));
     System.out.println(linkedlist);

     //MAP
     HashMap<String, Integer> hashMap = new HashMap<>();
       hashMap.put("Ram", 25);
        hashMap.put("Sri", 30);
        System.out.println(hashMap);
     
    LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>();
    linkedhashmap.put("Ram", 30);
    linkedhashmap.put("Sri", 35);
    System.out.println(hashMap);
    // tree MAp
   // set
   HashSet<String ,String> set = new HashSet<>();
     set.put ("name", "abi");
     set.put("name", "sri");
     System.out.println(set);
     //linkedhashset
     LinkedHashSet<String ,String> linkset = new LinkedHashSet<>();
     set.add ("name", "ramya");
     set.add("class", "java");
     System.out.println(linkset);
     //treeset
     
   }
}