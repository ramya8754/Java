import java.util.*;
public class ArrayList1 {
   public static void main(String[] args) {
     String[] arr = {"a" , "b" , "c", "d", "a" , "b"};
     System.out.println(arr);
     
     ArrayList<String> arrList =  new ArrayList<String>(Arrays.asList(arr));
     System.out.println(arrList);

     LinkedHashSet<String> list = new LinkedHashSet<String>(arrList);
     System.out.println(arrList);
     list.add("A");
     list.add("B");
     list.add("C");
     list.add("A");
     System.out.println(arrList);

     HashMap<String, String> map = new HashMap<String, String>();
     map.put("name", "Ramya");
     map.put("class", "Java");
     System.out.println(map);

     HashSet<String ,String> set = new HashSet<>();
     set.put ("name", "abi");
     set.put("name", "sri");
     System.out.println(set);
     
   }
}