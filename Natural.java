import java.util.*;
public class Natural{
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int n,evensum=0,oddsum=0;
      System.out.println("Enter the number");
      n=scan.nextInt();
      for(int i=0;i<=n;i++){
        if(i%2==0){
        evensum+=i;
         } else {
          oddsum+=i;
         }
         System.out.println("Sum of even number:"+evensum);
         System.out.println("Sum of odd number:"+oddsum);
      }
    }
}
