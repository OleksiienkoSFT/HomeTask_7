package Lesson_7;

public class Person {
    String fullName;
    int age;
    public   void move(){
        System.out.println("Такий Person іде.");

    }
    public   void talk(){
        System.out.println("Такий Person говорить.");
    }
    public Person(){}
    public Person(String fullName, int age){
        this.age = age;
        this.fullName =fullName;
    }
}
