package OOP.Polymorphism.Instanceof;

class B{}
class C{}

public class Example1 {
    public static void main(String[] args) {
        C a1 = new C();
        B b1 = new B();
        System.out.println(a1 instanceof C); //true
        System.out.println(b1 instanceof B); //true
    }

    /* Bu örnekte main metodunda A sınıfından a1 nesnesini, B sınıfından b1 nesnesini oluşturduk.
     * Bu b1 nesnesi A sınıfından oluşturulmamıştır.
     * Alt satırlarda da her iki çıktı, true değerini verecektir.
     * Çünkü a1 ve b1 nesneleri insstanceof kelimesinden sonraki yazılmış sınıflardan türetilmişlerdir.
     * 
    */
}
