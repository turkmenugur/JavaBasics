package StringClass.CharacterMethods;

public class ToCharArrayMethod {
    /* Bir String nesnesini karakter dizisine dönüştürmek için kullanılır
     * Bu metod, String nesnesini karakter dizisine çevirerek geriye nesneyi geriye dizi olarak döndürür.
    */

    
    public static void main(String[] args) {
        String text = "Java Programlama Dili";
        int len = text.length();
        char[] chArray = new char[len];

        chArray = text.toCharArray();

        for (char c : chArray) {
            System.out.print(c);
        }
    }
}
