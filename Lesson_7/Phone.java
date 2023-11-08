package Lesson_7;

public class Phone {
    int number;
    String model;
    int weight;
    public void receiveCall (String name){
        System.out.println("Вам телефонує " + name);
    }

    public void receiveCall (String model, int num){
        System.out.println("Вам телефонує " + model + ", " + num);
    }

    public int getNumber(){
        return this.number;
    }
    public Phone(int Num, int Weight, String Name){
        this.number = Num;
        this.weight = Weight;
        this.model = Name;
    }
    public Phone(int Num,  String Name){
        this.number = Num;
        this.model = Name;
    }
    public Phone(){
    }

    public static void sendMessage ( int ... arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Number of phone is  - " + arr[i]);
        }
    }
}
// Створіть клас Phone, який містить змінні number, model і weight.
//Створіть три екземпляри цього класу.
//Виведіть на консоль значення їх змінних.
//Додати в клас Phone методи: receiveCall, має один параметр - ім'я. Виводить на консоль повідомлення "Телефонує {name}". Метод getNumber повертає номер телефону. Викликати ці методи кожного з об'єктів.
//Додати конструктор у клас Phone, який приймає на вхід три параметри для ініціалізації змінних класу – number, model та weight.
//Додати конструктор, який приймає на вхід два параметри для ініціалізації змінних класу – number, model.
//Додати конструктор без параметрів.
//Створіть три екземпляри цього класу з параметрами
//Додайте перевантажений метод receiveCall, який приймає два параметри - ім'я телефону та номер телефону телефону. Викликати цей метод.
//Створити метод sendMessage з аргументами змінної довжини. Цей метод приймає на вхід номери телефонів, яким буде надіслано повідомлення. Метод виводить на консоль номери цих телефонів.