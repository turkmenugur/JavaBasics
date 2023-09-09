package OOP.Inheritance.UpCastingDownCasting.UpCasting;

public class Run {
    public static void main(String[] args) {
        Vegetables vegetables = new Vegetables();
        vegetables.sayName();

        Onion onion = new Onion();
        onion.sayName();

        SpringOnion springOnion = new SpringOnion();
        springOnion.sayName();

        RedOnion redOnion = new RedOnion();
        redOnion.sayName();


        //UpCasting
        Vegetables vegetables2 = new Vegetables(); //UpCasting(1)
        vegetables2.sayName();

        Vegetables vegetables3 = new Onion(); //UpCasting(2)
        vegetables3.sayName();

        Onion onion2 = new SpringOnion(); //UpCasting(3)
        onion2.sayName();

        Onion onion3 = new RedOnion(); //UpCasting(4)
        onion3.sayName();
        
        /* Çıktı yine aynısı olacaktır. Çünkü biz kalıtıma aksi bir şey yapmadık.
         * Zaten her Onion bir Vegetable'dır. Her SpringOnion da bir Onion'dır.
         * 2.upcasting yapmamızda Onion sınıfından bir nesne oluşturduk ve bu nesneyi üst sınıfı olan Vegetable sınıfının referansına bağladık. Diğer upcasting satırları da bu şekildedir.
        */

        //Aynı satırları şu şekilde de yazabilirdik

        Vegetables vegetables4 = new Vegetables();
        vegetables4.sayName();

        Vegetables vegetables5 = (Vegetables)new Onion();
        vegetables5.sayName();

        Onion onion4 = (Onion)new SpringOnion();
        onion4.sayName();

        Onion onion5 = (Onion)new RedOnion();
        onion4.sayName();

        /* Yukarıda aslında aynı şeyi yaptık.
         * Sadece referans olarak belirlediğimiz sınıfa doğru cast işlemi yaptık.
         * Upcasting yaparken bunu yapmak zorunlu değildir.
         * Fakat Downcasting işleminde bu zorunludur
        */




    }
}
