package StringClass.CompareStringObjects;

public class CompareToAndCompareToIgnoreCase {
    /* CompareTo ve CompareToIgnoreCase Metodları İle Büüyklük Kontrolü */

    /* Bazı durumlarda, iki String nesnesinin birbirine eşit olup olmadığından çok hangisinin büyük olduğu veya hangisinin küçük olduğu önemlidir.
     * 
     * Bir String ifadesinin diğerindne büyük veya küçük olması ifadelerin sözlük sırasıyla ilgilidir.
     * 
     * compareTo() metodu; referans olarak verilen String nesnesini kendisini çağıran String nesnesi ile karşılaştırır. Eğer geriye dönen değer 0'dan büyükse çağıran String nesnesi referans olarak gönderilen String nesnesinden büyüktür.
     * Geriye dönen değer 0'dan küçükse (yani negatif ise) referans olarak gönderilen değer, çağıran String nesnesinden büyüktür.
     * 
     * Geriye dönen değer 0 ise iki Stirng nesnesi birbirine eşittir. compareTo() metodu, büyük küçük harfe karşı duyarlıdır. compareToIgnoreCase() metodu ise büüyk küçük harfe karşı duyarlı değildir.
     *  
    */

    public static void main(String[] args) {
        String word1 = "Okul";
        String word2 = "OKUL";
        String word3 = "Okur";
        String word4 = "OKUR";

        System.out.println(word1 + " ve " + word3 + "karşılaştırması: ");
        System.out.println(word1.compareTo(word3));
        System.out.println(word4 + " ve " + word1 + "karşılaştırması: ");
        System.out.println(word4.compareToIgnoreCase(word1));
        System.out.println(word1 + " ve " + word2 + "karşılaştırması: ");
        System.out.println(word1.compareToIgnoreCase(word2));
        System.out.println(word1 + " ve " + word2 + "karşılaştırması: ");
        System.out.println(word1.compareTo(word2));
    }
}
