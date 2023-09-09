package OOP.Inheritance.UpCastingDownCasting.DownCasting;

public class Run {

    public static void main(String[] args) {
        Onion onion = new Onion();
        Vegetables vegetables = onion; //Upcasting
    
        Onion onion2 = (Onion)vegetables; //downcasting(1)
        onion2.sayName();

        SpringOnion springOnion = new SpringOnion();
        Onion onion3 = springOnion; //upcasting
        SpringOnion springOnion2 = (SpringOnion)onion3; //downcasting(2)
        springOnion2.sayName();

        /* Burada üst sınıf, alt sınıfın tipinde referans alması için zorlanıyor.
         * Downcasting(2) işleminde Onion sınıfından türetilmiş olan nesne, bir alt sınıfı olan SpringOnion sınıfının referansına bağlanıyor. Dolayısıyla oluşturulan onion2 nesnesinin sayName() metodu çalıştırılınca Onion sınıfının değil, SpringOnion sınfının sayName() metodu çalıştırılıyor.
         * 
         * Önceden belirttiğimiz gibi downcasting yaparken parantez içerisinde hangi referansa işaret edileceği yazılmak zorundadır.
         * 
         * Kalıtımda alt sınıf, üst sınıfın üyelerine erişebiliyorken; üst sınıf, alt sınıfın üyelerine erişemiyordu.
         * Fakat downcasting ile üst sınıfa ait bir referans ile alt sınıftaki üyelere erişilebilir. 
         */
    }

    
}
