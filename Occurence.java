import java.util.*;
public class Occurence {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a[]={10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,20};
      int key,count=0;
       System.out.println("Enter the elements to target:"+count);
       key=sc.nextInt();
       for(int i=0;i<a.length;i++){
        if(a[i]==key){
          count++;
        }
        if(count>0){
         System.out.println("Element found");
         System.out.println(" First Occurence:"+count);
        }else{
          System.out.println("Element is not found");
           System.out.println("Last Occurence:"+count);
        }
       }
    }
}
