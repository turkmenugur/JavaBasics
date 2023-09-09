package OOP.Inheritance.FinalKeyword;

public class DefiningConstant {
    /* Final İle Sabit Tanımlama
     * 
     * final anahtar kelimesi ile tanımlanmış değişkenlerin değeri değiştirilemez. Bunlara sabitler denir.
     * 
     * final değişkenler ilk değeri atanmadan kullanılamazlar.
     * 
     * public final int x; //hatalı kullanım
     * public final int x=5; //doğru kullanım
     * 
     * Bu şekilde tanımlanmış değişkenlerin değeri ya tanımlandıkları ilk anda ya da yapıcılar içinde verilmelidir
     * 
     * Fakat metodlar içinde final tanımlarsak başka satırda ilk değeri verilebilir.
     * 
     * final anahtar kelimesi ile tanımlanmış değişkenlerin değeri programın herhangi bir yerinde değiştirilemez.
     * 
     * private final int x=5;
     * x=10; -> hatalı
    */

    private final int x;

    public DefiningConstant(int value) {
        x = value;
    }

    public void write(){
        System.out.println(x);
    }

    /* final değişkenler sınıf içerisinde tanımlandıkları gibi metod içerisinde de tanımlanabilir ve kullanılabilir. Eğer metod içerisinde tanımlarsak ilk değer atamasını metod içinde başka satırlarda da yapabiliriz. */

    public void metod(){
        final int a;
        a=10;

        //ilk değer atamasını başka satırda yapabiliriz ama yine metod içerisinde yapmak zorundayız
    }

    /* final değişkenler aynı zamanda static olabilir. Yani sınıfa ait bir değişken olabilir. Tüm sınıf ögeleri bu değişkeni ortak olarak kullanırlar ama değiştiremezler
     * 
     * public static final int x = 6; 
    */

    //final anahtar kelimesi ile yapacağımız tanımlamalarda değişken isimlerini büyük yapmak, bu değişkeni diğerlerinden ayırdığı için kodu okumada yarar sağlar.

}

