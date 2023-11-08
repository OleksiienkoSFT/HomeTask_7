package Lesson_7;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        Artifact artifact = new Artifact (2, "Acteky", 222);
        Artifact artifact1 = new Artifact(3);
        Artifact artifact2 = new Artifact(1, "Skify");
        System.out.println(artifact.Age + ", " + artifact.Num + ", " + artifact.Cult);

        // Task 2
        System.out.println();
        System.out.println("Task 2");
        Date date = new Date((short) 2,5,"Joi");
        System.out.println(date.Age + ", " + date.Long + ", " + date.name);

        // Task 3
        System.out.println();
        System.out.println("Task 3");
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.model = "IPhone";
        phone1.number = 55555555;
        phone1.weight = 90;
        System.out.println(phone1.model + ", " + phone1.weight + ", " + phone1.number);
        phone1.receiveCall("Valerii");

        System.out.println(phone1.getNumber());

        phone2.receiveCall("Simens", 95864123);

        Phone.sendMessage(1111111,2222222,3333333,4444444,555555,66666666);


        // Task 4
        System.out.println();
        System.out.println("Task 4");
        Person person = new Person();
        Person person1 = new Person("Luiza Lopes", 25);
        person1.move();
        person.talk();


        // Task 5
        System.out.println();
        System.out.println("Task 5");
        Reader.returnBook(5);
        Reader.takeBook(3);
        Reader.takeBook("Пригоди","Словник", "Енциклопедія");
        Reader.returnBook("Пригоди","Словник", "Енциклопедія");
        Book book1= new Book("Oskar", "White", "Big trip");
        Book book2= new Book("Oskar", "White", "Big trip2. Last survive");
        Reader.takeBook(book2,book1);

    }
}
