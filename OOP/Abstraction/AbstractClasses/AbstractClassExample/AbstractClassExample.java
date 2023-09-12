package OOP.Abstraction.AbstractClasses.AbstractClassExample;

public class AbstractClassExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangel triangel = new Triangel();

        circle.info(5.0);
        System.out.println(circle.accessName() + ": ");
        System.out.println(circle.calculateArea());

        rectangle.info(5.0, 3.0);
        System.out.println(rectangle.accessName() + ": ");
        System.out.println(rectangle.calculateArea());

        triangel.info(4.0, 3.0);
        System.out.println(triangel.accessName() + ": ");
        System.out.println(triangel.calculateArea());
    }
}
