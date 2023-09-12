package OOP.Abstraction.Interface;

//Arayüz içerisinde arayüz konusuna örnek

//3 adet arayüz tanımlanmıştır
interface Arayuz1{

    interface Arayuz2{ //arayüz içinde arayüz
        public void metod2();
    }

    public void metod1();
}

interface Arayuz3{
    public void metod3();
}

class Sinif1 implements Arayuz1{

    @Override
    public void metod1() {
        System.out.println("Arayüz1'deki metod1 override edildi");
    }
    
}

class Sinif2 implements Arayuz1.Arayuz2{

    @Override
    public void metod2() {
        System.out.println("Arayüz2^deki metod2 override edildi");
    }
     
}

class Sinif3 implements Arayuz3{

    @Override
    public void metod3() {
        System.out.println("Arayüz3'teki metod3 override edildi");
    }

}

public class Example2 {
    public static void main(String[] args) {
        Sinif1 sinif1 = new Sinif1();
        sinif1.metod1();

        Sinif2 sinif2 = new Sinif2();
        sinif2.metod2();;

        Sinif3 sinif3 = new Sinif3();
        sinif3.metod3();
    }
}
