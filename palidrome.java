import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=scan.nextInt();
      int reverse=0;
      int remainder=0;
      for(;n!=0;n=n/10){
        remainder=n%10;
        reverse =reverse*10+remainder;
      }
      System.out.println("reversed number:"+reverse);
      if(reverse==reverse){
        System.out.println("The number is palidrome");
      }else{
       System.out.println("The number is not palidrome");
      }
      }
    }
