package coreJava;

class Person{
  int pid;
  int age;
  String name;

  private Person(){
    System.out.println("creating a person object");
  }

  public Person(int pid){
    this();
    this.pid = pid;
  }

  public Person(int pid, int age, String name){
    this(pid);
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString(){
    return "person : pid " + pid + " age : " + age + " name : " + name; 
  }
}

class Student extends Person{
  int rollno;

  public Student(int pid, int age, String name, int rollno){
    super(pid, age, name);
    this.rollno = rollno;
  }

  public String toString(){
    return "student : pid " + pid + " age : " + age + " name : " + name + " rollno : " + rollno; 

  }

}

public class B1_ConstructorSuper {

  public static void main(String[] args) {
    
  Student s1 = new Student(1, 15, "Aman", 1);
  Student s2 = new Student(2, 14, "anand", 2);
  
  System.out.println(s1);
  System.out.println(s2);
  }
}
