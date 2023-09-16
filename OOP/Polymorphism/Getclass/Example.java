package OOP.Polymorphism.Getclass;

class A{}
class B{}

public class Example extends B{
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        Example example = new Example();
        System.out.println(example.getClass().equals(A.class));
        System.out.println(b1.getClass().equals(A.class));
        System.out.println(a1.getClass().equals(A.class));
        System.out.println(a1.getClass());
        System.out.println(b1.getClass());
        System.out.println(example.getClass());
    }
}

/* example.getClass() diyerek example'ın olduğu sınıfı elde ediyoruz. equals() metodunun içerisine de karşılaştıracağımız sınıfı yazıyoruz.
 * Metodun içerisine yazdığımız ifadeyi sınıfadı.class yapısı ile yazıyoruz.
 * Eğer aynı sınıflardansa true değerini, değilse false değerini elde ediyoruz.
 * 
 * Yalnız başına getClass() metodu ise çıktılardaki son satırlarda da gördüğümüz gibi sınıfın adını veriyor. Bunu paket adı ile beraber yazarak bize veriyor.
 */

 /* Java'da tüm sınıflar Object sınıfından türediği için herhangi bir nesnemiz aynı zamanda Object sınıfının bir örneğidir. Dolayısıyla bir alt sınıf, aynı zamanda tüm üst sınıflarının bir örneği sayılır. Fakat üst sınıflardan oluşturulan nesneler, alt sınıfların bir örneği sayılmazlar. */
