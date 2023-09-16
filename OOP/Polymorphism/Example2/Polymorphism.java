package OOP.Polymorphism.Example2;

public class Polymorphism {
    public static void getObject(Alive alive){
        alive.write();
    }

    public static void main(String[] args) {
        Alive alive = new Alive();
        Alive human = new Human();
        Alive animal = new Animal();
        Alive plant = new Plant();

        getObject(alive);
        getObject(human); //upcasting(yukarı çevrim)
        getObject(animal); //upcasting
        getObject(plant); //upcasting
    }
}

/* Bu örnekte getObject() metodu Alive tipinde bir parametre alıyor.
 * Fakat bu Alive tipindeki parametreye biz Human, Animal, Plant tipinde parametreler gönderdik.
 * Bunda hata vermez çünkü upcasting yaptık.
 * Yani bizim gönderdiğimiz nesnenin olduğu sınıf, zaten Alive sınıfından türemiştir.
 * Yani her bitki bir canlıdır veya her hayvan bir canlıdır.
 * Yani metodumuz Alive tipinden parametre alıyor ama alınan parametrenin olduğu sınıf da (Animal) zaten Alive sınıfının bir alt sınıfıdır.
 * kalıtım ile ilişkisi de burada başlıyor.
 * Alt sınıflardan oluşturulan nesneler, üst sınıfın referansına bağlanabiliyor.
*/

/* Polimorfizm'de bir nesne, birden fazla nesneye bağlanabilir. */

/* Bu örnekte polimorfizm kullanmasaydık getObject() metodunu aşağıdaki gibi uzun uzun yazmak zorunda kalacaktık.
 * Polimorfizm, bizi bundan kurtarıyor.
 * Burada gelen parametrenin hangi sınıfa ait olduğu kontrol edilip ona göre write() metodu çağırılıyor.
 * Polimorfizm ile nesnemiz üzerinde karşılaştırma yapmadan nesnenin referansına göre işlem yaptırabiliyoruz.
*/

/*
 * public static void getObject(Alive animal){
        if(animal instanceof Alive){//a, Alive sınfından oluşturulmuşsa
            Alive a1 = animal;
            a1.write();
        }else if(animal instanceof Human){
            Human a1 = (Human) animal; //a nesnesi human sınıfına cast edildi
            a1.write(); 
        }else if(animal instanceof Animal){
            Animal a1 = (Animal) animal;
            a1.write();
        }else if(animal instanceof Plant){
            Plant a1 = (Plant)animal;
            a1.write();
        }
    }

    Polimorfizm, bizi bu kodları yazmaktan kurtarır. instanceOf anahtar kelimesi, nesnelerin ait olduğu yani oluşturulduğu sınıfları kontrol eder. Eğer o sınıftan oluşmuş ise true değilse false döner

    Cast işleminin sebebi de şudur; parametremiz Alive tipindedir. Fakat bu parametreyi, örneğin Human sınıfındaki bir nesneye atamak istediğimizde, cast işlemi yapmak zorundayız. Çünkü atanan nesnelerin sınıfları farklıdır.
 */

