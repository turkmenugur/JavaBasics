package OOP.Encapsulation.AccessModifiers.PrivateKeyWord;

public class Home {
    
    private void kasa(){ //private metod tanımlama
        System.out.println("Gizli kasa");
    }

    private String belge = "Gizli belge"; //private değişken tanımlama

    public static void main(String[] args) {

        Home father = new Home(); //Home sınıfından nesne oluşturuldu
        father.kasa(); // father nesnesi kasaya ulaşamya çalışıyor
        System.out.println(father.belge);

    }

    /* Private elemanlara sadece tanımlandığı sınıf içinden erişililebilir. Ne başka sınıftan türetilen nesne ile ne herhangi bir sınıftan ne de aynı pakette olan sınıf içerisinden erişilemez*/
}
