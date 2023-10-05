package StringClass;

public class StringClass {
    /*String sınıfı karakter birleşimleri yani kelimeler ve metinler üzerinde işlem yapmayı kolaylaştırmak için oluşturulmuştur 
     * String sınıfı java.lang kütüphanesi altında bulunur ve bize karakter dizileri üzerinde işlem yapmamızı kolaylaştıran zengin bir kütüphane sunar
     * Ayrıca String sınıfı metodları, immutable metodlardır. Yani bu sınıfın metodları değiştirilemez
     * String sınıfı miras alınarak yeni bir sınıf türetilemez
    */

    public static void main(String[] args) {
        char cArray[] = {'u','ğ','u','r'};
        String s1 = new String(cArray);
        String s2 = "TRKMN";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("*** length() ***");
        /* String nesnesinin uzunluğu */
        int a = s2.length();
        System.out.println("Length of string: " + a);
    
        /* Stringleri birleştirmek */
        System.out.println("*** Stringleri birleştirmek ***");
        // Stringleri birleştirmek için iki yol vardır. Birincisi + operatörü yardımıyla birleştirmek. İkincisi ise concat() metodu yardımıyla birleştirmek

        //Bir string ifadeyi bir değişkenle birleştirmek için de + operatörü kullanılır

        String name = "Uğur";
        String surname = "Türkmen";

        //+ operatörü ile string ifadeleri birleştirme
        String fullName = name+surname;
        System.out.println(fullName);

        //concat() metodu ile string ifadeleri birleştirme
        String fullName2 = name.concat(surname);
        System.out.println(fullName2);

        //concat() metodu, referans olarak aldığı String tipteki değişkeni çağrıldığı nesnenin içeriği ile birleştirilir.



    }
}
