public class Variables {
    public static void main(String[] args) {
        
        /* PRIMITIVE TIPLER */
        /* Belleğin stack alanında tutulurlar
         * İşlemler değişkenin kendi değeri değil kopyası üzerinden yapılır
         */

        /* BYTE
         * 8 Bittir
         * Bellekte 1 byte yer kaplar
         * -128 ile 127 arasında değer alır
         * Varsayılan değeri 0'dır
         */

        byte a = 5;

        /* SHORT
         * 16 bittir
         * -32768 ile 32767 arasında değer alır
         * Varsayılan değeri 0'dır
         */

        short b = 32767;

        /* INT 
         * 32 bittir
         * Bellekte 4 byte yer kaplar
         * -2^31 ile 2^31 - 1 arasında değer alır
         * Varsayılan değeri 0'dır
        */

        int c = 2023;

        /* LONG
         * 64 bittir
         * -2^63 ile 2^63 - 1 arasında değer alır
         * Varsayılan değeri 0L'dir
         */

        long d = 665455664;

        /* FLOAT
         * 32 bittir
         * Ondalık sayı türünde -3.4*10^38 ile 3.4*10^38 arasında değer alır
         * Varsayılan değeri 0.0f'dir
         */

        float e = 0.05f;

        /* DOUBLE 
         * 64 bittir
         * Ondalık sayı türünde -1.7*10^308 ile .7*10^308 arasında değer alır
         * Varsayılan değeri 0.0d'dir
        */

        double f = 5.5546548;

        /* CHAR
         * 16 bittir
         * Karakter türünde değerler alır
         * İçerisine yalnızca 1 harf, rakam veya işaret girebilir
         * Girilen değerler '' arasına yazılır
         * varsayılan değer \u0000 'dır
         */

        char g = 'A';

        /* BOOLEAN
         * Yalnızca 2 değer alır: true - false
         * Bellekte 1 bit yer kaplar
         * Varsayılan değeri false'tur
         */

        boolean h = true;
        boolean i = 3<2;


        /* REFERANS TİPLER */
        /* Değişkenlerin adresleri tutulur
         * Belleğin heap alanında tutulurlar
         * new anahtar sözcüğü ile tanımlanırlar
         * İşlemler değişkenin kendisi ile yapılır
         */

        /* STRING
         * Karakter dizilerinin birleşmesinden oluşmuştur
         * "" içerisinde tanımlanır
         * 
         */

        String s1= "Uğur";
        System.out.println(s1);
        s1 = "Ali";
        System.out.println(s1);

        /* Primitive tipleri referans tipi şeklinde yazma
         *
         * Bir değişken ilkel olarak tanımlanmasının yanı sıra o veri tipinin sınıfı ile de tanımlanabilir.
         * Değişkenlerin veri tipleri aynı zamanda bir sınıftır
         * 
         * Bunlardan yola çıkarak şunu diyebiliriz ki; int veri tipi Integer sınıfının bir öğesidir. Yani Integer sınıfı, int tipini sarmalar. buna wrapper denir.
         * 
         * Integer tipinde tanımlanmış bir değişken java.lang.Integer sınıfının metodlarını kullanabilirken int tipinde tanımlanmış değişken bunları kullanamaz
         * 
         * Primitive değişkenler (int, byte vs.) serileştirme işlemine tabi tutulamazlar 
         * 
         * Integer tipindeki bir değişkene null değerini verebiliriz fakat int tipinde bu mümkün değildir.
         */

        int j = 5; //primitive değişken tipi
        Integer k = new Integer(6);//referans tipindeki değişken / bu yazım java 9 ile kaldırıldı
        Integer l = 7;
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);

        //Değişkenler üzerinde okunabilirliği arttırmak için _ koyabiliriyoruz. Bu çizgiler derleyici tarafından okunmuyor.

        int tel = 444_57_444;
        System.out.println(tel);

        //İkili tabandaki sayıları değişkende tutma
        //binary sayının başına 0b koyuyoruz

        int x = 0b11110;
        float y = 0b010101;
        byte z = 0b111111;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //Boxing ve unboxing kavramları
        /* Primitive tiplerin wrapper sınıflar içine gömülmesine boxing
         * Bunun tersi olarak da sınıf nesnelerinin ilkel tiplere dönüştürülmesine de unboxing denir
         * Bunları derleyici otomatik olarak yapar
         * Normalde r değeri bir nesne olduğu için bunun değerini arttıramayız. Bunu yapabilmek için unboxing işlemine ihtiyaç vardır. Yani bunu ilkel bir tipe dönüştüremeyiz. Daha sonra ihtiyaca göre tekrar referans tipine dönüştürebiliriz. Bu gibi işlemler için boxing ve unboxing kullanılır.
        */

        int m = 5;
        Integer n = new Integer(m); //boxing
        int o = n.intValue(); //unboxing

        //Lokal değişkenler
        /* Döngü veya metod içerisinde tanımladığımız değişkenlerin yaşam süresi, o döngü veya metod bloklarından çıkana kadardır.
         * Bloktan çıktığı zaman değişkenin sakladığı değer kaybolur.
         * Burada tanımladığımız bir değişkene dışarıdan erişemeyiz. Bunlara lokal değişkenler denir.
         */

        for(int p = 0; p<3 ; p++){
            int toplam = 1;
            toplam += toplam;
        }

        // System.out.println(toplam); //Erişilemez

        /* Type Casting */

        //String to int
        String variable = "5";
        int i1 = Integer.valueOf(variable);
        int i2 = Integer.parseInt(variable);

        //valueOf metodu parseInt metoduna göre daha yavaştır. Ayrıca parseInt metodu int tipinde bir veri döndürürken valueOf metodu ise integer tipinde bir nesne döndürür

        //int to String
        int num = 9;
        String string1 = String.valueOf(num);
        String string2 = Integer.toString(num);

        //double to int
        double d1 = 345.2;
        int s2 = (int)d1;
        System.out.println(s2);

        //int to double
        int s3 = 345;
        double d2 = (double)s3;
        System.out.println(d2);

        //float to long
        float fltNumber = 347.6f;
        long l1 = (long)fltNumber;
        System.out.println(l1);

        //long to float
        long lngNumber = 3578;
        float f2 = (float)lngNumber;
        System.out.println(f2);


        // final - sabit tanımlama
        /* Programımızın herhangi bir yerinde değerinin değişmesini istemediğimiz değişkenleri sabit olarak tanımlarız
         * final anahtar kelimes ile yapılmaktadır.
         * Sabitlerde ilk değer atanması zorunluluğu vardır.
         * Ya tanımlandığı ilk anda değeri verilecek ya da yapıcılar ile değeri atanacak
        */

        final int r = 5;
        // r = 10; //hata alıyoruz

        // final String ad;
        // System.out.println(ad); //ilk değer verilmediği için hata alıyoruz

        //Metod içinde tanımladıysak tanımlandığı satırdan sonra ilk değerini verebiliriz ancak metod içinde tanımlamadıysak tanımlandığı satırda ilk değeri verilmeli

        final String string;
        string = "a";
        System.out.println(string);

    }

    //Metod dışında olduğu için hatalı kullanım
    // final String s2;
    // s2 = "a";
}
