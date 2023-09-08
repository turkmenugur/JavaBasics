package OOP.ClassesAndObjects.StaticKeyword;

public class Person {
    
    private String name; //nesne değişkeni
    private String surname; //nesne değişkeni
    private String gender; //nesne değişkeni
    public static int number = 0; //sınıf değişkeni

    public Person(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        number++; //static değişkenin değeri arttırıldı
    }

    
}
