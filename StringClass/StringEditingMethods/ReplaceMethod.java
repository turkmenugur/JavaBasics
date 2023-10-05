package StringClass.StringEditingMethods;

public class ReplaceMethod {
    /* Replace Metodu ile String İçerisindeki Karakteri Değiştirme */

    /* String içerisinde belirtilen karakterleri başka karakterler ile değiştirmeyi sağlar.
     * Kullanımı şu şekildedir:
     * replace(char orijinalKarakter, char degistirilenKarakter)
     *
     * orijinalKarakter parametresi, değiştirilmek istenilen karakterdir.
     * değiştirilenKarakter parametresi, String nesnesi içerisinde orijinalKarakter ile değiştirilmek istenilen karakterdir.
    */

    public static void main(String[] args) {
        String text = "Bu örnek replace metodunun kullanımı için yapıldı";
        String text2 = "";

        System.out.println("String nesnesinin orijinal hali: ");
        System.out.println(text);

        //String nesnesi içerisinde tüm 'e' karakterleri 'o' ile değiştirildi
        text2 = text.replace('e', 'O');

        System.out.println("String nesnesinin değişitirlmiş hali: ");
        System.out.println(text2);
    }
}
