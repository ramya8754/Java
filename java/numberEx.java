import java.util.*;
public class numberEx{
    public static void main(String[] args){
        int n = 5;
int i = 0 ; j = 0;
        int mid = (n+1)/2;
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i < mid){
                    System.out.print(n-i-1);
                   }
                  else{
                    System.out.print(i);
                 }
              }
             if(i + j == n + 1){
                    if( i < mid){
                        System.out.print(i);
                    }
                    else{
                        System.out.print(j);
                    }
                }
            else{
                 System.out.print(" ");
                }
             }
        System.out.println(" ");
    }
}