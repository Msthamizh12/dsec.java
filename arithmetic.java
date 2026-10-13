public class Main {
    public static void main(String[] args) {
      int d=4758;
      int num=0;
      num=num+d%10;
      d=d/10;
      num=num+d%10;
      d=d/10;
      num=num+d%10;
      d=d/10;
      num=num+d;
      System.out.println(num);
    }
}
