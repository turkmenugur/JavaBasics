package OOP.ClassesAndObjects.Enumerations.PrintEnumsWithForeach;

enum Cars4{
    CAMARO("Yellow"), FORD("Blue");
    public String color;
    Cars4(String color){
        this.color = color;
    }
}

public class Enum {

    public static void main(String[] args) {
        for(Cars4 car: Cars4.values()){
            System.out.println(car.name()+" - ");
            //System.out.println(car+" - "); bu şekilde de yazılabilirdi
            System.out.println(car.color);
        }
    }
}
