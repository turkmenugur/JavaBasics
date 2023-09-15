package OOP.Encapsulation.InnerClasses.MemberClasses.Example2;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.RunElement;

public class InnerClassExample {
    //1.dahili sınıf asal sayı hesaplamak için kullanılır
    public class PrimeNumber{
        public boolean primeNumber(int primeNumber){
            int divider = 0;
            boolean control;

            for(int i=2; i<primeNumber; i++){
                if(primeNumber%i==0){
                    divider++;
                }
            }

            if(divider == 0){
                control = true;
            }
            else{
                control = false;
            }

            return control;
        }
    }

    //2.dahili sınıf mükemmel sayı hesaplamak için kullanılır.
    protected class PerfectNumber{
        //kendisi hariç bölenleri toplamı kendisine eşit olan sayıdır.
        protected boolean perfectNumber(int perfectNumber){
            int dividerSum = 0;
            boolean control;

            for(int i=1; i<perfectNumber; i++){
                if(perfectNumber%i==0)
                    dividerSum += i;
            }

            if(dividerSum == perfectNumber)
                control = true;
            else
                control = false;

            return control;
        }
    }

    //3.dahili sınıf fibonacci serisi elemanlarını bulmak için kullanılır
    private class FibonacciSeries{
        //fibonacci dizisi, her sayının kendinden öncekiyle toplanması sonucu oluşan sayı dizisidir. İlk iki elemanı 1'dir.
        private ArrayList fibonacciSerie(int elementNumber){
            ArrayList<Integer> fibonacci = new ArrayList<>();
            fibonacci.add(0,1);
            fibonacci.add(1, 1);
            //ilk iki indise 1 ekledik

            for(int i=0; i<elementNumber-2;i++){
                fibonacci.add(i+2, fibonacci.get(i)+fibonacci.get(i+1));
            }

            return fibonacci;
        }
    }

    public static void main(String[] args) {
        //dahili sınıflar için nesne

        InnerClassExample.PrimeNumber prime = new InnerClassExample().new PrimeNumber();
        InnerClassExample.PerfectNumber perfect = new InnerClassExample().new PerfectNumber();
        InnerClassExample.FibonacciSeries fibonacci = new InnerClassExample().new FibonacciSeries();

        System.out.println(prime.primeNumber(5));
        System.out.println(prime.primeNumber(413));
        System.out.println(perfect.perfectNumber(6));
        System.out.println(perfect.perfectNumber(12));
        System.out.println(fibonacci.fibonacciSerie(7));
        System.out.println(fibonacci.fibonacciSerie(11));
    }

    /* main metodu başka bir sınıfın üyesi olsaydı private tanımlı FibonacciSeries sınıfın nesnesini tanımlarken hata alırdık. */

    /* Ana sınıf dahili üye sınıfın tüm alanlarına erişebilir. Aynı şekilde dahili üye sınıf, kendisini çevreleyen sınıfın tüm alanlarına erişebilir. */
}
