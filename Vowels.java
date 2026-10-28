import java.util.*;

public class Vowels {
    public static void main(String[] args) {
      String s1="dhanusha";
      int v=0;
      int c=0;
      for(int i=0;i<s1.length();i++){
        char ch=s1.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          v++;
        }else{
          c++;
        }
      }
      System.out.println("Vowels:"+v);
      System.out.println("Consonants:"+c);
}
}
