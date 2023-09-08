package OOP.ClassesAndObjects.Enumerations.SimpleEnum;


enum Animals{
    CAT, DOG, SNAKE, RABBIT
}

//Enum elemanlarının arasına virgül koyulur

public class Enum {
    public static void main(String[] args) {
        System.out.println(Animals.CAT);
        System.out.println(Animals.DOG);
        System.out.println(Animals.SNAKE);
        System.out.println(Animals.RABBIT);
    }

    //enum içerisindeki elemanlara enum adı ile erişebiliyoruz. Bu enum içerisindeki elemanlara değerler de verebiliriz.
}
