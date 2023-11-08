package Lesson_7;

public class Reader {
    String PIB;
    int NumberTicket;
    String Facultet;
    short BirthDate;
    int PhoneNumber;

    public static void takeBook (){ }

    public static void returnBook(){ }

    public static void takeBook (int a){
        System.out.println("Петров В.В. взяв  - " + a + " книг.");
    }
    public static void takeBook (String ... arr){
        System.out.print("Петров В.В. взяв книги: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void takeBook (Book ... arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].BookName);
        }
    }
   public static void returnBook (int a){
       System.out.println("Петров В.В. повернув  - " + a + " книг.");
   }
    public static void returnBook (String ... arr){
        System.out.print("Петров В.В. повернув книги: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

}
// Визначити клас Reader, який зберігає таку інформацію про користувача бібліотеки:
//
//ПІБ,
//номер читацького квитка,
//факультет,
//дата народження,
//телефон.

//Методи takeBook(), returnBook().
//Розробити програму, у якій створюється масив об'єктів цього класу.
//Перевантажити методи takeBook(), returnBook():
//- takeBook, який прийматиме кількість взятих книг. Виводить на консоль повідомлення "Петров В. В. взяв 3 книги".
//takeBook, який прийматиме змінну кількість назв книг. Виводить на консоль повідомлення "Петров В. В. взяв книги: Пригоди, Словник, Енциклопедія".
//- takeBook, який прийматиме змінну кількість об'єктів класу Book (створити новий клас, що містить ім'я та автора книги). Виводить на консоль повідомлення "Петров В. В. взяв книги: Пригоди, Словник, Енциклопедія".
// Аналогічно перевантажити метод returnBook(). Виводить на консоль повідомлення "Петров В. В. повернув книги: Пригоди, Словник, Енциклопедія". Або "Петров В. В. повернув 3 книги".