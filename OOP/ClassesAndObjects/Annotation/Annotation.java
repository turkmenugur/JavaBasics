package OOP.ClassesAndObjects.Annotation;

public class Annotation {
    /* Annotation; Java koduna eklenebilen sınıf, metod, değişken, parametre ve paketlere ön bilgi ve metadata eklemek için kullanılan yapılardır. 
     * 
     * Annotation'lar üç şekilde kullanılabilir:
     * 1- Derleyici bilgilendirme için kullanılabilirler. Bu tip kullanılan annotation'lar sayesinde derleyici hataları ve uyarıları görmezden gelir.
     * 2- Derlenme ve yüklenme anında kullanılarak otomatik kod ve XML dosyası oluşturma gibi işlemlerde kullanılabilir.
     * 3- Çalışma anında işletilerek kodun annotation'a göre çalışması sağlanır.
     * 
     * Annotation'lar başına @ işareti yazarak kullanılırlar. Her durumda annotation'lar bilgilendirilmek istenilen nesneden önce gelmelidir. Bazı annotation'lar derleyicide ön tanımlı durumdadır. Bazı metodları kullandığımızda derleyicinin annotation ile sağladığı uyarıyla karşılaşabiliriz.
     * 
     * Örneğin;
     * 
     * @Override: Miras alınan sınıf içerisindeki bir metodu, alt sınıfta yeniden tanımlamak istediğimizde, derleyici bize bu annotation ile bildirir
     * 
     * @Deprecated: Sürümü eski olan metodlar kullanıldığında derleyici bizi bu annotation ile uyarır.
     * 
     * @SuppressWarnings: Bu annotation tipi, parametre olarak vereceğimiz uyarı tipini derleyicinin göz ardı etmesini sağlar.
     * @SuppressWarnings("karşı koyma")
     * void metod(){
     * }
    */

    /* Annotation Oluşturma
     * 
     * Kendimiz de özel durumlar için annotation yazabiliriz.
     * Annotation yazmak interface yazmaya benzer.
     * Annotation yazarken @interface anahtar kelimesi ile işaretlemeliyiz.
     * 
     * Örnek:
     * public @interface annotationExample(){
     *      //metod gövdesi
     * }
     * 
     * Bu tüm birimler için annotation tanımına örnektir. Eğer annotation'ı bir birim ile sınırlandırmak istiyorsak annotation'dan önce @Target anahtar kelimesini ve bunun tipini yazmalıyız.
     * Aşağıda @Target anahtar kelimesinin tipleri verilmiştir.
     * 
     * @Target(ElementType.TYPE) : Sadece sınıf, enum ve interface için sınırlanır 
     * @Target(ElementType.PACKAGE) : Sadece paketler için sınırlandırılır 
     * @Target(ElementType.METHOD) : Sadece metodlar için sınırlandırılır 
     * @Target(ElementType.LOCAL_VARIABLE) : Sadece yerel değişkenler için sınırlandırılır 
     * @Target(ElementType.CONSTRUCTOR) : Sadece yapıcı metod için sınırlandırılır 
     * @Target(ElementType.FIELD) : Sadece sınıf üyeleri için sınırlandırılır 
     * @Target(ElementType.ANNOTATION_TYPE) : Sadece annotation birimleri için tanımlanan annotation sınırlandırılır
     * 
     * Annotation yazarken bir diğer belirteceğimiz unsur ise derleyicinin derleme ve çalışma anında annotation'a erişip erişemeyeceği unsurudur. Bunu belirtirken aynen @Target anahter kelimesinde olduğu gibi annotation'dan önce @Retention anahtar kelimesi ve tipini yazmamız gerekir. Derleyicinin derleme anında annotation'a erişmesini istiyorsak, aşağıdaki anahtar kelimeyi annotation'dan önce yazmalıyız.
     * 
     * @Retention(RetentionPolicy.RUNTIME) 
     */
}
