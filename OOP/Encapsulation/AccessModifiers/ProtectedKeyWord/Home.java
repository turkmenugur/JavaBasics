package OOP.Encapsulation.AccessModifiers.ProtectedKeyWord;

public class Home {

    protected void bilgisayar(){ //protected metod tanımlandı
        System.out.println("Bilgisayar metodu");
    }

    protected String fatura = "Faturalar"; //protected değişken tanımlandı

    /* Protected olarak tanımlanmış elemanlara sadece Home sınıfından olanlar, bu sınıftan türetilmiş sınıflar ve bu Home sınıfı ile aynı pakette olan sınıflar erişebilir. */
    
}
