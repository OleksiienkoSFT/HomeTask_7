package Lesson_7;
public class Date {
    String name;
    short Age;
    int Long;

    public Date (String N, short A, int L){
        this.Age = A;
        this.name = N;
        this.Long = L;
    }
    public Date (short A, String N,  int L){
        this.Age = A;
        this.name = N;
        this.Long = L;
    }
    public Date (String N, int L, short A ){
        this.Age = A;
        this.name = N;
        this.Long = L;
    }
    public Date ( short A, int L, String N){
        this.Age = A;
        this.name = N;
        this.Long = L;
    }

    public Date (int L, String N, short A ){
        this.Age = A;
        this.name = N;
        this.Long = L;
    }

    public Date ( int L, short A,  String N){
        this.Age = A;
        this.name = N;
        this.Long = L;
    }
}

// Сайт знайомств
//Ви створюєте базу даних користувачів для сайту знайомств.
//
//Проблема — ви забули в якому порядку їх потрібно вказувати, а технічного завдання під рукою немає.
//
//Спроектуйте клас User, який матиме поля — ім'я (String) вік (short) і зріст(int).
//
//Створіть необхідну кількість конструкторів, щоб ім'я, вік і зріст можна було вказувати в будь-якому порядку.