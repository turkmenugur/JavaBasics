package StringClass.CompareStringObjects;


public class StartsWithAndEndsWith {
    /* StartsWith - EndsWith */

    /* Bu iki metod; String nesnesinin, referans olarak verilen String ile başlayıp başlamadığını veya sonlanıp sonlanmadığını kontrol eder
     * 
     * startsWith() metodu, metodu çağıran String nesnesi, referans olarak verilen String ile başlıyorsa true, başlamıyorsa false döndürür.
     * Aynı şekilde endsWith() metodu ise metodu çağıran String nesnesi, referans olarak verilen String ile bitiyorsa geriye true, bitmiyorsa geriye false döndürür.
     * 
    */

    public static void main(String[] args) {
        
        String text = "Java Programlama Dili";
        boolean control;
    
        control = text.startsWith("Java");
        System.out.println(control);
        control = text.startsWith("ava");
        System.out.println(control);
        control = text.endsWith("Dil");
        System.out.println(control);
        control = text.endsWith("Dili");
        System.out.println(control);

        /* startsWith() metodunun overload edilmiş başka bir formu vardır. Bu formda startsWith() metoduna hangi karakterden karşılaştırmaya başlayacağımızı belirtebiliriz. */

        control = text.startsWith("Java", 1);
        System.out.println(control);
        control = text.startsWith("av", 1);
        System.out.println(control);

    }

}
