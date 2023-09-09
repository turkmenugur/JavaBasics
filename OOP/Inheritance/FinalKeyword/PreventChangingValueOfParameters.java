package OOP.Inheritance.FinalKeyword;

public class PreventChangingValueOfParameters {
    /* final parametreleri, bir metoda gönderdiğimiz parametrelerin değişmesini istemediğimiz durumlarda kullanırız. */

    public void sent(){
        int x = 5;

        take(x);

        
    }

    public void take(final int y){
        //y = y+y;
    }

    /* Bu örnekte 'The final local variable y cannot be assigned. It must be blank and using x compund assignment' hatası ile karşılaşıyoruz.
     * Çünkü parametre olarak aldığımız y değeri final olarak tanımlanmış yani sabit.
     * Daha sonra take() metodu içerisinde ise bu değerin iki katını tekrar aynı değere atıyoruz.
     * Bu metod içerisindeki fonksiyon eğer int z = y+y; olsaydı hata almayacaktık.
     * Çünkü alınan değer bir başka değere atanmış olacaktı yani y'nin değeri değişmeyecekti.
     */
}


