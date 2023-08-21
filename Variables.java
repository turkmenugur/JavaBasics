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


    }
}
