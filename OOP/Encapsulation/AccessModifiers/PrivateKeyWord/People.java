package OOP.Encapsulation.AccessModifiers.PrivateKeyWord;

public class People {
    //Home sınıfında private olarak tanımlanan değişken ve metodlara bu sınıftan erişilemez paket isimleri aynı olmasına rağmen

    public static void main(String[] args) {

        Home father = new Home(); //Nesne oluşturuşdu
        //father.kasa(); //Erişilemez
        //System.out.println(father.belge); //erişilemez 

    } 
    
}
