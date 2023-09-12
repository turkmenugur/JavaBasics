package OOP.Abstraction.AbstractClasses.AbstractClassExample;

public class Circle extends GeometricShape{
    private double radius;
    private double pi = Math.PI;

    public void info(double radius){
        identifyName("Circle object");
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return pi * Math.sqrt(radius);
    }
    
}
