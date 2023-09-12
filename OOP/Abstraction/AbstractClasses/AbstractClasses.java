package OOP.Abstraction.AbstractClasses;

public class AbstractClasses {
    /* Soyut sınıflarda amaç, nesne türetirken şablon oluşturmaktır.
     * Soyut sınıfta tanımlanan şablon, bu sınıfı miras alan alt sınıflarda override edilerek yeniden tanımlanır.
     * 
     * Soyut sınıf tanımladığımızda içerisinde mutlaka bir soyut metod bulundurması gerekmektedir.
     * Tersini düşündüğümüzde, yani sınıf içerisinde bir soyut metot tanımladığımızda ise sınıfı soyut işaretçisiyle işaretlemeliyiz.
     * Bir sınıfı veya metodu soyut olarak tanımlamak için erişim belirtecinden sonra abstract anahtar sözcüğünü kullanmalıyız.
     * 
     * Soyut metotlar, kendi başına bir anlam ifade etmezler
     * 
     * Bir metot soyut olarak tanımlandıysa, o metodun olduğu sınıf da mutlaka soyut (abstract) olarak tanımlanmalıdır.
     * 
     * Soyut sınıftaki soyut metot, alt sınıflarda override edilmezse derleme anında hata ile karşılaşırız.
    */

    /* Soyut Sınıf ve Kalıtım Arasındaki İlişki
     * 
     * Soyut sınıflarda soyut olarak tanımladığımız metot alt sınıflarda mutlaka override edilmelidir. Kalıtımdaki gibi isteğe bağlı bir durum yoktur.
     * 
     * Soyut sınıflardan soyut alt sınıflar türetilebilir. Bu şekilde türetirsek bu alt soyut sınıf, üst soyut sınıfın soyut metodunu override etmek zorunda kalmaz.
     * 
     * Bir sınıfı soyut olarak tanımlayıp içerisinde de soyut bir metod oluşturursak bu metodun o üst sınıf için bir anlamı olmaz.
     * Sadece bu soyut sınıftan türeyen sınıflar, bu metodu kullanarak kendileri için şekillendirirler.
     * Yani bu soyut metot alt sınıfların işine yarar.
     * 
     * Soyut sınıflarda normal bir metod bulunabilir ve bu metoda static olarak tanımlanarak soyut sınıftan nesne üretmeden doğrudan sınıf adı ile erişilebilir. 
     */
}
