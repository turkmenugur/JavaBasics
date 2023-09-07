package ClassesAndObjects;

public class ClassesAndObjects {

    static int value1 = 5; //sınıf değişkeni
    int value2; // nesne değişkeni

    static String color = "blue"; //sınıf değişkeni

    public static void main(String[] args) {
        ClassesAndObjects c1 = new ClassesAndObjects();
        ClassesAndObjects c2 = new ClassesAndObjects();

        System.out.println(c1.value1);
        System.out.println(c2.value1);

        ClassesAndObjects c3 = new ClassesAndObjects();
        ClassesAndObjects c4 = new ClassesAndObjects();

        c3.value2 = 10;
        c4.value2 = 12;

        System.out.println(c3.value2);
        System.out.println(c4.value2);


        System.out.println(ClassesAndObjects.color);
    }

    /*
        erisim_belirleyici class simif_ismi{
            //özellikler
            //metodlar
            //yapıcılar
        } 
    */

    /* Java'da bir sınıftan nesne oluşturmak için new anahtar kelimesi kullanılır 
     * 
     * Oluşturulan her nesne bellekte farklı bir alanda tutulur
     * Nesnelerin bellekte tutulduğu bölge heap alanıdır
     * Bu nesnelere o nesnelerin referansı ile erişebiliriz
     * Bir nesnenin birden fazla referansı olabilir
     * 
    */

    /* -Sınıf ve Nesne Değişkenleri-
     * Her nesnenin kendine ait olan değişkenlerine nesne değişkenleri denir
     * Bir de her nesne için ortak olarak kullanılan değişkenler vardır. Bunlara sınıf değişkenleri denir ve nesneden nesneye farklılık göstermezler
     * Sınıf değişkenlerini static anahtar kelimesi ile tanımlıyoruz
     * 
     * Yukarıdaki örnekte value2 değikenini static olarak tanımlasaydık sınıf nesnesi olacağı için her iki nesne için bu değer aynı olacak yani en son bu değişkene 12 değerini atadığımız için c3 nesnesi için de c4 nesnesi için de değişkenin değeri 12 olacaktı
     * 
     * Nesne değişkenleri dinamik değişkenler yani instance variable olarak da adlandırılırlar. sınıf değişkenleri ise static değişkenler olarak adlandırılırlar
     * 
     * Eğer nesne değişkeni tanımladıysak oluşturulan her nesne için bellekte bir yer ayrılır. Bu nesne değişkenlerinin değeri programın herhangi bir yerinde değiştirilebilir. Sınıf değişkenleri için bellekte sadece bir yer ayrılır.
     * 
     * Sınıf değişkenleri static olarak tanımlandığı için bu değişkenlere nesne oluşturmadan da sadece sınıf adını kullanarak erişebiliriz. Yani bunlar nesneden bağımsızdırlar
     * 
     * Sınıf değişkenleri program bittiğinde bellekten silinirler ve her program için yalnızca bir defa oluşturulurlar. Nesne değişkenleri ise nesne yok olduktan sonra bellekten silinirler.
    */

    /* PASS BY VALUE - PASS BY REFERENCE
     * (DEĞER VE REFERANS TİPLER)
     * 
     * Bir metoda parametre gönderdiğimizi var sayalım. Metod bu parametreyi 10 ile çarpıyor ve ekrana bir şeyler yazıyor. Peki metoddan çıktığımızda asıl değişkenin değeri değişiyor mu?
     * 
     * Primitive ve Referans tipler için cevap farklıdır. Primitive (int, double, byte...) tiplerde, o değeri metoda parametre olarak gönderdiğimizde, değerin kopyası gönderilir ve orijinal değeri bozulmaz. Referans tiplerde ise metoda değerin kendisi gönderilir. Metodda olan değişiklikler o değişkenin değerine de yansır. Bu konu değer ve referans tipler olarak bilinir.
     
    */

    /* CONSTRUCTOR (YAPICILAR)
     *
     * Sınıftan bir nesne oluşturulduğunda, derleyici otomatik olarak bir constructor(yapıcı) metod çağırır. Bu metod, oluşturulan her nesne için çağrılır.
     * Yapıcılar, ilk oluşturulduğunda alması gereken değerleri, kullanacağı metodları belirler.
     * 
     * Yapıcıların adı sınıf adı ile aynı olmak zorundadır.
     * Yapıcı metodlar geriye herhangi bir değer döndürmezler.
     * Yapıcı metodlar overloading (aşırı yükleme) yapılabilir.
     * 
     * Her sınıf için bir default constructor vardır. Bu default constructor'lar herhangi bir parametre almazlar. Eğer biz bunu kullanmak istemiyorsak, parametre alan bir yapıcı kullanmak istiyorsak kendimiz bir yapıcı metod yazmamız gerekir. 
    */
}
