package OOP.Encapsulation.InnerClasses.LocalClasses;

interface functions{
    public double factorial(double number);
}

public class LocalClassExample {
    public double factorial(double number){
        //yerel sınıfı çevreleyen metod
        double result;

        class factorialOperation implements functions{
            //yerel sınıf
            private double result2 = 1;

            @Override
            public double factorial(double number2) {
                for(int i=1; i<=number2;i++){
                    result2 *=i;
                }
                return result2;
            }

        }
        //yerel sınıfın bir nesnesini oluşturduk
        factorialOperation f = new factorialOperation();
        result = f.factorial(number);
        
        return result;
    }    

    public void calculate(){
        //factorialOperation f = new factorialOperation(); yaparsak
        //metod, sınıfı tanımadığından hata ile karşılaşırız
    }

    public static void main(String[] args) {
        LocalClassExample localClassExample = new LocalClassExample();
        System.out.println("9'un faktöriyeli: " + localClassExample.factorial(9));
    }
}

/* Bu örnekte, sınıfın içerisinde bir metod oluşturduk ve bu metodun içinde bir yerel sınıf oluşturduk.
 * İşlemleri yerel sınıf içerisinde yaptık.
 * Dönen sonuca dikkat ettiğimizde, main metoduna gönderdiğimiz sonuç değişkeni ile asıl sonuç değişkeni farklıdır.
 * Bunun sebebi main metodu içerisinden direkt olarak yerel sınıf metodlarına veya değişkenlerine ulaşamadığımızdandır.
 * Örnekte görüldüğü gibi metodun dışarısında boş bir metod tanımladık ve bu metoddan yerel sınıfa erişmeye çalıştık.
 * Böyle bir durumda metod, yerel sınıfı görmediğinden hata ile karşılaştık.
 * Son olarak tanımladığımız ana metoddan dönen sonucu ekrana yazdırdık ve örneği sonlandırdık.
*/

//Yerel sınıflar da dahili sınıflar gibi yapıcıya sahip olabilirler
