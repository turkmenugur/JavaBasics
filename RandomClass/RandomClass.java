package RandomClass;

import java.util.Random;

public class RandomClass {
    /* Rastgele sayı üretmek için Math sınıfının yanında Random sınıfı da kullanılır. Random sınıfı sadece int türünde değil float, byte, double gibi türlerde de sayı üretebilir.
     * 
     * Bu sınıfı kullanmak için önce paket ismini import ediyoruz
     * import java.util.Random;
     * 
    */

    Random random = new Random(); //random sınıfından random adında bir nesne oluşturduk
    int a = random.nextInt(10); //bu r nesnesinden int tipinde sayı üretiyoruz

    //Burada parantez içine 10 yazmamızın sebebi, 0'dan 10'a kadar değerler üretmesini istememizdir. Fakat buna 10 dahil değildir, 0 dahildir. Hangi değere kadar sayı üretilmesini istiyorsak parantez içine onu yazarız. Eğer parantez içerisini boş bırakırsak -2147483648 ve +2147483647 arasındaki bütün int değerlerini üretir

    /*  Diğer türlerde sayı üretmek istiyorsak kullanacağımız kodlar; 

        long l = r.nextLong(); //long tipinde rastgele bir sayı üretir.
        float f = r.nextFloat(); //float tipinde rastgele bir sayı üretir.
        double d = r.nextDouble(); //double tipinde rastgele bir sayı üretir.
    */

    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("Int: " +r.nextInt());
        System.out.println("Boolean: " +r.nextBoolean());
        System.out.println("Double: " +r.nextDouble());
        System.out.println("Float: " +r.nextFloat());
        System.out.println("Long: " +r.nextLong());
        System.out.println("Gaussian: " +r.nextGaussian()); //Bir çeşit double tipi


        System.out.println("*****Başka bir örnek*****");

        int number=5, value=0;
        while(true){
            int i = r.nextInt(11);
            if(i!=number){
                value++;
            }
            else{
                System.out.println("Sayı "+value+". denemede bulundu");
                break;
            }
        }

        //Bu örnekte while(true) ile sonsuz döngüye girdik. Daha sonra 0 ile 11 arasomda bir değer üreterek bunu i değişkenine attık. Program başlangıcında belirlediğimiz sayı değişkenini kaçıncı denemede bulacağını if döngüleri ile kontrol ettik. Rastgele üretilen sayı ile başlangıçta belirlediğimiz sayı aynı olduğunda break; ile döngüden çıktık.

        System.out.println("*****Başka bir örnek*****");

        for(int i=0; i<3;i++){
            int number1 = r.nextInt(6);
            number1 += 1;

            int number2 = r.nextInt(6);
            number2 +=1;

            System.out.println("Zarda gelen sayılar:");
            System.out.println(number1+" - "+number2);
        }

        //Bu örnekte, for döngüsü ile 3 kere zar atıyoruz. number1 ve number2 değişkenlerini 1 arttırmamızın sebebi ise şudur. Eğer nextInt() metodu ile 0 değeri üretilirse bunu 1 yapmamız gerekir çünkü zarlarda 0 sayısı bulunmaz. Üst sınıf olarak ise 6 verdik. En fazla 5 sayısı üretilir. Arttırma işlemi ile bu yine 6'ya çıkar ve en fazla 6 üretilir.

    }


    
}
