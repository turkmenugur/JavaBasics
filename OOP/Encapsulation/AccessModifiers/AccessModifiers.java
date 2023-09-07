package OOP.Encapsulation.AccessModifiers;

public class AccessModifiers {
    /* ERİŞİM BELİRLEYİCİLER 
     * 
     * Sınıf elemanına erişimi sınırlandıran anahtar kelimelerin genel adıdır.
     * Bu anahtar kelimeler 'public', 'private', 'protected'dır.
     * Bu anahtar kelimeleri kullanmazsak default anahtar kelimeyi kullanır.
     * Kapsüllemenün temelini bu erişim belirleyiciler oluşturur.
     * 
     * 
     * public -> Bir elemanı public olarak tanımlarsak bu elemana herkes ulaşabilir.
     * 
     * protected -> Bir sınıfın protected olarak tanımlanmış elemanına o sınıftan, o sınıftan türetilmiş sınıflardan ve o sınıf ile aynı pakette bulunan sınıflardan erişilebilir.
     * 
     * private -> private olarak tanımlanmış sınıf elemanlarına yalnızca o sınıftan erişilebilir. O sınıftan türetilen sınıflardan ya da aynı pakette bulunan sınıflardan erişilemez.
     * 
     * default -> Herhangi bir erişim belirleyici tanımlanmamışsa , default olarak kabul edilir. Default olarak tanımlanmış sınıf elemanlarına o sınıftan ve aynı paketteki sınıftan erişilebilir.
    */

    /* Eğer alanımızın başına bir erişim belirleyici yazmazsak default olarak algılanır.
     *  default olan alanlara da yalnızca o sınıftan ve aynı paketten erişilebilir.
    */

    /* Java'da .java uzantılı dosya içerisinde birden fazla sınıf kullanacaksak, yalnızca bir tanesi public olarak tanımlanabilir. Aynı yerde iki veya ikiden fazla sınıf public olamaz.
     *
     * ÖRNEK:
     * public class Home(){
     *      public static void main(){
     *          
     *      }
     * }
     * 
     * class People(){
     *      //default olarak tanımlandı
     * }
     * 
     * Bunun sebebi:
     * 
     * Java'da bir .java dosyasında yalnızca bir sınıfın public olarak tanımlanmasının nedeni, Java dilinin kod organizasyonu ve erişim kontrolünü düzenlemek için tasarlanmış bir kuraldır. Bu kural, Java dilinin yapısal bütünlüğünü ve kodun daha iyi anlaşılabilirliğini destekler. İşte bu kuralın nedenleri:

        Dosya Adı ve Sınıf Adı İlişkisi: Java'da bir .java dosyasının adı, içindeki public olarak tanımlanan sınıfın adıyla aynı olmalıdır. Bu kural, Java derleyicisinin hangi sınıfın hangi dosyada olduğunu belirlemesine yardımcı olur. Bu nedenle, yalnızca bir sınıfın public olması, dosya adı ve sınıf adı ilişkisini korumanızı sağlar.

        Erişim Kontrolü: public bir sınıf, bu sınıfa başka paketlerden erişimi mümkün kılar. Java'da başka bir paketteki sınıfa erişebilmek için bu sınıfın public olması gerekir. Birden fazla public sınıf tanımlanabilseydi, hangi sınıfın başka paketlerden erişilebilir olduğunu belirlemek zorlaşabilirdi ve kodun karmaşıklığı artabilirdi.

        Sınıfın Ana Sınıf Olması: Java'da bir uygulama bir main metodu içeren bir sınıftan başlar. Bu sınıf genellikle uygulamanın giriş noktası olarak işlev görür. Diğer sınıflar, bu ana sınıf içinden oluşturulabilir veya kullanılabilir. Bu nedenle, public sınıfın genellikle bu ana sınıf olduğu kabul edilir.

        Ancak, .java dosyası içinde birden fazla sınıf tanımlanabilir, ancak yalnızca biri public olabilir. Diğer sınıflar "package-private" veya "private" erişim kontrolüne sahip olabilirler. 
     *  
    */

}