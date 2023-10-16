package ExceptionHandlingConcept;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionNotes {
    /* İstisnalar veya orijinal isimleriyle Exception'lar, kod blokları arasında oluşan anormal durumlardır.
     * Bu gibi durumlarda derleyici hata verecektir. Exception'lar hata tipi, hata oluştuğunda uygulamanın durumu ve hata hakkında açıklayıcı bir takım bilgiler içerir. Exception'lar sayesinde hata yakalamak ve sorunu çözmek daha da kolaylaşır.
     * 
     */
    
    /* Hata Yakalama (Try-Catch Blokları) 
     *
     * Java, hatalar konusunda çok sıkı davranır ve hataları anında kullanıcıya gösterir.
     * Hataları anlayıp yakalayabilmek için try-catch bloğu kullanmalıyız.
     * 
     * Bu try-catch bloğu sayesinde hata ile karşılaştığımızda ne yapmamız gerekir veya hata olsa da olmasa da programımızda neler yaptırmak istiyoruz, bunları programımıza anlatabiliriz.
     * 
     * Temel try-catch bloğu kullanımı:
     * 
     * try{
     *   //istisnai durum kontrolü yapılacak kod
     * }catch(Exception_türü e){
     *   //(Exception_türü) hatasında çalışacak kod
     * }finally{
     *   //hata alınsa da alınmasa da çalışacak kod
     * }
     * 
     * Hata oluşma ihtimali olan kodumuzu try bloğu içerisine alırız. Try bloğu çalıştığında eğer bir hata olursa catch bloğuna girilir. Hangi türde bir hata olduysa bu hata ekrana yazdırılır. Burada tanımlanan Exception_türü tipindeki e nesnesi bize hata hakkında bilgi verir.
     * 
     * Hata mesajının ilk bölümü hatanın tipi ile ilgilidir. İkinci bölüm ise hatanın neden kaynaklandığı ile ilgilidir. Aşağıdaki örnekte ilk bölüm olan hatanın tipi ArithmeticException'dır. Hatanın neden kaynaklandığı ise ae nesnesinin içerisinde saklıdır. Biz ae nesnesini ae.toString() ile ekrana yazdırarak hatanın sebebini öğreniriz
    */

    public static void main(String[] args) {
        
        //Example1
        int a = 10, b=0, c;

        try {
            c = a/b;
            System.out.println("Sonuc: "+c);
        } catch (ArithmeticException ae) {
            System.out.println("Bir hata ile karşılaşıldı: " + ae.toString());
        }

        /* Eğer catch bloğunda tanımladığımız hata tipi ile karşılaştığımız hata tipi uyuşmuyorsa muhtemelen hatayı yakalayamayız. Bu gibi durumlarda catch bloğunda genel hata tipi (Exception) tanımlamak veya birden fazla catch bloğubulundurmak hatayı yakalamanızı kolaylaştıracaktır*/
    
        /* Catch bloğu içerisinde hatanın sebebini yazdırmak yerine herhangi bir string ifadesi de yazdırabiliriz. */
        
        //Example2
        int vize;
        Scanner s = new Scanner(System.in);
        System.out.println("vize notunuzu girin:");
        try {
            vize = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Bir hata oluştu");
            System.out.println(e.toString());
            System.out.println("Vize notu alınamadı");
        }

        /* Hata Yaklamada Yeni Catch Bloğu Sistemi */
        /* Java 7 ile gelen yenilikle, birden fazla catch bloğu oluşturmak yerine tek catch bloğu içerisinde bunları kontrol edebiliyoruz.
         * Catch bloğu içerisinde, doğabilecek tüm hata tiplerini araya bitwise(|) koyarak tanımlıyoruz. Bu hata tiplerinden herhangi biri try içerisinde olursa catch içerisindeki kodlar işlenecektir.
        */

        //Example3

        try {
            int x = 10;
            int y = 0;
            System.out.println(x/y);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
            System.out.println(ex.toString());
        }

        /* Finally Bloğu */
        /* Dosyaya yazma, dosyadan veri okuma işlemlerinde hata olsa da olmasa da dosyayı kapatmamız gerekiyor. finally bloğu genelde bu işlemler için kullanılır. */

        //Example4
        int dizi[] = new int[]{4,3};
        try {
            System.out.println(dizi[0]);
            System.out.println(dizi[1]);
            System.out.println(dizi[2]); //hata oluşacak
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally{
            System.out.println("Hata olsa da olmasa da bu bloğa girildi");
        }

        /* Finally bloğunun alternatifi
         * 
         * try bloğunu tanımlarken parantez içerisinde kapanmasını istediğimiz dosya be bağlantıları tanımlıyoruz ve bunlar otomatik olarak kapatılıyor.
        */

        File f = new File("C:\\kitap\\sehirler.txt");
        File ff = new File("C:\\kitap\\sehirler2.txt");
        char datas[] = new char[(int) f.length()];

        try (FileWriter fileWriter = new FileWriter(ff)){
            FileReader f2 = new FileReader(f);
            f2.read(datas);
            String readed = new String(datas);
            fileWriter.write(readed);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* Bu örnekte try ifadesinin yanına parantez içerisinde kapatılacak olan dosyayı yazıyoruz. Bu, oluşturulan herhangi bir bağlantı nesnesi de olabilirdi. Artık bu bizim için otomatik olarak yapılıyor. Bunun sebebi, Java 7'de java.lang paketinin içerisine AutoClosable arayüzünün eklenmiş olmasıdır.*/

        //Finally bloğunda try-catch kullanımı da yine aynı şekilde dosyada okunacak veri kalmadıysa dosyanın kapatılması gibi işlemlerde kullanılır.
        
    }
}
