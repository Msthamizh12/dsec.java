import java.util.*;

public class Seprate {
    public static void main(String[] args) {
      int arr[]={1,2,3,6,5,4,7,8,9,10,11,12};
      System.out.println("Even:");
      for(int num:arr){
        if(num%2==0){
          System.out.println(num+" ");
        }
        }
        System.out.println("\nOdd:");
        for(int num:arr){
          if(num%2!=0)
          System.out.println(num+" ");
        }
      }
    }
