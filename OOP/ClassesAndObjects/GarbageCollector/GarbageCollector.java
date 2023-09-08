package OOP.ClassesAndObjects.GarbageCollector;

public class GarbageCollector {
    /* Java dilinin üstünlüklerinden biri de Garbage Collection yapısının bulunmasıdır.
     * Programlarda bazı nesnelerin kullanımı bittiğinde bellekten silinmeleri gerekir.
     * 
     * Bir nesneye programda bir referans verildiğini düşünelim. Örneğin;
     * 
     * Animal animal;
     * 
     * Burada new anahtar kelimesi kullanmadığımız için animal nesnesi bellekte bir yer kaplamaz. Ona sadece referans verilmiştir. Bu şekilde programda olan nesnelerin silinmeleri gerekir.
     * 
     * Java bu işi otomatik olarak yapar.
     * Belirli aralıklarla programı kontrol edip, işi bitmiş ve işaret edilmemiş nesneleri siler.
     * Kullanılmayan bu nesneler uygulamanın performansını da etkiler.
     * Bu şekilde biriken nesneler programda OutOfMemoryException hatası verir.
     * Eğer bir nesne new operatörü ile oluşturulup belleğe yerleşmek ister ve bellekte de yer kalmamış olursa, Garbage Collector hemen bellekteki gereksiz nesneleri silerek yer ayırır.
     * Nesneler, belleğin heap alanında toplandığı için Garbage Collector bu alanda işlem yapar.
     * Çöp toplama isteğini JVM gönderir.
     * Mükemmel bir algoritmaya sahip olan Garbage Collector, java dilinin önemli artılarındandır.
     * 
     * Kullanılmayan nesneleri temizleyerek o alanı belleğe tekrar iade eden bu Garbage Collector, otomatik olarak çalışır. Fakat bunu manuel yani kendimiz çalıştırmak istiyorsak şu kod satırını kullanmamız gerekir.
     * 
     * Runtime.getRuntime.gc();
     * 
     * veya 
     * 
     * System.gc();
     * 
     * Eğer programımızda gereksiz nesneler bulunmuyorsa Garbage Collector devreye girmez. Yukarıdaki kodlardan birini yazarak Çop Toplayıcı'yı etkin hale getirebiliriz.
    */

    /* Finalize Metodunun Kullanımı
     *
     * Java'da bir nesneyi silmek istediğimizde ek olarak çalışan bir metod daha vardır. Bu metod finalize() metodudur. Garbage Collector, nesneleri silmeden önce bu metodu çağırır ve kullanır. Dolayısıyla nesneyi silerken yapmak istediğimiz şeyler bu metod ile yapılır. 
    */

    GarbageCollector(){
        System.out.println("Nesne oluşturuldu");
    }

    protected void finalize(){
        System.out.println("Nesne silindi. Silinirken bu metod çalıştı");
    }

    public static void main(String[] args) {
        
        for(int i=0;i<3;i++){
            GarbageCollector g1 = new GarbageCollector();
        }

        Runtime.getRuntime().gc(); //JVM, Garbage Colector'u çağırdı

    }

}

/* Garbage Collector, JVM tarafından çağırılır ve kontrol edilir.
 * Bu örnekte 3 nesne oluşturduk ve GarbageCollector'u çağırdık.
 * Bu da finalize() metodunu işlenmek üzere çağırdıve bu metod içerisindekiler işlendi.
 * Bu metodun protected olmasının sebebi; bu sınıfın dışından bu metoda erişilememesi ve nesnelerin dışarıdan yok edilememesi gerekliliğidir.
 * 
 * Nesnelerin silinme sırası oluşturulma sırasının tam tersidir. İlk oluşturulan nesne en son silinir.
 *
 * Dosya okuma yazma işlemlerinde de Stream kullanarak bir işlem yaptığımızda o Stream'i kapatmak için de finalize() metodu kullanılır. Okuma yazma işlemi için oluşturulan nesneler, finalize() metodu ile bellekten silinirler. Diyelim ki işlemleri o1 nesnesi ile yaptık. o1.finalize(); diyerek nesneyi silebiliriz  
 */
