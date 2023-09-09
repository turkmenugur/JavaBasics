package OOP.Inheritance.MethodOverriding.Example2;

public class B extends A{
    int z;
    B(int i, int j, int k){
        //B sınıfının yapıcısı
        super(i, j); //i ve j üst sınıfın yapcısına gönderildi
        z = k; //alınan k değeri z'ye atandı
    }

    void printConsole(String text){
        //metod overriding
        System.out.println(text + z);
    }

    public static void main(String[] args) {
        B nesne = new B(6, 1, 8);  //B'den nesne oluşturulup ilk değer ataması yapıldı
        nesne.printConsole("Z'nin değeri"); //B sınıfının printConsole()metodu çağırıldı
        nesne.printConsole(); //A sınıfının printConsole() metodu çağırıldı
    }
}
