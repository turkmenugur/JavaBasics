package OOP.Encapsulation.InnerClasses.MemberClasses.Example3;

public class Calculate {
    //normal dahili üye sınıf ve normal sınıf üyeleri
    public class InnerMemberClass{
        private int x, y;

        public InnerMemberClass(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void multiply(){
            System.out.println("Çarpma işlemi sonucu: " + (x*y));
        }
    }

    //static dahili üye sınıf ve static üyeler
    public static class InnerMemberClass2{
        public static void sum(int num1, int num2){
            System.out.println("Toplama sonucu: "+ (num1+num2));
        }
    }

    //Calculate sınıfına ait main metodu
    public static void main(String[] args) {
        Calculate.InnerMemberClass iMemberClass = new Calculate().new InnerMemberClass(5, 8);
        iMemberClass.multiply();

        InnerMemberClass2.sum(5, 2);
    }

    /* Örnekte 2 dahili sınıf oluşturduk.
     * İlk dahili sınıfta constructor bulunuyor.
     * (Dahili sınıfların yapcısı olabiilr ama bu dahili sınıflardan bir nesne olu;turulduğu zaman yapıcısı otomatik olarak çağırılmaz.)
    */
}
