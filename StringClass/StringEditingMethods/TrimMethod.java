package StringClass.StringEditingMethods;

public class TrimMethod {
    /* Trim Metodu ile String İfadenin Yanındaki Boşlukları Silme*/

    /* Bu metod, String ifadenin sağındaki ve solundaki boşlukları silerek düzenlenmiş bir kopyasını döndürür */

    public static void main(String[] args) {
        String text = " Bu cümlenin başındaki ve sonundaki" + " boşluklar trim metodu ile silinecektir.     ";

        System.out.println(text.trim());
    }

}
