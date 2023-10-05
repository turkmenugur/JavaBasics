package StringClass.CharacterMethods;

public class IndexOFAndLastIndexOfMethods {
    /* IndexOf ve LastIndexOf Metodları ile String İçerisinde Karakter Arama */

    /* String sınıfı, bize String içerisinde karakterleri arayabilmemiz için bu iki metodu sunar. 
     * indexOf(), String nesnesi içerisinde aranılan karakterin ilk bulunduğu indis değerini verir.
     * lastIndexOf() ise String nesnesi içerisinde aranılan karakterin son bulunduğu indis değerini verir.
     * Her iki metod için de aranılan eleman bulunursa indis değeri döndürülür.
     * Aranan eleman bulunmazsa geriye negatif değer döndürür. 
    */

    public static void main(String[] args) {
        String text = "Bu arama yapabilmek için test cümlesidir";
        System.out.println("'a' karakteri için ilk indis: " + text.indexOf("a"));
        System.out.println("'a' karakteri için son indis: " + text.lastIndexOf("a"));
        System.out.println("'arama' kelimesi için ilk indis: "+ text.indexOf("arama"));
        System.out.println("'arama' kelimesi için son indis: "+ text.lastIndexOf("arama"));
        
        /* Bu iki metodun, istenilen bir noktadan sonra arama yapabilmek için overload edilmiş formu bulunmaktadır. Aranacak değer referans olarak verildikten sonra ikinci parametre olarak aramaya başlanılacak indis değeri girilir. */
        System.out.println("'a' karakteri için ilk indis: " + text.indexOf("a",8));
        System.out.println("'i' karakteri için son indis: " + text.lastIndexOf("i",37));
    }
}
