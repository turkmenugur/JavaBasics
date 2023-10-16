package ExceptionHandlingConcept;

public class ThrowsKeyWord {
    /* Normalde hata kontrolü, içinde bulunulan metod tarafından gerçekleştirilir.
     * Peki biz hata kontrolünü burada yapmak istemiyorsak ne yapmalıyız?
     * Bunun için yapmamız gereken, hata kontrolünü metodumuzun çağrıldığı yerde yapmaktır.
     * 
     * Metodun çağrıldığı yerde try-catch mekanizması kurulur. Hatamızın oluşabileceği metodda ise throws anahtar kelimesi kullanılır. Bu anahtar kelime sayesinde metod içerisinde bir hata oluştuğunda hatayı içeren nesne, çağrıldığı metoda aktarılır. 
    */

    public void metod1() throws Exception{
        int array[] = new int[]{2,5,4};
        System.out.println("Burası metod1");
        System.out.println(array[3]);
    }

    public void metod1Call(){
        System.out.println("Burası metod1'i çağırır");
        try {
            metod1();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("metod1 çağırıldı");
    }

    public static void main(String[] args) {
        ThrowsKeyWord t1 = new ThrowsKeyWord();
        t1.metod1Call();
        System.out.println("metod1Call metodu çağırıldı");
    }
}
