package OOP.ClassesAndObjects.Enumerations.EnumWithConstructor;

enum Cars2{
    CAMARO, TESLA, BMW, FORD;
    public int speed;
}

public class Enum2 {
    //enum içerisindeki değerleri kendimiz de verebiliriz
    public static void main(String[] args) {
        Cars2.CAMARO.speed = 200;
        Cars2.FORD.speed = 180;
        Cars2.TESLA.speed = 150;
        Cars2.BMW.speed = 190;

        System.out.println(Cars2.CAMARO.speed);
        System.out.println(Cars2.TESLA.speed);
        System.out.println(Cars2.BMW.speed);
        System.out.println(Cars2.FORD.speed);
    }
}
