package StringClass.StringEditingMethods;

public class ValueOfMethod {
    /* ValueOf Metodu İle Veri Tiplerini String Veri Tipine Çevirme */

    /* Bu metod, veri tiplerini String veri tipine çevirmek için kullanılır.
     * Metod, aldığı parametreyi geriye String tipinde dönderir.
    */

    public static void main(String[] args) {
        int i = 10;
        float f = 11.f;
        double d = 12.d;
        long l = 100000000;
        char c = 'c';
        boolean b = false;
        Object o = new String("java");
        String s = "";

        s = String.valueOf(i);
        s = s + "-" + String.valueOf(f); 
        s = s + "-" + String.valueOf(d); 
        s = s + "-" + String.valueOf(l); 
        s = s + "-" + String.valueOf(c); 
        s = s + "-" + String.valueOf(b); 
        s = s + "-" + String.valueOf(o); 
        
        System.out.println(s);
    }
}
