package OOP.ClassesAndObjects;

public class Car {
    String brand, color; //durum

    void speedUp(){ //davranış
        System.out.println("car accelerating");
    }

    void speedDown(){ //davranış
        System.out.println("car slowing downn");
    }

    public static void main(String[] args) {
        Car c1 = new Car() //Car sınıfından c1 adında nesne oluşturuldu
        c1.brand = "Chevrolet Camaro"; //nesnenin markası belirlendi
        c1.color = "Yellow Black"; //nesnenin rengi belirlendi

        c1.speedUp(); //c1 nesnesinin speedUp isimli metodu çağırıldı
        c1.speedDown(); //c1 nesnesinin speedDown isimli metodu çağırıldı
    }


}
