package StringClass.CharacterMethods;

public class GetCharsMethod {
    /* GetChars metodu ile String içerisindeki bir bölümü diziye aktarma */

    /* String içerisindeki belli sayıda karakterleribir diziye aktarmamızı sağlar. Metodun genel kullanımı şu şekildedir:
     * 
     * getChars(int başlangıç, int bitiş, char hedefDizi[], int hedefIndis);
     * 
     * başlangıç parametresi -> String nesnesi içinde kopyalanamaya başlanacak indis değerini gösterir. 
     * bitiş parametresi -> String nesnesi içerisinde kopyalanmanın sonlanacağı indis değerini gösterir.
     * hedefDizi[] -> String nesnesi içerisinden alınan karakterlerin kopyalanacağı hedef dizidir.
     * hedefIndis -> Hedef dizinin içerisine kopyalanacak karakterlerin hangi indis değerinden sonra kopyalanması gerektiğini bildirir.
    */

    public static void main(String[] args) {
        String text = "Bu bölümde String nesnesinin metodlarını öğreniyoruz";
        char[] targetArray = new char[6];
        char[] targetArray2 = new char[9];
        char[] targetArray3 = new char[11];

        text.getChars(11, 17, targetArray, 0);
        System.out.println(targetArray);
        text.getChars(18, 27, targetArray2, 0);
        System.out.println(targetArray2);
        text.getChars(41, 52, targetArray3, 0);
        System.out.println(targetArray3);
    }
}
