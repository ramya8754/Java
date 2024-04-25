import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        int[] num = {1,4,0,0,4,0,5,0};
        int i = 0, j = 0 ;
        while(j < num.length){
            if(i < num.length -1 && num[i] != 0){
                i++;
                j++;
            }
            if(num[j] != 0){
                 int temp = num[i];
                num[i] = num[j];
                num[j]  = temp;
                i++;
                // j++;
            }
           
                j++;
        }
          System.out.println(Arrays.toString(num));
    }
}