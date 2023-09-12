package OOP.Abstraction.AbstractClasses.AbstractClassExample;

public abstract class GeometricShape {
    private String name;

    public void identifyName(String name){
        this.name = name;
    }

    public String accessName(){
        return this.name;
    }

    public abstract double calculateArea();
}
