package OOP.Encapsulation.InnerClasses.AnonymousClasses;

interface Factorial{
    //interface tanımlandı
    public double calculate();
}

public class AnonymousClassExample {
    

    public Factorial factorialOperation(final double number){
        return new Factorial() {
            // arayüz içerisindeki sınıfları kullanabilmek için isimsiz bir sınıf oluşturduk
            @Override
            public double calculate(){
                double x = 1;

                for(int i=1; i<=number; i++){
                    x *= i;
                }

                return x;
            }
        };
    }

    public static void main(String[] args) {
        AnonymousClassExample anonymousClassExample = new AnonymousClassExample();
        //metod, Factorial tipinde değer döndürdüğü için bu tipte nesne tanımlıyoruz
        Factorial factorial = anonymousClassExample.factorialOperation(7);
        System.out.println("7'nin faktöriyeli: " + factorial.calculate());
    }

}

/* Bu örnekte, yine sınıf içerisinde LocalClasses örneğinde olduğu gibi bir faktöriyel alma metodu tanımladık.
 * Metodun dönüş tipini, tanımladığımız arayüz olarak verdik ve bu sayede return kelimesinden sonra, arayüzün metodunu isimsiz bir sınıf içerisinde tanımlamadık.
 * Faktöriyel alma metodunun parametresine baktığımızda, final kelimesi ile işaretlendiğini görüyoruz.
 * Bunun sebebi ise; isimsiz sınıfların içerisinde kullanıldıkları metodların veya sınıfların, sadece final tipteki değişkenlerine erişebiliyor olmasındandır.
 * İsimsiz sınıfımızdan sonra noktalı virgül kullandığımıza da dikkat edelim.
 * Bunun sebebi ise return kelimesinden sonra tanımladığımız isimsiz metodun bir değer olarak algılanmasıdır.
*/
