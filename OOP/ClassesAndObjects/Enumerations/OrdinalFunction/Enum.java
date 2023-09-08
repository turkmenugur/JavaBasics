package OOP.ClassesAndObjects.Enumerations.OrdinalFunction;


enum Cars5{
    CAMARO, FORD;
}

public class Enum {
    public static void main(String[] args) {
        
        System.out.println(Cars5.CAMARO.ordinal());
        System.out.println(Cars5.FORD.ordinal());

    }
}
/* Enumlar yapı olarak hem dizilere hem sınıflara benzerler.
 * Diziye benzeyen kısmı enumların bir indise sahip olmasıdır.
 * Her elemanın bir indisi vardır ve ilk indis dizilerdeki gibi sıfırdan başlar
*/