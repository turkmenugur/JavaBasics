package BasicSyntax;
public class ControlStructures {
    public static void main(String[] args) {
        /* if-else yapısı
         * Koşul doğru olduğu sürece if bloğuna girer
         * Koşuldan false sonucu dönerse else bloğundaki işlemler yapılır
         * Else kısmını yazmak zorunlu değil
         */

        //if veya else kısmında yapılacak işlemler tek bir ifade ise (sonuna ; getirilen her şey ayrı bir ifadedir) {} koymaya gerek yok
        int not = 88;
        
        if(not > 50)
            System.out.println("Başarılı");
        else
            System.out.println("Başarısız");
    
        /* if - else if */
        if(not >= 85){
            System.out.println("AA");
        }else if(not < 85 && not >= 70){
            System.out.println("BA");
        }else{
            System.out.println("AA veya BA değil");
        }

        /* iç içe if */
        int hız = 100;
        if(hız>90){
            System.out.println("Radara girdiniz");
            if(hız>=90 && hız<120)
                System.out.println("Cezanız 200TL");
            else if(hız >= 120)
                System.out.println("Cezanız 400TL");
        }else{
            System.out.println("Hızınız normal");
        }

        /* SWITCH YAPISI

         * Belli bir aralık değil de doğrudan değer kontrolü yapar
         * Her if-else yerine switch yapısı kullanılmaz
         * Switch içerisindeki değişkenin değeri ile case'deki değer eşleştiği zaman eşleşen case bloğuna girilir.
         * case ifadelerinde ne kadar komut olursa olsun {} gerekmez
         * Her case ifadesinden sonra break koymamız gerekir yoksa bir sonraki case ifadesine de girer.
         * default ise hiçbir case ifadesine girilmediğinde çalışır
         * default ifadesinin yazılma zorunluluğu yoktur isteğe bağlıdır
         * 
         * Switch içerisine int, short, byte, char, string tipindeki değişkenler yazılabilir
         */

        int day = 5;
        
        switch(day){
            case 1:
                System.out.println("Pazaretesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Salı");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
        }

        String isim = "Uğur";
        switch (isim){
            case "Uğur" : System.out.println("Doğru isim"); break;
            case "Ali" : System.out.println("Yanlış isim"); break;
            default: System.out.println("Geçersiz isim");
        }
    
    
    }
}
