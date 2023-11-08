package Lesson_7;

public class Artifact {
    int Num;
    String Cult;
    int Age;
    public Artifact (int Number){
        this.Num = Number;
    }
    public Artifact (int Number, String Culture){
        this.Num = Number;
        this.Cult = Culture;
    }
    public Artifact (int Number, String Culture, int AgeAertef ) {
        this.Num = Number;
        this.Cult = Culture;
        this.Age = AgeAertef;
    }
}
// Музей давнини.
//Завдання – спроектувати клас Artifact.
//
//Артефакти, що зберігаються у музеї, бувають трьох видів.
//
//Перший - про які невідомо нічого, крім порядкового номера, присвоєного музеєм (наприклад: 212121).
//Другий – про які відомий порядковий номер та культура, якою він був створений (наприклад: 212121, "Ацтеки").
//Третій вид - про які відомий порядковий номер, культура, якою він був створений, і точний вік його створення (наприклад: 212121, "Ацтек", 12).
//
//Створи клас Artifact, що описує старовини, що зберігаються в музеї, і напиши необхідну кількість конструкторів для нього. У методі main() створи по одному артефакту кожного виду.