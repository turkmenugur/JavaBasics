package OOP.Polymorphism.Example1;

class SuperClass{
    public void write(){
        System.out.println("Burası üst sınıf");
    }
}

class SubClass1 extends SuperClass{
    public void write(){
        System.out.println("Burası alt sınıf 1");
    }
}

class SubClass2 extends SuperClass{
    public void write(){
        System.out.println("Burası alt sınıf 2");
    }
}

public class Polymorphism {
    public static void getObject(SuperClass object){
        object.write();
    }

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        SubClass1 subClass1 = new SubClass1();
        SubClass2 subClass2 = new SubClass2();
        getObject(superClass);
        getObject(subClass1);
        getObject(subClass2);
    }
}

/* Bu örnekte 3 sınıf var.
 * En tepede SuperClass, bundan türemiş olan SubClass1 ve SubClass2 sınıfları var.
 * Bu türetilmiş sınıflar, super sınıftaki wirte() metodunu override ediyorlar.
 * 
 * main metodunda bu 3 sınıftan 3 tane nesne oluşturduk ve daha sonra bu nesneleri, getObject() metoduna parametre olarak gönderdik.
 * 
 * Bu getObject() metodu, parametre olarak SuperClass tipinde object adında bir parametre alıyor.
 * Bu object parametresi, hem superClass, hem subClass1 hem de subClass2 nesnelerinin yerine geçti. Yani bu 3 sınıf tipinde de nesneler aldı. Yani birçok biçime girdi.
 * İşte polimorfizm kavramının temelinde de bu yatar.
 * 
 * Bu metoda 3 defa parametre gönderdik. Bu parametre olan nesnelerin her biri farklı sınıflardan türetilmişlerdir. getObject() metodunda ise bu alınan nesne üzerinden write() metodu çağrılır.
 * 
 * Örneğin;
 * SubClass1 sınıfı, SuperClass'daki metodu override ettiği için Subclass1'deki write() metodu çağırılmıştır.
*/
