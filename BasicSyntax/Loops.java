package BasicSyntax;
public class Loops {
    public static void main(String[] args) {
        //Belirtilen koşul doğru olduğu sürece döngü içerisindeki komutlar çalışır ve koşul dışına çıktığında ise döngü biter

        /* While Loop
         * 
         * Tekrar sayısı belli değildir
         * Döngü içerisinde oluşturacağımız şartlara göre döngü devam eder veya sonlanır
         */

        //example 1
        int number = 5;
        while(number>0){
            System.out.println("Sayının değeri: " + number);
            number--;
        }

        //example2
        int a = 10, j = 0, k = 0;
        while(a>j){
            System.out.println("i, j'den büyüktür");
            a-=2;
            j+=2;
            k++;
        } 
        System.out.println("Bu döngü " + k + " kere döndü");


        /* Do - While Loop
         * 
         * Döngüye girildikten sonra koşula bakıldığı için koşul yanlış olsa bile döngüye en az 1 defa girilir
        */

        //example 1
        int number2 = 1;
        do {
            System.out.println("number2 değşkeni: " + number2);
        } while (number2<0);

        //example 2 
        int x = 100, y = 40, z = 0;
        do {
            z++;
            x = x-10;
            y = y+10;
        } while (x>y);
        System.out.println("Döngü "+ z + " kere döndü");

        /* For Loop
         * 
         * for(başlangıç değeri; koşul; artım miktarı)
         *
         */

        //example 1
        for(int i = 1; i<=10; i+=2) {
            System.out.print(i + " ");
        }

        //Değişkeni for içerisinde tanımlamak yerine for'un üstünde int i; şeklinde de tanımlayabilirdir

        //example 2 
        int var;
        for(var = 1; var <= 50; var++){
            if(var % 7 == 0)
                System.out.println(var + " sayısı 7'ye tam bölünür");
        }

        /* for içerisinde belirttiğimiz başlangıç değeri, koşul ve artış miktarının yazılma zorunluluğu yoktur.
         * Yalnızca birini yazabilir veya hiçbirini yazmayabiliriz.
         * Eğer hiçbirini yazmazsak sonsuz döngüye girer
         * Eğer koşulu yazmazsak da döngü sonsuz döngüye girer
         * 
         * for(int i = 0; ; i++)
         * for( ; ;) 
         */

        //Döngüde değişken birden fazla olabilir
        int m,n;
        System.out.println("Döngü başladı");
        for(m=0, n=10; m<n; m++, n--){
            System.out.println(m + " değeri " + n + " değerinden küçüktür");
        }
        System.out.println("Döngü sona erdi");

        /* Enhanced for loop
         * 
         * For döngüsünü daha kısa bir biçimde de oluşturabiliriz
         * diğer dillerde adı foreach
         * 
         * Diziler ile kullanımı daha yaygındır
         */

        int[] dizi = {1,2,3,4,5};
        for(int i: dizi){
            System.out.print(i+" ");
        }

        /* Break ve Continue ifadeleri
         * 
         * break ifadesi ile kod bloğundan çıkıldığı gibi döngü de sona erdirilir
         * continue ise istenmeyen değerler için döngünün çalıştırılması istenmiyorsa kullanılır
         */

        //example 1
        int e = 0;
        while(true){
            if(e == 6){
                System.out.println("e değeri 6'ya eşit oldu");
                break;
            }else{
                System.out.println("e değeri: " + e);
                e++;
            }
        }

        //example 2
        int f;
        for(f = 1; f<=10; f++){
            if(f % 2 == 1)
            continue;
            else
            System.out.println(f+" sayısı 2'ye tam bölünür");
        }


    }
}
