package OOP.Polymorphism.Instanceof;


//instanceof anahtar kelimesi ile bir değişkenin ait olduğu sınıfı şu şekilde karşılaştırabiliriz: 

public class Example4 {
    public static void main(String[] args) {
        String string = "Java notes";
        System.out.println(string instanceof java.lang.String);
    }
}

/* String bir sınıf olduğu için string adlı değişken aslında String sınıfından türemiştir.
 * Karşılaştırırken ise java.lang.String şeklinde sınıfı yazıyoruz.
 * 
 * Aynı şekilde aşağıdaki gibi bir karşılaştırma da yapabiliriz. Bu da true değeri döndürecektir.
 * String haricindeki değiken tiplerimizi aşağıdaki gibi tanımlamak zorundayız.
 * Çünkü String sınıfı diğer tiplerden farklıdır.
 * Yukarıda String değişken tanımlamıştık fakat. Fakat String haricindeki değişkenleri 'new' ile nesne oluşturarak yapmalıyız
 * 
 * public class Example4 {
    public static void main(String[] args) {
        Integer i = new Integer(4);
        System.out.println(i instanceof java.lang.Integer);
    }
}
*/
