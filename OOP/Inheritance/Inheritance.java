package OOP.Inheritance;

public class Inheritance {
    /* Kalıtım, sınıflardan yeni sınıflar türetmeyi sağlar.
     * Türetilen bu yeni sınıflar, türetildiği sınıfların özelliklerine sahip olur.
     * Kalıtım yapmak için kullanacağımız kelime extends'dir.
     * Bir sınıf, birden fazla sınıftan türetilemez.
     * Kalıtımın en büyük avantajı bizi, üst sınıflardan tanımlanmış olan öetod ve değişkenleri tekrar tekrar yazmaktan kurtarır.
    */

    /* Super Class (Üst sınıf) ve Sub Class (Alt sınıf)
     * 
     * Miras alınan sınıf super class'tır. O sınıftan türetilen sınıflar da sub class'tır.
     * Bir super sınıfın birden fazla alt (sub) sınıfı olabilir.Fakat bir alt sınıf, birden fazla super sınıftan türetilemez.
     * 
     * Alt sınıflar üst sınıfın tüm özellijlerine sahiptir.
     * 
     * Bir alt sınıf, türetildiği sınıfın metodunu değiştirebilir buna metod overriding denir.
     * 
     * Bir sınıftan nesne oluşturulduğunda, o sınıfın yapıcısından önce türetildiği sınıfın yapıcısı çağırılır. Bu şekilde en üst seviyedeki Super Class'ın yapıcı metodu çağırılır. 
     * 
     * Eğer Super class'ta private elemanlar varsa sub class'lardan erişilemez 
    */

    /* Super Metodu ile Üst Sınıfın Yapıcısını Çağırmak
     * 
     * Türetilen sınıf, türeyen sınıfın yapıcısına super anahtar kelimesi ile ulaşabilir.
     * super() metodu üst sınıfın yapıcısını çağırır.
     * 
     * Örneğin A sınıfından B sınıfını türettik diyelim. Bu B sınıfının yapıcısının içinde super() metodunu çağırırsak A sınıfının yapıcısı çağrılmış olur.
     * 
     * Alt sınıftaki yapıcının içerisinde ilk olarak super() metodu yazılmalıdır. Bu alt sınıftaki yapıcıda ekrana yazdırma, başka bir metod çağırma gibi işlemler de olabilir. super() metodu bunlardan önce ilk sırada yazılır.
     * 
     * üst sınıfın yapıcısı birden fazla ise super() metodu içerisinde hangi yapcının çağrılmasını istiyorsak onun parametreleri yazılır.
     * 
     * super anahtar kelimesi aynı zamanda sınıftaki değişkenlere erişmeyi sağlar
     * 
     * super anahtar kelimesinin this kelimesinden farkı:
     * super anahtar kelimesi üst sınıfın elemanlarına erişmeyi sağlarken this içinde bulunduğu sınıfın elemanlarına erişmeyi sağlar
     * 
     * Super metodu, yapıcısının her zaman en üstünde tanımlanır.
     */
}
