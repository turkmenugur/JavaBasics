package ClassesAndObjects;

public class PassByReference {
    int x;

    public static void main(String[] args) {
        
        PassByReference p1 = new PassByReference();
        
        p1.x = 5;

        System.out.println("Eski değer: " + p1.x);

        p1.change(p1);

        System.out.println("Yeni değer: " + p1.x);
        
    }

    private void change(PassByReference p1) {
        p1.x = p1.x + 10;
    }

    /* Referans tiplerde metodlara parametre olarak nesnenin adresi gönderilir.
     * Bellekte aynı yeri işaret ettikleri için orijinal değeri de değişir.
     */
}
