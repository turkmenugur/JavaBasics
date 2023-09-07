package OOP.Encapsulation.ThisKeyword;

public class Example2 {
    
    String name;
    String surname;

    public Example2(String name) { //tek parametre alan constructor
        this(name, "Türkmen");
    }

    public Example2(String name, String surname) { //iki parametreli constructor
        System.out.println(name + " " + surname);
    }
    
    public static void main(String[] args) {
        
        Example2 e = new Example2("Uğur");

    }

    /* this anahtar kelimesinin bir başka kullanım amacı da aynı sınıf içerisindeki başka bir yapıcıyı çağırmaktır.
     * Örnekte, biri 1 parametre, diğeri 2 parametre alan 2 yapıcımız olsun. 1 parametre alan yapıcıdaki parametreye 1 parametre daha ekleyerek 2 parametre alan yapıcı metodu çağırabiliriz. 
    */

    /* Bu örnekte name ve surname olarak iki nesne değişkeni tanımladık. Bunun yanında 1 ve 2 parametre alan iki yapıcı tanımladık. main metodu içerisinde nesne oluşturduğumuzda tek bir String parametresi gönderdik ve dolayısıyla tek parametre alan yapıcı çalıştı. Bu yapıcıda ise this ile diğer yapıcıyı çağırdık. Çağırırken de yanına iki parametreli olması için bir String parametresi daha ekledik. Böylece iki parametremiz oldu ve iki parametre alan yapıcıyı çağırarak çalıştırdık. */

}
