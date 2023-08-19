import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Array {
   public static void main(String[] args) {
      /*
       * Java'da diziler birer nesnedir
       * Referans tipli oldukları için belleğin heap alanında tutulurlar
       * Diziler bünyesinde aynı tip veri tutan yapılardır
       * 
       * Diziyi new ile oluşturursak eleman sayısını belirtmek zorunludur
       * 
       * main metodu yalnızca String tipinde argüman alabilir bu dizinin isminin args olması zorunlu değildir. Şu anda bu args dizisi boştur
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
      
      //Dizilerde arama - binarySearch
      
      /* Aratılan elemanın dizideki ilk indisi bulunur
      * eleman dizide yoksa negatif değer döner
      * arama yapmak istediğimiz dizinin sıralı olması gerekir
      * döndürülen indis sıralandıktan sonraki indistir
      */

      //sıralamadan da bulunduğu indisi dönderiyor
      int arrayForSearch[] = {3,4,12,9,2,5};
      Arrays.sort(arrayForSearch);
      int indis = Arrays.binarySearch(arrayForSearch, 12); //12 elemanı aranıyor
      if(indis < 0){
         System.out.println("Aranan eleman bulunamadı");
      }else{
         System.out.println("Bulundur ve indisi: "+indis);
      }
      
   
      System.out.println("----------------------------");
      
      //Çok boyutlu diziler
      
      int matris[][] = new int[][]{{3,6},{5,7}};
      System.out.println(matris[1][1]);
      
      System.out.println("----------------------------");
      
      //listeleme
      int mArray[][] = new int[3][3];
      for(int i=0; i<3; i++){
         for(int j=0; j<3;j++){
            mArray[i][j] = i+j;
            System.out.println("Dizi["+ i + "]["+ j +"] = " + mArray[i][j]);
         }
      } 

      for(int i=0; i<3; i++){
         for(int j=0; j<3;j++){
            System.out.print(mArray[i][j]+ "\t");
         }
         System.out.println("");
      }

      
      System.out.println("----------------------------");
      
      /* Çok boyutlu dizilerde diziler tanımlandıktan sonra tek boyutlu dizilerdeki gibi eleman ekleyebiliriz
      * Bunun için new anahtar sözcüğünü kullanmamız gerekir.
      */
      
      String sArray[][]; //referans tanımlaması
      sArray = new String[2][2];
      sArray[0][0] = "A";
      sArray[0][1] = "B";
      sArray[1][0] = "C";
      sArray[1][1] = "D";
      System.out.println("Dizinin elemanları: ");
      for(int i=0; i<2; i++){
         for(int j=0; j<2;j++){
            System.out.print(sArray[i][j]+"\t");
         }
         System.out.println("");
      }
      
      System.out.println("----------------------------");

      //dizinin uzunluğu
      int matrisArray[][] = {{1,2},{1,3},{1,2,5}};
      System.out.println(matrisArray.length);
      System.out.println(matrisArray[0].length);
      System.out.println(matrisArray[1].length);
      System.out.println(matrisArray[2].length);

      System.out.println("----------------------------");
      
   }
}

class ArrayClass{
   public static void main(String[] args) {
      
      /* ARRAYS SINIFI METODLARI */

      //Dizileri Karşılaştırma - Arrays.equals
      char[] charArray = {'u'};
      char[] charArray2 = {'t'};
      System.out.println(Arrays.equals(charArray, charArray2));


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
      Arrays.sort(unsortedArray, 1, 4);; //ilk 4 elemanı sıralar
      
      System.out.println("----------------------------");

      //Arrays.asList - Diziyi liste yapısına kopyalama
      
      //parametre olarak dizi alır geriye liste döndürür
      String arrayString[] = {"Mersin","Adana","İstanbul","Ankara"};
      Integer arrayInteger[] = {33,01,34,06};

      List list = new ArrayList<>();
      List list2 = new ArrayList<>();
      list = Arrays.asList(arrayString);
      list2 = Arrays.asList(arrayInteger);

      System.out.println(list.get(1));
      System.out.println(list);
      System.out.println(list2.get(0));
      System.out.println(list2);

      System.out.println("----------------------------");
      
      //Arrays.copyOf - Dizinin belli bölümünü kopyalama
      
      /* İki parametre alır geriye dizi döndürür
      * İlk parametre kopyalanacak dizi, ikinci parametre ise diziden kaç eleman kopyalanacağı
      */
      char[] cArray = {'u','ğ', 'u','r'};
      char[] newcArray = {};
      
      newcArray = Arrays.copyOf(cArray, 2);
      
      for(char c : newcArray){
         System.out.print(c);
      }
      
      System.out.println("");
      System.out.println("----------------------------");
      
      //Arrays.copyOf - İki indis arasındaki elemanları kopyalama
      
      /* İlk parametre: kaynak dizi
      * ikinci parametre: dizinin kaçıncı indeksteki elemanından kopyalanmaya başlanacak
      * Üçüncü parametre: dizinin hangi elemanına kadar kopyalanacak 
      */
      
      Integer intArray[] = {14,53,19,23,20,12};
      Integer intArray2[] = {};
      
      System.out.println("Yeni dizi: ");
      intArray2 = Arrays.copyOfRange(intArray, 2, 6);
      for(int i : intArray2){
         System.out.println(i);
      }
      
      System.out.println("----------------------------");

      //Arrays.fill - Diziye eleman atamak

      /* İki formu vardır:
       * fill(Object array[], Object value)
       * fill(Object array[], int baslangic, int bitis, Object value)
       * 
       * İkincisinde değeri verilen indisler arasına yazar
       */


      Integer iArray[] = {0,0,0,0};
      Integer iArray2[] = {1,1,1,1};

      Arrays.fill(iArray, 1);
      Arrays.fill(iArray2, 2, 4, 4);

      System.out.println("Eleman doldurduğumuz ilk dizi:");
      for(int i: iArray){
         System.out.println(i);;
      }

      System.out.println("Eleman doldurduğumuz ikinci dizi:");
      for(int i: iArray2){
         System.out.println(i);;
      }

   }
}
