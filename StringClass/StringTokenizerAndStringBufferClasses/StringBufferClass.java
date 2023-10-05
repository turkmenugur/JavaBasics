package StringClass.StringTokenizerAndStringBufferClasses;

public class StringBufferClass {
    /* StringBuffer Sınıfı ile Bazı Metin İşlemleri */

    /* + operatörü kullanılarak string ifadeler ile ekleme işlemi yapabiliyorduk. Bu ekleme işleminde arkaplanda StringBuffer sınıfı kullanılır.
     * 
     * Bu ekleme işlemini yapan metod, StringBuffer sınfının append() metodudur.
     * 
     * Bu metod, object sınıfından overload edilmiştir ve tüm tipleri alabilir. 
    */

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Uğur");
        s.append("Türkmen");

        System.out.println(s);

        //Farklı tiplerde veri ekleme

        StringBuffer s2 = new StringBuffer("x");
        s2.append("--").append(55).append(5.2);
        System.out.println(s2);

        //indisleri verilen yere bir ifade ekleme
        StringBuffer s3 = new StringBuffer("Java");
        s3.append("dili"); //Java dili
        s3.replace(0, 4, "kotlin"); //0 ve 4.indisler yerine ekler
        System.out.println(s3);

        s3.insert(6, "programlama"); //6.indisten itibaren ekler
        System.out.println(s3);

        //silme ve metni tersine çevirme işlemleri
        StringBuffer s4 = new StringBuffer("Java");
        s4.append("basics");
        s4.delete(0, 4);
        System.out.println(s4); //silme işlemi yapar

        s4.reverse(); //metni tersine dönderir
        System.out.println(s4);


    }
}
