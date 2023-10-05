package StringClass.StringEditingMethods;

public class ToUpperCaseAndToLowerCase {
    /* ToUpperCase ve ToLowerCase metodları ile harf kipini değiştirme */

    /* toUpperCase() -> String nesnesi içerisindeki harfleri büyük harfler ile değiştirir.
    * toLowerCase() -> String nesnesi içerisindeki harfleri küçük harfler ile değiştirmek için kullanılır.
    */

    public static void main(String[] args) {
        String text = "JaVA prOGramLAMa DİLi";
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
    }
}
