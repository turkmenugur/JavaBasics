package StringClass.StringTokenizerAndStringBufferClasses;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    /* StringTokenizer Sınıfını Kullanarak Metni Parçalama */

    /* StringTokenizer sınıfı, bir String ifadeyi belirli bir parametreye göre parçalar. Eğer uzun bir cümle varsa ve parametre olarak boşluk verirsek cümle, her boşlukta parçalara ayrılır.
     * 
     * Ayrılan her parçaya token denir. Parçalama işlemini yapacak olan parametreye de delimeter denir.
     * 
    */

    public static void main(String[] args) {
        String text = "Yenildiğinde değil vazgeçtiğinde kaybedersin";
        StringTokenizer s1 = new StringTokenizer(text);
        while(s1.hasMoreTokens()){
            //parçalanacak ifade varsa true değeri döner ve döngü işler

            System.out.println(s1.nextToken());

        }

        //hasMoreTokens() -> parçalanacak bir ifade kalıp kalmadığını kontrol eder
        //nextToken() -> her seferinde parçalanan ifadeyi döndürür

        //Bu örnekte boşluklara göre parçalama yaptı. Normalde StringTokenizer sınıfının yapıcısına cümlenin yanında hangi karaktere göre parçalama yapacağımızı da verirdik fakat bu örnekte vermedil çünkü boşluk ifadesi, default parametredir. Boşluk değil de farklı bir parametreye göre parçalama yapmak istersek parametre olarak bunu da eklememiz gerekir.

        String text2 = "Java-programlama-dili";
        String seperator = "-";
        StringTokenizer s2 = new StringTokenizer(text2, seperator);
        while(s2.hasMoreTokens()){
            System.out.println(s2.nextToken());
        }

        //StringTokenizer sınıfının yaptığını split() metodunun yaptığı işe benzetebiliriz

        System.out.println("**********");
        //başka bir örnek
        String text3 = "Java,-ve-,kotlin-programlama-;dilleri";
        String seperator2 = ",;";
        StringTokenizer s3 = new StringTokenizer(text3,seperator2);
        while(s3.hasMoreTokens()){
            System.out.println(s3.nextToken());
        }
        System.out.println("**********");
        
        String seperator3 = "-;";
        StringTokenizer s4 = new StringTokenizer(text3,seperator3);
        while(s4.hasMoreTokens()){
            System.out.println(s4.nextToken());
        }
        System.out.println("**********");
        
        String seperator4 = "a";
        StringTokenizer s5 = new StringTokenizer(text3, seperator4);
        while(s5.hasMoreTokens()){
            System.out.println(s5.nextToken());
        }
        
        //Bu örnekte 3 farklı bölme parametresi kullandık.
        //ilk örnekte kesme işlemini yapan seperator parametresi ,; ifadesinden oluşuyor. Cümlede de ilk olarak , ifadesi aranıyor. Eğer bu ifade varsa kesme yapılıyor. Eğer yoksa bu sefer ; ile arama yapılıyor.
        
        //Bir cümlede bir çok noktalama işareti varsa bu noktalama işaretleri parametreye uygun şekilde verilir ve tüm kelimeler elde edilir.
        
        //Diğer bir örnek
        System.out.println("**********");
        String text4 = "(3*5)++(4/10)";
        String seperator5 = "((*+/";
        StringTokenizer s6 = new StringTokenizer(text4, seperator5);
        while(s6.hasMoreTokens()){
            System.out.println(s6.nextToken());
        }
        
        System.out.println("**********");
        
        String seperator6 = "(*)+/";
        StringTokenizer s7 = new StringTokenizer(text4, seperator6);
        while (s7.hasMoreTokens()) {
            System.out.println(s7.nextToken());
        }
        
        //ilk seperator'da (delimeter) sırasını farklı yaptık ve yanlış sonuç aldık. Alttaki bölücüde uygun sıraya göre yazdık ve tüm sayıları elde ettik.
        
        //StringTokenizer kullanırken token yerine element kullanılarak da aynı işlemi yapabiliriz.
        //Örnek:
        System.out.println("**********");
        String text5 = "C:\\Windows\\System32";
        String seperator7 = ":\\";
        StringTokenizer s8 = new StringTokenizer(text5,seperator7);
        while (s8.hasMoreElements()) {
            System.out.println((String)s8.nextElement()); //cast işlemi
        }

        //String tipine cast etmemizin sebebi üretilen sonucu String tipinde almamız gerektiğidir.

        //Tokenların sayısını elde etmek için countTokens() metodunu kullanırız
        String text6 = "Java programlama dili temelleri";
        StringTokenizer s9 = new StringTokenizer(text6);
        System.out.println(s9.countTokens());
        while (s9.hasMoreTokens()) {
            System.out.println((String)s9.nextToken());
        }
    }
}
