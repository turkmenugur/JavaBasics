package IO;

public class IOoperations {
    /* Giriş çıkış işlemleri için kullanmamız gereken paket java.io paketidir.
     * Okuma yazma işlemleri için konsol dışındaki yöntemleri kullanırsak başka bir paket kullanmamız gerekir. java.nio paketi ile daha ileri düzeyde ve daha performanslı giriş çıkış işlemleri yapılabilmektedir.
     * 
     * Java'da giriş çıkış işlemleri Stream mantığı ile yapılır. Akım anlamına gelen Stream, programımız ile dosya arasında köprü görevi görür. Yani bir nevi verilerin iletildiği kanaldır.
     * 
     * Java'da veri aktarım işlemlerini, karakter bazlı ve byte bazlı olarak ikiye ayırabiliriz.
     * 
     * Karakter bazlı aktarım işlemi, verileri karakterler halinde taşır. Unicode desteği vardır. Yani diğer alfabeleri destekler. Byte bazlı aktarım işleminde ise karakter toplulukları halinde aktarım yapılır. Bu yöntem, karakter bazlı aktarıma göre daha performanslıdır. 
     *  
    */

    /* Karakter Tabanlı Veri Taşıma */

    /* Karakter tabanlı veri iletimi, Writer ve Reader sınıfları ile yapılır. Bu sınıflar da kendi içerisinde alt sınıflara ayrılır. Karakter tabanlı işlemlerde unicode desteği vardır.

     * Reader sınıf kendi içinde alt sınıflara ayrılır. Bunlardan bazıları:
     *  InputStreamReader
     *  BufferedReader
     *  FileReader
     *  FilterReader
     *  StringReader
     * 
     * Writer sınıfı kendi içinde alt sınıflar ayrılır. Bunlardan bazıları:
     *  OutputStreamWriter
     * BufferedWriter
     * FileWriter
     * FilterWriter
     * StringWriter
     * PrintWriter
     * 
     * 
     * java.io.* sınıfını import ederek bütün sınıfları kullanabiliriz.
    */

    /* Byte Tabanlı Veri Taşıma */

    /* Byte tabanlı veri iletimi, InputStream ve OutputStream sınıfları ile yapılır. Java'daki tüm sınıflar Object sınıfından türediği için bu sınıflar da Object sınıfından türemişlerdir. Byte tabanlı işlemlerde Unicode desteği yoktur
     * 
     * InputStream kendi içerisinde alt sınıflara ayrılır. Bunlardan bazıları:
     *  BufferedInputStream
     *  DataInputStream
     *  FilterInputStream
     *  PrintStream
     *  RandomAccessFile
     *  FileInputStream
     * 
     * OutpuStream de kendi içerisinde alt sınıflara ayrılır. Bunlardan bazıları:
     *  BufferedOutputStream
     *  DataOutputStream
     *  FileOutputStream
     *  FilterOutputStream
     * 
    */

    //Eğer read ve write kelimeleri varsa o sınıf karakter tabanlı işlem yapar.
    //Her iki yöntemde de buffer kullanılır. Türkçesi tampon olan buffer, veri aktarırken bir ara katmandır. Veriler yazılmadan ya da okunmadan önce burada tutulur.
    //Bir dosya üzerinde işlem yaptıktan sonra o dosyayı kapatmadan tekrar o dosya üzerinde işlem yapmak istersek hata alabiliriz. 
}
