package OOP.ClassesAndObjects.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface geoBilgi{
    
    public String sekilIsmi();
    public int kenarSayisi();

}


@geoBilgi(sekilIsmi = "Düzgün sekizgen", kenarSayisi = 8)
class geometrikSekil{
    
    public int icAci(int kenar){
        return (108 * (kenar - 2)) / kenar;
    }
    
    public int kosegenSayisi(int kenar){
        return (kenar * (kenar - 3)) / 2;
    }

}


public class AnnotationExample {

    public static void main(String[] args) {
        
        geometrikSekil g = new geometrikSekil();

        geoBilgi annotation = g.getClass().getAnnotation(geoBilgi.class);
        //annotation bilgilerimizi oluşturduğumuz nesne içerisine aldık

        int aci = g.icAci(annotation.kenarSayisi());
        //kenar sayısını annotation içerisinden aldırarak geometrik şeklimizin iç açısını bulduk.

        int kosegen = g.kosegenSayisi(annotation.kenarSayisi());
        //kenar sayısını annotation'dan alarak kenar sayısını bulduk.

        System.out.println(annotation.sekilIsmi() + " : ");
        System.out.println("Bir iç açısı = " + aci);
        System.out.println("İçerisinden geçen toplam köşegen sayısı = " + kosegen);

    }

}

/* Bu örnekte ilk aşamada bir annotation tanımladık
 * Bu annotation geometrik şeklimizin ismini ve kenar sayısını tutuyor.
 * Derleyicinin derleme anında ulaşabilmesi için @Retention ve annotation'ı sadece sınıflar ile sınırlandırmak için @Target anahtar kelimesini kullandık. 
 * Daha sonrasında geometrikSekil sınıfımızı tanımlamadan önce sınıfımıza oluşturduğumuz annotation'ı ekledik. 
 * Bütün annotation'ları elde etmek için getAnnotation() metodunu kullandık.
 * Böylelikle aynı türden birden fazla annotation olması durumunda annotation'ları bir arada toplayabiliriz.
 * Köşegenimizin bir iç açısını hesap edebilmek için nesnemizin metoduna parametre olarak annotation'dan aldığımız bilgiyi gönderdik ve geometrik şeklimizin bir açısını elde ettik.
 * Bu işlemlerin aynısını köşegen sayısını bulmak için bir daha tekrar ettik ve köşegen sayısını tekrar ettik.
 * Daha sonra bu bilgileri ekrana yazdırdık.
 */