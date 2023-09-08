package OOP.ClassesAndObjects.StaticKeyword;

public class Person2 {
    //People sınıfından farklı bir sınıf

    public static void main(String[] args) {
        System.out.println("Başlangıçta kişi sayısı: " + Person.number);
        //number değişkenine sınıf adı ile eriştik

        Person person1 = new Person("Uğur", "Türkmen", "Erkek");
        Person person2 = new Person("Ali", "Türkmen", "Erkek");

        System.out.println("Nesneler oluşturulduktan sonraki kişi sayısı: "+person1.number);
    }
}
