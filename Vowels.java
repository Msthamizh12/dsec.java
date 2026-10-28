import java.util.*;

public class Vowels {
    public static void main(String[] args) {
    String s1="thamizhvanan";
    int Vowels=0,Consonants=0;
    for(int i=0;i<s1.length();i++){
      char ch=s1.charAt(i);
      if("aeiou".indexOf(ch)!=-1)
      Vowels++;
      else
      Consonants++;
      }
      System.out.println("Vowels:"+Vowels);
      System.out.println("Consonants:"+Consonants);
    }
}
