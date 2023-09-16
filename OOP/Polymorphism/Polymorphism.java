package OOP.Polymorphism;

public class Polymorphism {
    /* Polymorphism yani çok biçimlilik, kalıtım kavramıyla iç içedir.
     * Kalıtım konusunda, türetilen sınıflar türetdiği üst sınıfın öğelerine sahip oluyorken bunun tersi geçerli değildi. Yani temel sınıflar, alt sınıfların üyelerine sahip olamazlar.
     * 
     * Polymorphism çoklu biçim veya çoklu şekil anlamına gelir.
     * Yani polymorphism yapılarak bir nesne, farklı nesneler gibi davranabilir.
     * Bir nesne, farklı sınıflardan oluşmuş nesneleri yüklenebilir.
    */

    /* Polimorfizm yaparken hangi nesnenin metodunun çağırılacağı, çalışma alanında belirlenir. 
     * Çünkü program çalıştığında nesneyi kullanacak olan metoda parametre göndeririz.
     * Derleme anında bu metodun hangi nesneyi kullanacağı belli değildir.
    */

    /* Geç Bağlama
     * Example1 ve Example2'deki örneklerde metodlara parametre olarak nesne gönderdik ve bu çağırılan metodların hangi nesne üzerinden çalıştırılacağını Java belirledi.
     * Buna 'geç bağlama' diyoruz. Yani bu bağlama işlemi çalışma zamanında belli olmuştu.
     * Fakat çalışma zamanında değil de derleme zamanında belli olmuş olsaydı buna da 'erken bağlama' diyecektik.
     * Biz bu konuda geç bağlama'yı ele alacağız.
     * 
     * Örnek olarak rastgele sayıları verelim. Rastgele sayo üreten bir program olsun. Bu rastgele sayılar derleme anında oluşturulmaz. Programı çalıştırdığımızda ancak bu rastgele olan sayılar üretilmeye başlar. Geç bağlamada da mantık bu şekildedir. Eğer rastgele olarak bir nesne üretir ve bu nesneleri de metoda gönderirsek, çağırılan metodun hangi nesne üzerinden çağırılacağı çalışma anında belli olur.
     * Example3'te 'Geç Bağlama' konusuna bir örnek verilmiştir.
    */

    /*InstanceOf -> Bu anahtar kelime, nesnelerin hangi sınıftan oluşturulduğunu bulmaya yardımcı oluyor.
     * (Polimorfizm sayesinde bu anahtar kelimeyi kullanmaya gerek kalmadı)
     *
     */
}
