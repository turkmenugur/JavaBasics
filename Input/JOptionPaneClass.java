import java.util.Random;
import javax.swing.JOptionPane;
public class JOptionPaneClass {
    public static void main(String[] args) {
        //Veri alma
        String s1 = JOptionPane.showInputDialog("Bir sayı girin");

        //Bilgi mesajı gösterme
        JOptionPane.showMessageDialog(null, "Bilgilendirme mesajı");

        // Parametreler: JOptionPane.showMessageDialog(null, "Mesaj", "Başlık", Icon");
        JOptionPane.showMessageDialog(null, "Bilgilendirme mesajı", "Başlık", JOptionPane.OK_OPTION);

        //Sayı tahmin oyunu
        int i = 1;
        Random random = new Random();
        int num = random.nextInt(i);
        while(true){
            String tahmin = JOptionPane.showInputDialog("Tahmin girin");
            int t = Integer.parseInt(tahmin);
            if(t == num){
                String message = "Tahmin doğru! " +i+". tahminde bildiniz";
                JOptionPane.showMessageDialog(null, message, "Tebrikler!", JOptionPane.INFORMATION_MESSAGE);
                break;
            }else{
                i++;
            }
        }
    }
}

/* Kullanıcıdan veri alır veya mesaj gösterir 
 * Bu işlemleri bir pencere yardımı ile yapar
 * Form uygulaması özelliği
 * Kullanıcıdan veri istendiğinde girilen değer String türündedir 
*/       