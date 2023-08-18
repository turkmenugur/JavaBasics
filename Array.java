import java.util.Arrays;

public class Array {
   public static void main(String[] args) {
      /*
       * Java'da diziler birer nesnedir
       * Referans tipli oldukları için belleğin heap alanında tutulurlar
       * Diziler bünyesinde aynı tip veri tutan yapılardır
       * 
       * Diziyi new ile oluşturursak eleman sayısını belirtmek zorunludur
       */

      // Dizi oluşturma yöntemleri
      int array[] = { 1, 2, 3, 4, 5 };
      String[] names = { "Uğur", "Ali" };
      int array2[], array3[];

      int[] array4 = new int[10];

      /*
       * Hatalı dizi tanımlaması
       * diziler tanımlanırken değerleri girilecekse tek satırda yapılmalı
       * String dizi2String[];
       * dizi = {"A","B"}
       */

      // İlk satırda doldurmazsak herhangi bir satırda new anahtar sözcüğünü
      // kullanarak da doldurabiliriz

      int array5[];
      array5 = new int[] { 1, 5, 7, 40 }; // dizi doldurulduysa eleman sayısı belirtilmez

      /*
       * Diziyi sadece tanımlarsak, dizi için bir referans oluşturmuş oluruz
       * Daha sonra newile diziyi oluşturunca da dizi için bir nesne oluşturmuş oluruz
       */

      // Dizi elemanlarına erişme
      // Her elemanın bir indisi vardır ve indisler 0'dan başlar

      int array6[] = { 5, 6, 10, 45, 51 };
      System.out.println(array6[3]); // 4.eleman

      System.out.println("----------------------------");

      int array7[] = new int[5];
      array7 = new int[] { 1, 6, 9, 3, 2 };
      for (int i = 0; i < 5; i++) {
         System.out.println(array7[i]);
      }

      System.out.println("----------------------------");

      String names2[] = { "A", "B", "C" };
      for (String name : names2) {
         System.out.println(name);
      }

      System.out.println("----------------------------");
      /*
       * Java'da int ve byte tipindeki diziler için bir istisna vardır
       * Bu tipteki dizilere '' (tek tırnak) içerisinde bir karakteri eleman olarak
       * ekleyebiliriz
       * Bu elemanı ekrana bastırmak istersek, ASCII kodunu gösterecektir
       */

      int array8[] = new int[] { 1, '2', 3 };
      System.out.println(array8[1]);

      System.out.println("----------------------------");

      // Object sınıfından dizi oluşturma
      // Dizimizi object sınıfından oluşturursak içerisine farklı tipte veriler
      // ekleyebiliriz. Çünkü her sınıf object sınıfından türetilmiştir

      Object arrayObject[] = new Object[4];
      arrayObject[0] = "Uğur";
      arrayObject[1] = true;
      arrayObject[2] = 12;
      arrayObject[3] = 13.5;

      for (int i = 0; i < 4; i++)
         System.out.println((i + 1) + ". eleman: " + arrayObject[i]);
      
      

      System.out.println("----------------------------");

      //Dizi boyutu
      int array9[] = {1,2,'a',5};
      System.out.println("Dizinin uzunluğu " + array9.length);

      System.out.println("----------------------------");

      //Dizileri kopyalama

      //1. Yöntem - for döngüsü ile
      int array10[] = new int[4];
      for(int i=0; i<array10.length;i++){
         array10[i] = i+i;
      }

      int array11[] = new int[array10.length];
      for(int i=0; i<array10.length;i++){
         array11[i] = array10[i];
      }
      for(int i =0; i<array11.length;i++){
         System.out.println(array11[i]);
      }

      System.out.println("----------------------------");

      //2. Yöntem - System.arraycopy(),
      int[] array12 = {1,3,5,7,9};
      int array13[] = new int[5];
      System.arraycopy(array12, 0, array13, 0, 5);
      for(int i = 0; i<array13.length ; i++)
         System.out.println("Yeni dizinin " + i+". elemanı: " +array13[i]);

      /* Bu metodun kullanım şekli
       * System.arraycopy(kaynak dizi, kaynak dizinin başlangıç indisi, hedef dizi, hedef dizinin başlangıç indisi, adedi)
       */

      System.out.println("----------------------------");

      //Eğer değeri atanmamış bir elemana erişmek istersek, o dizinin tipi ne ise o tipin default değeri yazdırılır
      int dInt[] = new int[1];
      String dString[] = new String[1];
      boolean dBool[] = new boolean[1];

      System.out.println("Default int: "+dInt[0]);
      System.out.println("Default string: "+ dString[0]);
      System.out.println("Default boolean:" + dBool[0]);
      
      
      System.out.println("----------------------------");

      //Dizileri Sıralama - Arrays.sort
      int unsortedArray[] = {1,6,8,3};
      Arrays.sort(unsortedArray); //Dizi sıralandı
      for(int i = 0; i<unsortedArray.length; i++){
         System.out.println(unsortedArray[i]);
      }

      
      System.out.println("----------------------------");
      
      //paramtre vererek sıralama
      int unsortedArray2[] = {1,8,6,7,2};
      Arrays.sort(unsortedArray, 1, 4);;



   }
}
