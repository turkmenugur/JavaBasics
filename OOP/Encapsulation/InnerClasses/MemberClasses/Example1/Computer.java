package OOP.Encapsulation.InnerClasses.MemberClasses.Example1;

public class Computer {
    public class MainBoard{
        //1.Dahili üye sınıf
    }

    public class Processor{
        //2.Dahili üye sınıf
    }

    public class RAM_Memory{
        //3.Dahili üye sınıf
    }

    public static void main(String[] args) {
        Computer.RAM_Memory RAM = new Computer().new RAM_Memory();
    }

    /* Örnekte dikkat etmemiz gereken nokta RAM_Memory sınıfının nesnesindir.
     * Bu sınıfın direkt olarak nesnesini oluşturabilmek için örnekte de olduğu gibi üst sınıf üzerinden nesnemizi oluşturuyoruz.
    */
}
