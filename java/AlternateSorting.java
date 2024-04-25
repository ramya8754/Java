import java.util.*;
public class AlternateSorting {
public static void main(String[] args){
int[] arr= {1, 2, 3, 4, 5, 6, 7};
 alternateSort(arr);
 System.out.println(Arrays.toString(arr));
}
public static void alternateSort(int[] arr){
 Arrays.sort(arr);
 for(int i = 0 , j = arr.length- 1; i < j; i++,j--){
   int temp = arr[j];
   arr[j] = arr[i];
   arr[i] = temp;
   }
  }
}

