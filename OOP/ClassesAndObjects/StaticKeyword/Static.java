package OOP.ClassesAndObjects.StaticKeyword;

public class Static {
    /* static anahtar kelimesi, kısaca sınıftaki alanlara nesne oluşturmadan erişmeyi sağlar
     * 
     * Java'da her nesne için ayrı ayrı tutulan alanlar değil de bir sınıf için ortak tutulan alanlar oluşturmak istersek, bunun için yapmamız gereken static anahtar kelimesi kullanmaktır. Oluşturacağımız alanların başına static anahtar kelimesi getirerek oluşturacağımız değişkenler sınıf değişkenleri olarak adlandırılır. Bu alanlara sınıftan bir nesne oluşturmadan doğrudan sınıf adı ile erişim yapılabilir.
     * 
     * static olarak tanımlanmış değişkenler, yani sınıf değişkenleri, o sınıftan oluşturulan her nesne için ayrı ayrı oluşturulmaz. Dolayısıyla sınıf değişkenleri, bellekte tek bir yerde tutulur. Ayrıca sınıf değişkenleri, o sınıftan nesne oluşturulmasa bile bellekte bunun için yer ayrılır. Fakat nesne değişkenlerinde, nesne oluşturulduğunda o değişken bellekte yer kaplamaya başlar.
    */

    /* Static Metodlar
     * 
     * Değişkenleri static olarak tanımlayabildiğimiz gibi metodları da static olarak tanımlayabiliriz.
     * Bu şekilde tanımlanmış metodlara en iyi örnek Math sınıfının metodlarıdır. Örneğin Math sınıfının sqrt() fonksiyonunu kullanabilmek için bu sınıftan bir nesne oluşturmak gerekmez. Doğrudan Math.sqrt() fonksiyonunu kullanarak karekök alabiliriz. Bunun sebebi Math sınıfındaki tüm metodların static olarak tanımlanmasıdır.
    */

    /* Static metodlar içerisinden, static olmayan bir değişkene erişilemez ve static olmayan bir metod çağırılamaz. Fakat bunun tam tersi olabilir. Yani static olmayan bir metod içerisinden static olan vir değişkene erişilebilir ve static olan bir metod çağırılabilir.
     * 
     * static bir metod içerisinden static olmayan bir değer döndürmeye çalışırsak veya bir static olmayan metod çağırırsak aşağıdaki hatayı alırız:
     * 
     * Cannot make a static reference to the non-static field isim
     * 
     * Neden böyle bir hata alırız?
     * 
     * Bir nesne olmadığında static metodlara erişebiliriz. Fakat nesnesiz oalrak eriştiğimiz bu metoddan, static olmayan bir metoda veya değişkene ulaşamayız. Çünkü bunlara ulaşmak için nesne gerekir.
    */

}
