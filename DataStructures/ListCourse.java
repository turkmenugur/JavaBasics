package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCourse {

    //List interface'ini implement eden sınıflar
    /* AbstractList
     * AbstractSequentialList
     * ArrayList
     * AttributeList
     * CopyOnWriteArrayList
     * LinkedList
     * RoleList
     * RoleUnresolvedList
     * Stack
     * Vector
     */

    //Süperinterface'leri
    /* Collection<E>
     * Iterable<E> -> Sırayla gezmek
    */

    public static void main(String[] args) {
        //Primitive tipteki değişkenleri tutamıyorlar
        //Elementlerin memory adreslerini tutuyor
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);

        //ArrayList'in 1 elemanı sadece 1 elemanın adresini tutar
        //LinkedList'in bir elemanı ise içerisinde 3 şey tutuyor. Birincisi eklediğimiz elementin adresi ve kendinden önceki ve sonraki node'lara link tutuyor
        //[prev element next]----------><-----------[prev element next]---------->
        //   <-----------[prev element next]
        
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Merhaba");
        linkedList.add("dünya");

        if(linkedList.contains("dünya")){
            System.out.println("Merhaba dünya");
        }else{
            System.out.println("Merhaba");
        }
        
    }
    
    /* ArrayList arka planda nasıl çalışır?
     * Arkada Object[] array kullanılıyor
     * ilk initialize işleminde bu array'de belli bir yer ayrılıyor
     * Daha sonra bu ayrılan memory dolduğunda bu array'in boyutu iki katına çıkarılıyor
     * Bu array'dekiler yeni array'e aktarılıyor
     */
    

    
    
}
