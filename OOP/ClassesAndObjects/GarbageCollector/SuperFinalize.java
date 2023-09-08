package OOP.ClassesAndObjects.GarbageCollector;

//super.finalize() ile üst sınıfın finalize() metodu çağrılabilir

class A{

    A(){
        System.out.println("A sınıfından nesne oluşturuldu");
    }

    protected void finalize(){
        System.out.println("A'nın finalize metodu çalıştı");
    }

}

class B extends A{

    protected void finalize(){
        System.out.println("B'nin finalize metodu çalıştı");
    }

    B(){
        super.finalize();
        System.out.println("B sınıfından nesne oluşturuldu");
    }
}

public class SuperFinalize {

    public static void main(String[] args) {
        
        B nesne1 = new B();
        
        Runtime.getRuntime().gc();

    }
    
}

/* nesne1 adında bir nesne oluşturduk ve B sınıfının yapıcısı çalıştı. Üst sınıftan türetildiği için doğrudan ilk olarak A sınıfının yapıcısı çalışmış oldu. Daha sonra üst sınıfın finalize() metodunun çalışmasını istedik ve A sınıfının finalize() metodu çalıştı. Bundan sonra ise B'nin yapıcısındaki metin ekrana yazıldı. Bu işlemlerden sonra da Garbage Collector'u çağırdık ve gereksiz nesneler varsa temizlenmesini istedik. */
