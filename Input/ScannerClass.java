import java.util.Scanner;
import java.util.Random; //sayı tahmin oyunu için
public class ScannerClass {
    public static void main(String[] args) {
        
        //Example 1
        System.out.println("2 sayı girin:");
        Scanner scanner = new Scanner(System.in);
        int data1 = scanner.nextInt();
        int data2 = scanner.nextInt();
        System.out.println("Girdiğiniz sayılar:");
        System.out.println(data1);
        System.out.println(data2);

        //Example 2 - Tek nesne ile farklı tipte veriler alma
        System.out.println("int tipinde veri girin:");
        Scanner scanner2 = new Scanner(System.in);
        int value1 = scanner2.nextInt();
        System.out.println("String tipinde veri girin:");
        String value2 = scanner2.next();
        System.out.println("boolean tipinde veri girin:");
        boolean value3 = scanner2.nextBoolean();
        System.out.println("Girilen değerler: ");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        //Example 3 - Sayı tahmin oyunu
        int value = 1;
        Random random = new Random();
        int number = random.nextInt(10);
        Scanner scanner3 = new Scanner(System.in);
        while(true){
            System.out.println("Tahmin girin (0-10)");
            int prediction = scanner3.nextInt();
            if(prediction == number){
                System.out.println(value+". tahminde bildiniz");
                break;
            }else{
                value+=1;
            }
        }
         
    }
}

/* Konsol ekranından veri almayı sağlar 
    * Klavyeden veri okumak için önce bu sınıftan nesne oluşturmamız gerekir
    * Daha sonra bu nesne üzerinden Scanner sınıfının metodlarına erişeceğiz
    * 
    * nextInt() : Klavyeden int türünde değerler okur 
    * nextByte() : Klavyeden byte türünde değerler okur 
    * nextShort() : Klavyeden short türünde değerler okur 
    * nextFloat() : Klavyeden float türünde değerler okur 
    * nextDouble() : Klavyeden double türünde değerler okur 
    * nextBoolean() : Klavyeden boolean türünde değerler okur 
    * nextLine() : Klavyeden string türünde değerler okur. String içerisinde boşluk olsa bile cümlenin tamamını okur. 
    * next() : Klavyeden string türünde değerler okur. Eğer bu string içerisinde boşluk olursa boşluğa kadar olan kısmı alır. Boşluk yoksa tamamını bir değişkene atar 
*/
