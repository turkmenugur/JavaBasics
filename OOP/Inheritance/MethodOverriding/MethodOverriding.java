package OOP.Inheritance.MethodOverriding;

public class MethodOverriding {
    /* Bir sınıf, türetildiği sınıftaki metodu değiştirmek istediği zaman bunu overriding ile yapıyoruz. 
     * Bu şekilde, metodları override ettiğimiz zaman alt sınıf, üst sınıfın metodunu doğrudan kullanmak yerine kendine ait bir metodu oluyor.
    */

    /* Kalıtım konusunda, alt sınıf üst sınıfın elemanlarını tekrar tanımlamak zorunda kalmıyordur ve doğrudan kullanıyordu. Override ile istenilen metodlar tekrar tanımlanabilir ve aynı metodu kendine göre düzenleyebilir.
     * 
     * Bir metodun override edilebilmesi için belli başlı kurallar vardır. Her metod override edilemez.
     * 
     * 1- Override edilecek metodların dönüş tipi, metod adı, parametre listeleri aynı olmak zorundadır.
     * 2-Alt sınıftaki override edilecek metodun erişim belirleyeicisi, üst sınıftaki, override edilen metodun erişim belirleyicisinden daha yüksek derecede olmalı.
     * 
     * Example'de alt sınıftaki metodun erişim belirleyicisini public olarak tanımladık. Bu yüzden üst sınıfın aynı metodundaki erişim belirleyicisi, public'ten daha kısıtlı olmalıdır. Eğer alt sınıftaki metodu private olarak tanımlamış olsaydık üst sınıftaki metod private ve private'tan daha kısıtlı olmalıdır. private'tan daha kısıtlı olan yoktur. Mecburen üst sınıftakini de private olarak tanımlamak zorunda kalırdık.
     */
}
