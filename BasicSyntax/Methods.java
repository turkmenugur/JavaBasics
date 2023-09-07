package BasicSyntax;
public class Methods{
    public static void main(String[] args) {
        //Method Types
        printToScreen();

        String isim = sendName();
        System.out.println("İsim: "+isim);
        //System.out.println(sendName()); bu şekilde de yazılabilirdi

        multiply(5, 7);

        int biggestNumber = compareNumbers(15, 10);
        System.out.println(biggestNumber);

    
        //Method Overloading
        System.out.println(sumNumbers(10, 15));
        System.out.println(sumNumbers(4.0, 5.0));

        System.out.println(method1(4.0, 5));
        System.out.println(method1(5, 6.0));

        
        //Recursion
        System.out.println(faktöriyel(5));

        System.out.println("6. Sayı: " + fibonacci(6));


        //Static Methods
        System.out.println(Methods.methodStatic(3, 5));

        Methods m1 = new Methods();
        Methods m2 = new Methods();
        m1.methodStatic2(5);
        m2.methodStatic2(9);
        System.out.println(m1.x);
        System.out.println(m2.x);
        //İki çıktı da 9'u verir. Bunun sebebi static metodların nesneye değil sınıfa ait olmalarıdır. En son hangi değeri verirsek o değişkenin değeri artık o olur
        

        Sinif1.printSentence();
    
    }

    //Method Types
    //Parametresiz - değer döndürmeyen
    public static void printToScreen(){
        System.out.println("Metot çağırıldı");
    }

    //parametresiz - değer döndüren
    static String sendName(){
        return "Uğur";
    }

    //parametreli - değer döndürmeyen
    static void multiply(int num1, int num2){
        System.out.println(num1*num2);
    }

    //parametreli - değer döndüren
    static int compareNumbers(int a, int b){

        if(a>b)
            return a;
        else if(b>a)
            return b;
        else 
            return a;
    }

    //Method Overloading
    /* Overloading kavramına göre aynı isimli iki method olabilir.
     * Fakat bu methodların parametre tipleri, parametre sıraları
     * ve parametre sayılarından herhangi birinin farklı olması gerekir
     * 
     * Metodların her şeyi aynı fakat döndürdüğü değer farklı olsaydı overloading olmazdı 
    */

    //Example 1
    static int sumNumbers(int num1, int num2){
        return num1 + num2;
    }

    static double sumNumbers(double num3, double num4){
        return num3 + num4;
    }

    //Example 2
    public static int method1(int num1, double num2){
        return num1;
    }
    public static int method1(double num3, int num4){
        return num4;
    }

    //Recursion
    /* Bir metodun belli bir şart sağlanana kadar kendini sürekli olarak çağırmasıdır
     * Recursive metodlar döngülerin yerine çağrılabilir
     * Recursive metodlar stack mantığına göre çalışırlar
     * Recursive fonksiyonların her çağırılışında değişkenler için bellekte yer ayrılır.(sadece yerel değişkenler)
     * 
     * Faktöriyel işlemini normal metod ve döngüler ile yaparsak bu yöntemin adı iterative olurdu
     */

    public static int faktöriyel(int number){
        if(number == 1){
            return 1;
        }else{
            return (number * faktöriyel(number - 1));
        }
    }

    public static int fibonacci(int x){
        if(x <= 1)
            return x;
        else
            return fibonacci(x-1) + fibonacci(x-2);
    }


    //Static Method

    /* İki kullanım amacı vardır:
     * Nesne oluşturmadan sınıf içerisindeki metodlara erişmeyi sağlar
     * Her nesne için aynı işi yapan statik bir metod tanımlanır ve bütün nesneler için ayrı ayrı oluşturulmaz
     * 
     * Statik bir metoddan statik olmayan bir metoda erişilemez 
     * Statik olmayan bir metoddan ise statik bir metoda erişilebilir
     * 
     * Statik metodlar override ve overload edilemezler
     */

    //Example 1
    public static int methodStatic(int a, int b){
        return a*b;
    }

    //Math sınıfının metodları static olarak tanımlanmıştır ve bu metodlara sınıf adı ile erişebiliriz

    //Example2
    //Statik metodlar her nesne için ayrı ayrı oluşturulmaz. Bir statik metod tanımlanır ve her tüm nesneler bu metodu ortak olarak kullanır
    public static int x;
    public static void methodStatic2(int a){
        x = a;
    }


    /*Main metodu neden statik?
     * Program çalıştırıldığında ilk olarak main metodu çalıştırılır ve bu metod bir sınıf içerisinde bulunur.
     * Program ilk çalıştırıldığında herhangi bir nesne oluşturulmaz.
     * Nesne yokken main metoduna erişebilmek için de statik olarak tanımlanması gerekir ki doğrudan sınıf adı kullanılarak main metodu çalışabilsin.
     * Bu yüzden main metodu her zaman statik olmalıdır.
     * Main metodunun public olarak tanımlanmasının sebebi ise JVM'nin bu metoda dışarıdan erişebilmesi gerekliliğidir
     */


}

class Sinif1{
    static int x = 28;
    static int y = 64;

    static void printSentence(){
        System.out.println("X and Y variables: " + x + " and " + y);
    }
}
