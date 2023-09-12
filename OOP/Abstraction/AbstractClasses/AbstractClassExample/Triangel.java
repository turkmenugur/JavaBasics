package OOP.Abstraction.AbstractClasses.AbstractClassExample;

public class Triangel extends GeometricShape{
    private double height;
    private double base;

    public void info(double height, double base){
        identifyName("Triangle object");
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
       return (base * height) / 2;
    }
    
}
