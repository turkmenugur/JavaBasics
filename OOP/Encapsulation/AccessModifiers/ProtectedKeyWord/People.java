package OOP.Encapsulation.AccessModifiers.ProtectedKeyWord;

public class People {

    //Home sınıfı ile aynı pakette

    public static void main(String[] args) {
        
        Home akraba = new Home(); // akraba nesnesi
        akraba.bilgisayar(); //akraba nesnesi metoda erişmeye çalışıyor
        System.out.println(akraba.fatura);

    }
    
}
