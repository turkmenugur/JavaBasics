package OOP.Polymorphism.Example3;

class Alive{
    public void write(){
        System.out.println("Alive class");
    }
}

class Human extends Alive{
    public void write(){
        System.out.println("Human class");
    }
}

class Animal extends Alive{
    public void write(){
        System.out.println("Animal class");
    }
}

class Plant extends Alive{
    public void write(){
        System.out.println("Plant class");
    }
}

public class Polymorphism {
    public static void getObject(Alive alive){
        alive.write();
    }

    public static void main(String[] args) {
        Alive[] alives = new Alive[3];
        
        for (int i = 0; i < alives.length; i++) {
            int indis = (int)(Math.random() * 3); 
            switch(indis){
                case 0:
                    alives[indis] = new Plant(); //upcasting
                    getObject(alives[indis]);
                    break;
                case 1:
                    alives[indis] = new Animal(); //upcasting
                    getObject(alives[indis]);
                    break;
                case 2:
                    alives[indis] = new Human(); //upcasting
                    getObject(alives[indis]);
                    break;
            }
        }
    }
}

/* Örnekte bir geç bağlama olayı gösterilmiştir.
 * Alive sınıfından 3 elemanlı nesne dizisi üretiliyor.
 * Daha sonra for döngüsü 3 kere dönüyor.
 * Bu döngü içerisinde her seferinde bir rastgele sayı üretiliyor.
 * Bu üretilen rastgele sayı, switch içerisine koyuluyor ve kontrol yapılıyor.
 * Sayının 0-1-2 olmasına göre farklı referanslardan nesneler üretiliyor.
 * Bu referanslar her çalışma anında rastgele olarak belirleniyor.
 * Her döngüde belirlenen indisli nesne, getObject() metoduna gönderiliyor ve gelen nesneye göre write() metodları çağırılıyor.
 * Programı her çalıştırdığımızda çıktıların farklı olduğunu görebiliriz.
 * İşte bu nesnelerin çalışma anında belirlenmesine geç bağlama deniliyor
*/
