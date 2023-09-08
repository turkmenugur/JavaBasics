package OOP.ClassesAndObjects.Enumerations.EnumWithConstructor;

//enum içerisindeki elemanlar sadece int tipinde değer almazlar. Bu örnekte String alıyorlar

enum Cars3{
    CAMARO("Yellow"), FORD("Blue");
    public String color;
    Cars3(String color){ //Constructor string tipinde parametre aldı
        this.color = color;
    }
}
public class Enum3 {
    public static void main(String[] args) {
        System.out.println(Cars3.CAMARO.color);
        System.out.println(Cars3.FORD.color);
    }
}
