package OOP.Polymorphism.Instanceof;

class A{
    public int aNumber = 5;
}

class B extends A{
    public int bNumber = 6;
}

class C extends B{
    public int cNumber = 7;
}

public class Example3 extends B{
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        Example3 d1 = new Example3();
        
        if(c1 instanceof A){
            System.out.println("c1 nesnesi A sınıfının elemanına erişebilir");
            System.out.println(c1.aNumber);
        }else{
            System.out.println("c1 nesnesi aNumber değişkenine erişemez");
        }

        if(b1 instanceof Example3)
            System.out.println("b1 nesnesi Example3 sınıfına erişebilir");
        else
            System.out.println("b1 nesnesi Example3 sınıfına erişemez");
    }
}

/* Bu örnekte, c1 nesnesi aynı zamanda A sınıfının bir örneği olduğu için if koşuluna girecektir. ve aNumber değişkenini yazdıracaktır.
 * b1 nesnesi ise Example3 sınıfının bir örneği olmadığı için else koşuluna girecektir
*/
