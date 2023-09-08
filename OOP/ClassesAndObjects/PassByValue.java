package OOP.ClassesAndObjects;

public class PassByValue {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Eski değer: "+a);
        change(a);
        System.out.println("Yeni değer: "+a);

        //primitive tiplerde, metoda parametre olarak gönderilen değer, değişkenin bir kopyasıdır.
    }

    private static void change(int a) {
        a = a + 10;
    }
}
