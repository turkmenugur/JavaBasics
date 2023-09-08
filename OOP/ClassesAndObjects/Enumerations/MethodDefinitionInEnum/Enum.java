package OOP.ClassesAndObjects.Enumerations.MethodDefinitionInEnum;

enum Maaslar{

    Ali(1000), Ugur(1200);
    
    private int maas;
    
    Maaslar(int m){
        maas = m;
    }

    int maasGoster(){
        return maas;
    }

    static void metod2(){
        System.out.println("metod2 çalıştı");
    }
    
}

public class Enum {
    
    public static void main(String[] args) {
        
        System.out.println(Maaslar.Ugur.maasGoster());

        System.out.println(Maaslar.Ali.maasGoster());

        Maaslar.metod2();

    }

    //Metdo2'ye main içerisinde erişebilmek için static olarak tanımladık

}
