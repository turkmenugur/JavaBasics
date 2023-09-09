package OOP.Inheritance.FinalKeyword;

public class PreventMethodsOverriding {
    /* Metodlar final olarak tanımlanabilir.
     * Değişkenlerdeki gibi sabit tanımlama amacıyla kullanılmazlar.
     * Metodları final olarak tanımlarsak override edilemezler.
     * Alt sınıflardan değiştirilmesini istemediğimiz metodlar için kullanılır.
     */
}

/* 
 * public class FinalMetod {
    public final void deneme(){ //final metod
        System.out.println("Bu metod override edilemez");
    }
}

public class FinalMetod2 extends FinalMetod{
    public final void deneme(){
        //override edilemez
        System.out.println("Bu metod override edilmeye çalışıldı");
    }
}
 */

