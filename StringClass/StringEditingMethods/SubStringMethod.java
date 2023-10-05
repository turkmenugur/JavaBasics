package StringClass.StringEditingMethods;

public class SubStringMethod {
    /* SubString metodu ile String İçerisinden Bir Bölüm Seçme */

    /* String içerisinden belli bir bölümü seçmek için kullanılır. 
     * Kullanımı şu şekildedir:
     * subString(int firstIndis, int lastIndis);
     * 
     * firstIndis -> Karakterlerin seçilmeye başlanacağı indis değerini gösterir.
     * lastIndis -> Karakter seçimlerinin sonlanacağı indis değerini gösterir.
     * 
    */

    public static void main(String[] args) {
        String text = "Bu örnek substring metodunun kullanımı için yapıldı";
        String subText1 = "";
        String subText2 = "";

        subText1 = text.substring(9, 18);
        subText2 = text.substring(29, 38);

        System.out.println(subText1);
        System.out.println(subText2);
    }
}
