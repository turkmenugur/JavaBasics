package OOP.ClassesAndObjects.Enumerations.EnumWithConstructor;

import OOP.ClassesAndObjects.Car;

enum Cars{

    TESLA(150), CAMARO(200), BMW(180), FORD(190); //enum elemanlarına değer verdik

    public int speed;

    private Cars(int speed) { //enum yapıcısı public olamaz
        this.speed = speed;
    }
    
}

public class Enum {
    public static void main(String[] args) {
        System.out.println(Cars.CAMARO.speed);
        System.out.println(Cars.TESLA.speed);
        System.out.println(Cars.BMW.speed);
        System.out.println(Cars.FORD.speed);
    }
}

/* Enum içerisindeki yapıcılar public olamaz ve enumlar bir sınıftan türetilemezler (miras alamazlar) */
