package StringClass.CompareStringObjects;

public class EqualsAndEqualsIgnoreCase {
    /* equals() ve equalsIgnoreCas() metodlarını String nesnelerinin birbirine eşit olup olmadığını kontrol ederken kullanırız.
     * 
     * equals() metodu, referans olarak aldığı String nesnesini kendisini çağıran String nesnesiyle karşılaştırır. Eğer iki String nesnesi de aynı karakterşeri aynı sırada içeriyorsa geriye 'true' değer döndürür; iki String nesnesi birbirine eşit değilse 'false' değer döndürür. Bu metod harf büyüklüğüne duyarlıdır.
     * 
     * equalsIgnoreCase() metodu ise equals() metodunun yaptığı işlemlerin aynısını yapar fakat büyük küçük harf duyarlılığı yoktur. 
    */ 

    public static void main(String[] args) {
        String city1 = "Mersin";
        String city2 = "Ankara";
        String city3 = "Mersin";
        String city4 = "ANKARA";

        System.out.println(city1+" - "+city2+" = "+city1.equals(city2));
        System.out.println(city2+" - "+city4+" = "+city2.equals(city4));
        System.out.println(city1+" - "+city3+" = "+city1.equals(city3));
        System.out.println(city2+" - "+city4+" = "+city2.equals(city4));
    }
}
