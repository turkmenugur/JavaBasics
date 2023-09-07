package OOP.Encapsulation.AccessModifiers.PublicKeyWord;

public class People {

    public static void main(String[] args) {
        
        Home herkes = new Home();
        herkes.adres();
        System.out.println(herkes.katSayisi);

    }

    //Bu örnekte aynı pakette bulunuyorlar ama farklı pakette de olsalar yine de bu sınıf home sınıfının public elemanlarına erişebilir.
    
}
