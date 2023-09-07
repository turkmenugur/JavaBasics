package OOP.Encapsulation.GetterSetter;

public class GetterSetter {
    
    private int age; //private değişkenler tanımlandı
    private String name;

    public int getAge(){ //getter metod
        return age;
    }

    public void setAge(int age){ //setter metod
        this.age = age;
    }

    public String getName(){ //getter metod
        return name;
    }

    public void setName(String name){ //setter metod
        this.name = name;
    }

    public static void main(String[] args) {
        
        GetterSetter n1 = new GetterSetter();
        n1.setName("Uğur");
        System.out.println(n1.getName());
        n1.setAge(21);
        System.out.println(n1.getAge());;
    }


    /* GETTER SETTER
     * Java'da ve diğer dillerde private elemanlara erişmenin bir yolu vardır.
     * Java'da bunlar getter ve setter metodlar olarak bilinir
     * Bu metodlar sayesinde private olan elemanlar okunabilir veya değerleri değiştirilebilir.
     * Okuyabilmek için getter, yazabilmek için ise setter metodları kullanılır.
     * 
     * Getter metodlar okuma yaptığı için parametre almazlar. Setter metodlar ise private üyelere değer atadığı için parametre alırlar.
     * 
     * Getter metodlara istediğimiz adı verebiliriz ancak get kelimesi ile başlatmak kodun okunabilirliğini arttırır.
     *
     */



}
