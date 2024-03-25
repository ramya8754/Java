import java.util.*;
public class arrayExample {

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);

        }

        // int a[] = {12,34,5,6,4};
        // // System.out.println(a);
        // for(int i = a.length; i > 0; i--){
        //     System.out.print(a[i]);
        // }
      
        Scanner s = new Scanner(System.in);
        int b[] = new int[10];
        System.out.println("Enter 10 elemnt");
        for(int i = 0;i < 10 ; i++){
            b[i]= s.nextInt();
        }
        System.out.println("The element of array are");
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(b[i]);
        }



    }
}