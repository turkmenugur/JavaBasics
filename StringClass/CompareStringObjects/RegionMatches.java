package StringClass.CompareStringObjects;

public class RegionMatches {
    /* Bu metod, String nesnesi içerisindeki belli bir bölgeyi, referans olarak vereceğimiz String nesnesinin belli bir bölgesi ile karşılaştırmaya yarar

     * Metodun ilk parametresi karşılaştırmaya hangi indis değerinden başlanacağını ifade eder.
     * İkinci parametre hangi String ile karşılaştırılacağını gösterir.
     * Üçüncü parametre, karşılaştırmaya parametre olarak verilen String nesnesinin hangi indis değerinden başlanacağını gösterir.
     * Dördüncü parametre ise karşılaştırmanın kaç karakter devam edeceğini gösterir.
    */

    public static void main(String[] args) {
        String text1 = "Ankara Türkiye'nin başkentidir";
        String text2 = "Türkiye";

        boolean b;
        b = text1.regionMatches(7, text2, 0, text2.length());

        if(b == true)
            System.out.println(text1 + " içerisinde aranan bölgede "+ text2 + " bulundu");
        else
            System.out.println(text1 + " içerisinde aranan bölgede "+ text2 + " bulunamadı");
    }
}
