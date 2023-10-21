package IO.FileOperations;

import java.io.File;
import java.io.IOException;

public class FileClass {
    /* Bu sınıf, bilgisayar üzerindeki bir dosyanın bilgilerine erişmeyi sağlar. 
     * File sınıfını, bilgisayar üzerindeki herhangi bir nokta ile ilişkilendirerek bu dosya hakkında bir çok bilgiye ulaşırız.
     * Bu sınıfın yapıcısına, işlem yapacağımız dosya veya klasörün path adresini veriyoruz. Bu path, dosyanın bilgisayar üzerindeki adresidir.
     * 
     * Kullanımı:
     * File f = new File("Dosya Yolu")
     * 
     * Windows işletim sisteminde klasör adları birbirinden \ ile ayrılırken Linux ortamında / ile ayrılır.
    */

    
    public static void main(String[] args) {
        /* createNewFile() Metodu İle Dosya Oluşturmak 
         * 
         * Bu metod, belirtilen adreste yeni bir dosa oluşturur.
        */

        File f = new File("C:\\Users\\trkmn\\SoftwareProjects\\Java\\JavaBasics\\IO\\FileOperations\\FolderWithSampleFiles\\example1.txt");
        try {
            f.createNewFile(); //yeni dosya oluşturuldu
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* getName() metodu ile dosyanın adını öğrenme 
         * 
         * Bu metodu, dosyanın adını verir.
        */
        File f2 = new File("C:\\Users\\trkmn\\SoftwareProjects\\Java\\JavaBasics\\IO\\FileOperations\\FolderWithSampleFiles\\example1.txt");
        System.out.println(f2.getName());

        /* getAbsolutePath() metodu ile dosyanın yolunu öğrenme 
         * 
         * Bu metod, bize dosyanın yolunu verir. 
        */

        File f3 = new File("C:\\Users\\trkmn\\SoftwareProjects\\Java\\JavaBasics\\IO\\FileOperations\\FolderWithSampleFiles\\example1.txt");
        System.out.println(f3.getAbsolutePath());

        /* delete() metodu ile dosyayı silme
         *
         * Bu metod, dosyayı bulunduğu dizinden siler 
        */

        // Öncesinde bir tane örnek dosya oluşturdum
        
        File f4 = new File("C:\\Users\\trkmn\\SoftwareProjects\\Java\\JavaBasics\\IO\\FileOperations\\FolderWithSampleFiles\\example2.txt");
        try {
            f4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        f4.delete();
        System.out.println("Dosya var mı?: "+f4.exists());

        /* mkdir() metodu ile klasör oluşturma 
         * 
         * Bu komut, belirtilen yola belirtilen isimdeki klasörü oluşturur.
        */

        File f5 = new File("C:\\Users\\trkmn\\SoftwareProjects\\Java\\JavaBasics\\IO\\FileOperations\\FolderWithSampleFiles\\ExampleFolder");
        f5.mkdir();

        /* renameTo() metodu ile dosyanın adını değiştirme 
         * 
         * Bu metod, dosya adınızı değiştirmek için kullanılır. Bu metod içeriisne yeni bir File tipinde nesne vermemiz gerekiyor.
        */

        File f6 = new File("C:\\Users\\trkmn\\SoftwareProjects\\Java\\JavaBasics\\IO\\FileOperations\\FolderWithSampleFiles\\example1.txt");
        File f7 = new File("C:\\Users\\trkmn\\SoftwareProjects\\Java\\JavaBasics\\IO\\FileOperations\\FolderWithSampleFiles\\exampleTXT.txt");

        f6.renameTo(f7);

        /* canRead() ve canWrite() metodları ile Yazma Okuma Kontrolü 
         * 
         * Bu metodlar, dosyanın okunabilirliğini ve yazılabilirliğini kontrol ederler. Duruma göre True veya False değer dönderirler.
         * 
        */

        File f8 = new File("C:\\Users\\trkmn\\SoftwareProjects\\Java\\JavaBasics\\IO\\FileOperations\\FolderWithSampleFiles\\exampleTXT.txt");

        if(f8.canRead() == true && f.canWrite() == true){
            System.out.println("Hem yazılabilir hem okunabilir.");
        }

        //diğer örnek
        File f9 = new File("C:\\Users\\trkmn\\SoftwareProjects\\Java\\JavaBasics\\IO\\FileOperations\\FolderWithSampleFiles\\exampleTXT.txt");

        if(f9.exists()){
            //Böyle bir dosya var ise

            System.out.println("Dosya adı: " +f9.getName());
            System.out.println("Dosya yolu: " + f9.getAbsolutePath());
            System.out.println("Dosya boyutu: " +f9.getTotalSpace());
            System.out.println("Dosya okunabilir mi?: " +f9.canRead());
        }


    }
}
