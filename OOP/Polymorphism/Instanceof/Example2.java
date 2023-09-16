package OOP.Polymorphism.Instanceof;

class Class1{}
class Class2 extends Class1{}
class Class3 extends Class2{}


//Sınıflar, kalıtım yolu ile türetilmişse nasıl bir mantık olacak?
public class Example2 extends Class2{
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
        Class3 c3 = new Class3();
        Example2 c4 = new Example2();

        System.out.println(c1 instanceof Class2); //false
        System.out.println(c2 instanceof Class2); //true
        System.out.println(c3 instanceof Class1); //true
        System.out.println(c2 instanceof Class3); //false
        System.out.println(c3 instanceof Class1); //true
        System.out.println(c3 instanceof Class2); //true
        System.out.println(c4 instanceof Class2); //true
        System.out.println(c4 instanceof Class1); //true
    }
}

/* Bu örnekte temel mantık şu şekildedir. 
 * Örneğin; Example2'i Class2'den türettik. Class2'yi de Class1'den türettik.
 * Dolasıyla Example2'den oluşturacağımız bir nesne aynı zamanda Class1'in de bir örneğidir(instance).
*/

//Example6 -> Yukarıdaki sınıfların içlerinin dolu olduğu bir örnek içerir
