public class Student{
  String name;
  String dept;
  int mark;
  int age;
  public Student(String name,String dept,int mark,int age){
     this.name=name;
    this.dept=dept;
    this.mark=mark;
    this.age=age;
  }
        public void displayInfo(){
            System.out.println("Student name:"+this.name);
            System.out.println("Dept:"+this.dept);
            System.out.println("mark:"+this.mark);
            System.out.println("age:"+this.age);
  }
  public static void main(String args[]){
            Student s1=new Student("Thamizh","CSE",100,19);
            s1.displayInfo();
        }
}
