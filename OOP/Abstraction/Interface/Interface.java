package OOP.Abstraction.Interface;

public class Interface {
    /* Arayüzler metod gövdeleri barındırmaları açısından soyut sınıflara benzerler ama soyut sınıflarda gövdesiz metodlar ve tanımlayabileceğimiz diğer metodlar bulunuyorken arayüzlerde bütün metodlar gövdesiz olarak tanımlanır.
     * 
     * Arayüzler, sınıfların bir işi nasıl yapacağını değil bir işi yaparken hangi adımları veya ne yapması gerektiğini tanımlar.
     * 
     * Arayüzler temelde çoklu kalıtım olayını basite indirgemek için oluşturulmuştur.
     * 
     * Bir arayüzü bu şekilde tanımlarız:
     * erisimBelirleyici interface arayüzAdı{
     *      //değişkenler ve metod gövdeleri
     * }
     * 
     * Arayüzlerin, sınıfları birleştirici özelliği vardır.
     * Sınıflar, kullanmak istediği arayüzü sınıf tanımından sonra implements anahtar sözcüğü ile kendi bünyelerine dahil edebilirler.
     * 
     * Arayüzlerde değişken erişim belirteçleri de sınıflardan farklıdır.
     * Arayüz içerisinde anlık değişkenler bulunmaz.
     * Arayüz içerisinde tanımladığımız değişkenlerin erişim belirteçleri public, static ve final tipindedir ve ilk değer ataması zorunludur.
     * Yani arayüzü kullanacak diğer sınıflar değişkeni değiştiremezler.
     * Arayüz içerisinde tanımladığımız değişkenler, daha çok diğer sınıflarda sabit olarak kullandığımız değişkenlerdir.
     * 
     * Sınıflar, birden fazla arayüzü bünyesine katabilir.
     * 
     * 
     * Arayüzler, soyut sınıflarda olduğu gibi hem gövdeli hem dövdesiz metodlara sahip değildir. Tamamen gövdesiz metodlar bulunur. Yani bu metodlar başlı başına bir iş yapmazlar. Bu metodların implement edilen sınıflarda override edilmeleri gerekir.
    */


     public static void main(String[] args) {
        
        //işçi ile ilgili bilgiler yazdırılıyor
        Worker worker = new Worker();
        worker.employeeDepartment();
        worker.setSalary(865.70);
        System.out.println("Maaşı: "+worker.salary());

        //müdür ile ilgili bilgiler yazdırılıyor
        Manager manager = new Manager();
        manager.employeeDepartment();
        manager.setSalary(5519.71);
        System.out.println("Maaşı: " + manager.salary());

        //satış elemanı ile ilgili bilgiler yazdırılıyor
        SalesPerson salesPerson = new SalesPerson();
        salesPerson.employeeDepartment();
        salesPerson.setSalary(978.75);
        salesPerson.setSalesCommision(250);
        System.out.println("Komisyon: "+salesPerson.commission);
        System.out.println("Maaşı: " + salesPerson.salary());
    }

    /* Özet:
     * Arayüzler, soyut sınıflara benzese de aralarında önemli farklar vardır. Eğer her metodun override edilmesini istiyorsak bu metodları bir arayüz içerisinde tanımlarız. Ayrıca arayüzlerde, soyut sınıflarda olduğu gibi bir ilişki kavramı yoktur. Yani arayüz ve bunu kullanan sınıflar arasında kalıtım açısından bir bağlantı olmayabilir. Ayrıca soyut sınıflardaki override edilmesi istenen metodlar başına abstract getiriyorken arayüzdeki metodların başına herhangi bir şey getirilmez. Çünkü zaten hepsi override edilecektir.
    */

    /* Arayüzlerde Genişletilme Özelliği:
     * 
     * Daha önceden tanımladığımız bir arayüzü genişletmemiz mümkündür.
     * Bu, bir arayüzün başka bir arayüzü kalıtım yoluyla miras almasıyla mümkün olur.
     * Bir arayüzün diğer bir arayüzü miras alması sınıflardaki gibidir.
     * Yani bir arayüz diğer bir arayüzü extends anahtar sözcüğü ile miras alabilir.
    */

    //Bir arayüz içerisinde aynı isimde 2 metod varsa bu metodların aldığı parametrelerin farklı olması gerekir. Dönüş tiplerinin farklı olması bir anlam ifade etmez, hata oluşur. Bu, metodlardaki overload işlemine benzer.

    /* Arayüz İçerisinde Başka Bir Arayüz Kullanma
     * 
     * Bir arayüz, başka bir arayüz içerisinde bulunabilir. Bu dahili arayüzler de public olarak tanımlanmalıdır.
     */
}
