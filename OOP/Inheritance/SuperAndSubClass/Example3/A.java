package OOP.Inheritance.SuperAndSubClass.Example3;

public class A {
    public A(int a){
        System.out.println("Tek parametreli constructor: " + a);
    }

    public A(int a, int B){
        System.out.println("İki parametreli constructor");
    }

    //Birden fazla yapıcı var yani aynı method birden fazla yüklendiği için overloading oluyor
}
