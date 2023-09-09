package OOP.Inheritance.MethodOverriding.ToStringMethod.Example2;

public class Shape {
    int corner;
    int diagonal;
    int interiorAngle;

    Shape(int corner){
        this.corner = corner;
        diagonal = (corner*(corner-3)) / 2;
        interiorAngle = (180*(corner-2)) / corner;
    }

    @Override
    public String toString(){
        //toString metodu override edildi

        return corner + " köşeli düzgün geometril şeklin " + diagonal + " adet köşegeni vardır. Bir iç açısı ise " + interiorAngle + " derecedir.";
    }

    public static void main(String[] args) {
        Shape gShape = new Shape(8);
        System.out.println(gShape); //nesne yazdırılıyor
        String s = "Sekizgen: " + gShape;
        System.out.println(s);
    }
}
