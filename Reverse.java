import java.util.*;
public class Reverse {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int n=1234;
      int reverse=0;
      int remainder=0;
      for(;n!=0;n=n/10){
        remainder=n%10;
        reverse =reverse*10+remainder;
      }
      System.out.println("Reversed number:"+reverse);
      }
    }
