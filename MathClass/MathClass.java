package MathClass;

public class MathClass {

    public static void main(String[] args) {
        
        /* Math sınıfı, Java'da matematiksel işlemler yapmaya yarayan bir sınıftır. */

        /* java.lang paketinden türediği için bu Math sınıfını ayrıca import etmeye gerek yokktur. Çünkü java.lang paketi zaten Java programlarında otomatik olarak import edilmiştir. */
    
        /* Math.pow() */
        System.out.println("***** Math.pov() *****");
        //Bu metod üss alma işlemi yapar. 2 parametre alır. İlk parametre üssü alınacak sayıdır. Diğer parametre ise üssün derecesidir. Double tipinde değer dönderir
        
        System.out.println(Math.pow(3, 5));
        int a = (int)Math.pow(2, 4); //cast
        System.out.println(a);

        /* Math.sqrt() */
        System.out.println("***** Math.sqrt() *****");
        //Bu metod, bir sayının karekökünü bulur. Dolayısıyla bir parametre alır. Bu da double türünden değer döndürür. O yüzden bir değişkene atacaksak cast etmemiz gerekir. Eğer sonucu yine double türünde bir değişkene atacaksak cast işlemine gerek yoktur
        
        System.out.println(Math.sqrt(25));
        int b = (int)Math.sqrt(25);
        System.out.println(b);
        System.out.println(Math.sqrt(50));
        
        /* Math.abs() */
        System.out.println("***** Math.abs() *****");
        //Bu metod, bir sayının mutlak değerini alır. Negatif bir sayıyıy pozitife çevirip gösterir. Pozitif bir sayıyı ise aynen yazar.
        
        System.out.println(Math.abs(-40));
        int c = Math.abs(-40); 
        System.out.println(c);
        System.out.println(Math.abs(20)); 
        
        /* Math.floor() */
        System.out.println("***** Math.floor() *****");
        //Verilen sayıyı bir altındaki değere yuvarlar
        
        System.out.println(Math.floor(5.4));
        int d = (int)Math.floor(7.501);
        System.out.println(d);
        double e = Math.floor(8.001);
        System.out.println(e);
        System.out.println(Math.floor(9));
        
        /* Math.ceil() */
        System.out.println("***** Math.ceil() *****");
        //Bu metod, Math.floor metodunun aksine sayıyı üst değere yuvarlar. Bir nevi virgülden sonraki kısmı atar ve kalan sayıyı bir arttırır.
        
        System.out.println(Math.ceil(7.0001));
        int f = (int)Math.ceil(7.9999);
        System.out.println(f);
        System.out.println(Math.ceil(7));
        
        /* Math.max() */
        System.out.println("***** Math.max() *****");
        //Verilen sayılardan büyük olanı bulup verir. 2 parametre alır.
        
        System.out.println(Math.max(55, 56));
        System.out.println(Math.max(4, 5));
        System.out.println(Math.max(4, 4.0001));
        
        /* Math.min() */
        System.out.println("***** Math.min() *****");
        //Verilen sayılardan küçük olanı bulup verir. 2 parametre alır.
        
        System.out.println(Math.min(55, 56));
        System.out.println(Math.min(4, 5));
        System.out.println(Math.min(4, 4.0001));
        
        /* Math.random() */
        System.out.println("***** Math.random() *****");
        //Bu metod, rastgele sayılar üretmek için kullanılır. Bu metod da double türünde değer döndürür ve 0.0 ile 1.0 arasında değer üretir.

        System.out.println(Math.random());

        //sayıyı istediğimiz aralıkta üretmek istersek:
        int randomNumber1 = (int)(Math.random()*10);
        //double tipinde sayı ürettiğinden int'e çevirdim
        System.out.println(randomNumber1); 

        //Math.random() ile rastgele bir sayı ürettim. Üretilen değeri 10 ile çarpmamın sebebi bu metodun 0 ile 1 arasında double türünde değer üretmesidir.Bunu 10 ile çarparak virgülü sağa kaydırırız. Mesela; metoddan çıkan değer 0.654323 ise 10 ile çarptığımızda 6.54323 olur. Daha sonra sonucu int'e cast edince başındaki 6 sayısını alır

        //Başka örnekler
        System.out.println((int)Math.random()*15); //0-15 arasında sayı üretir
        System.out.println((int)Math.random()*15+20); //0-35 arasında sayı üretir

        /* Math.toDegrees() */
        System.out.println("***** Math.toDegrees() *****");
        //Bu metod, radyanı dereceye çevirir. Parametre olarak aldığı double değerin derece karşılığını geriye döndürür

        System.out.println("0.5 radyan "+Math.toDegrees(0.5)+" derecedir");
        System.out.println("1 radyan "+Math.toDegrees(0.1)+" derecedir");
        System.out.println("1.5 radyan "+Math.toDegrees(1.5)+" derecedir");

        /* Math.toRadians() */
        System.out.println("***** Math.toRadians() *****");
        //Bu metod, Parametre olarak aldığı derece cinsinden değeri radyan cinsine çevirir

        System.out.println("0 derece "+Math.toRadians(0)+" radyandır");
        System.out.println("45 derece "+Math.toRadians(45)+" radyandır");
        System.out.println("90 derece "+Math.toRadians(90)+" radyandır");

        /* Math.sin() */
        System.out.println("***** Math.sin() *****");
        //Bu metod, içerisine parametre olarak aldığı radyan cinsinden açının sinüsünü döndürür

        System.out.println(Math.sin(Math.toRadians(0)));
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(45)));

        /* Math.asin() */
        System.out.println("***** Math.asin() *****");
        //Bu metod, sin metodunun tersine parametre olarak sin değerini alır ve bu sinüs değerine karşılık gelen açıyı yine radyan cinsinden dönderir.

        System.out.println(Math.toDegrees(Math.asin(0)));
        System.out.println(Math.toDegrees(Math.asin(1)));
        System.out.println(Math.toDegrees(Math.asin(0.7071067811865476)));

        /* Math.cos() */
        System.out.println("***** Math.cos() *****");
        //Bu metod, içerisine parametre olarak aldığı radyan cinsinden değerin cosinüs değerini döndürür. Bir derecenin cosinüs değerini öğrenmek istiyorsak ilk olarak bu dereceyi radyana çevirmek gerekir. Çünkü bu metot, radyanı parametre olarak alır.

        System.out.println(Math.cos(Math.toRadians(0)));
        System.out.println(Math.cos(Math.toRadians(60)));
        System.out.println(Math.cos(Math.toRadians(45)));

        /* Math.acos() */
        System.out.println("***** Math.acos() *****");
        //Bu metod yine asin metodunda olduğu gibi içerisine parametre olarak bir cosinüs değeri alır ve geriye bu cosinüs değerine ait radyan cinsinden açıyı gönderir

        System.out.println(Math.toDegrees(Math.acos(0)));
        System.out.println(Math.toDegrees(Math.acos(1)));
        System.out.println(Math.toDegrees(Math.acos(0.7071067811865476)));

        /* Math.PI */
        System.out.println("***** Math.PI *****");
        //public static final double PI; sabiti  tanımlamak ile ayındır. Math sınıfının içerisinde de static ve final olarak tanımlanmıştır. Hem değeri değiştirilemez hem de sadece sınıf adı ile erişilebilir.

        System.out.println(Math.PI);

        /* Logaritma Metodları */
        System.out.println("***** Logaritma Metodları *****");
        //Math sınıfının içinde üç tane logaritma metodu bulunmaktadır. Hepsi genel olarak logaritma döndürmesine rağmen farklılık logaritma tabanlarından gelir. Bu metodlar şu şekildedir:

        //Double: log(double value): 'value' ile gönderilen değerin doğal logaritmasını (e tabanında) döndürür.
        //Double: log10(double value): 'value' ile gönderilen değerin 10 tabanındaki logaritmasını döndürür
        //Double: log1p(double value): 'value' ile gönderilen değerin 1 fazlasının doğal logaritmasını döndürür
        
        System.out.print("2.718281828459 sayısının doğal logaritması: ");
        System.out.println(Math.log(2.718281828459));
        //ln(e)=1
        System.out.print("10 tabanında 5'in logaritmik değeri: ");
        System.out.println(Math.log10(5));
        System.out.print("10 tabanında 10'un logaritmik değeri: ");
        System.out.println(Math.log10(10));
        System.out.print("(1.7 + 1)'in doğal logaritması: ");
        System.out.println(Math.log1p(1.7));

        /* Math sınıfının içerisindeki metodlar static'tir. O yüzden doğrudan sınıf adını kullanarak metodlara erişebildik. Bir nesne oluşturmaya ihtiyacımız kalmadı. */

    }

}
