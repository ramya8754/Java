import java.util.*;
class ArrayMergeEx{
    public static void main(String[] args) {
        int[] arr1 =  {2,4,5,6,7,9,10,13};
        int[] arr2 = {2,3,4,5,6,7,8,9,11,15};
        List<Integer> mergeArray =  new ArrayList<>();
       int i = 0 , j = 0;
       while(i < arr1.length && j < arr2.length){
           if(arr1[i] < arr2[j]){
               mergeArray.add(arr1[i]);
               i++;
           }
           else if(arr1[i] > arr2[j]){
               mergeArray.add(arr2[i]);
               j++;
           }
           else{
               mergeArray.add(arr1[i]);
               i++;
               j++;
           }
       }
//   while(i < arr1.length){
//       mergeArray.add(arr1[i]);
//       i++;
//   }
//   while( j < arr2.length){
//       mergeArray.add(arr2[j]);
//       j++;
//   }
   System.out.print(mergeArray);
    }
}