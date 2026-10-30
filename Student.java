package oop;
        public class Student{
            String name;
            String dept;
            public Student(String name,String dept){
                this.name=name;
                this.dept=dept;
            }
        public void displayInfo(){
            System.out.println("Student name:"+this.name);
            System.out.println("Dept:"+this.dept);
        }
        public static void main(String args[]){
            Student s1=new Student("Thamizh","CSE");
            s1.displayInfo();
        }
    }
