package OOP.Inheritance.SuperAndSubClass.Example3;

public class B extends A{
    public B(){
        super(4, 7); //iki parametreli constructor çağırıldı
        System.out.println("B'nin yapıcısı");
    }

    public static void main(String[] args) {
        B nesne = new B();
    }
}
