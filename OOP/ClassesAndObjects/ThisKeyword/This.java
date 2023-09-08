package OOP.ClassesAndObjects.ThisKeyword;

public class This {
    
    String name;
    
    public void change(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        
        This t = new This();
        t.change("Uğur");
        System.out.println(t.name);

    }

    /* Parametre değişkeninini adı ile atadığımız nesne değişkeninin adı aynı olduğu için this anahtar kelimesini kullanmamız gerekiyor.
     * Eğer bunlar farklı olsaydı this anahtar kelimesini kullanmamız gerekmeyecekti
     * Eğer bu örnekte this anahtar kelimesi yazmasaydık null çıktısı verecekti 
    */

    /* this anahtar kelimesinin kullanıldığı bir başka yer ise, this anahtar kelimesinin bir metoddan geriye değer olarak döndürülebilmesidir. 
     * Herhangi bir metod içerisinde return this; dediğimizde o metoddan geriye o an çalışan nesnenin referansı döner. Bunu o anki çalışan metodun hangi nesne üzerinden çağrıldığını öğrenmek için kullanabiliriz.
     * 
     * this anahtar kelimesi o anda işlem  yapan nesnenin referansını dönderir.
     * Bu referans ile biz nesne değişkenlerine erişiriz.
     * Bir metod çağırıldığında, o metodun hangi nesne tarafından çağırıldığı bilinebilir.
     * sonuç olarak this anahtar kelimesi bu gibi isim çakışmalarında karışıklığı önlemek amacıyla kullanılır.
     * this anahtar kelimesi kullanılarak nesne değişkeninin kullanılacağı belirtilir.
     * 
     * this anahtar kelimesi yalnızca yapıcı metodlarda değil tüm metodlarda kullanılabilir.
     */

}
