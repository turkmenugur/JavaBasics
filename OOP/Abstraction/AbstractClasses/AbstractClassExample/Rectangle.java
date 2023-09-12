package OOP.Abstraction.AbstractClasses.AbstractClassExample;

public class Rectangle extends GeometricShape{
    private double longEdge;
    private double shortEdge;

    public void info(double longEdge, double shortEdge){
        identifyName("Rectangle object");
        this.longEdge = longEdge;
        this.shortEdge = shortEdge;
    }

    @Override
    public double calculateArea() {
        return longEdge * shortEdge;
    }
}
