package OOP.Inheritance.MethodOverriding.ToStringMethod.Example1;

import java.security.spec.PSSParameterSpec;

public class Shape {
    int corner;
    int diagonal;
    int interiorAngle;

    Shape(int corner){
        this.corner = corner;
        diagonal = (corner*(corner-3)) / 2;
        interiorAngle = (180*(corner-2)) / corner;
    }

    public static void main(String[] args) {
        Shape geometric = new Shape(5);
        //System.out.println(geometric);
        System.out.println(geometric.toString());
    }
}

/* Bu örnekte geometrik şekil tanımlayabildiğimiz bir sınıf oluşturduk.
 * Daha sonrasında bu sınıftan bir nesne oluşturduk ve bu nesnenin metin karşılığını almak için nesneyi println() metoduyla ekrana yazdırdık. Böyle bir durumda java, sınıf içerisinde toString() metodunun override edilip edilmediğini kontrol eder. Sınıf içerisinde toString() metodu yoksa ya da eğer sınıf bir başka sınıfın alt sınıfıysa ve üst sınıfta toString() metodunun kullanılıp kullanılmadığı kontrol edilir. En son durumda Java, hiçbir yerde bu metodu bulamadığında Object sınıfında tanımlı olan genel toString() metodunu kullanır. Bu durumda Java, nesnenin sınıf ismini ve hafizadaki referansını ekrana yazar.
 */
