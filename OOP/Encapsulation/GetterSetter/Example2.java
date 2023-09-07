package OOP.Encapsulation.GetterSetter;

public class Example2 {
    /* private elemanlara erişmeyi yalnızca getter ve setter metodlar ile yapmayız.
     * Bir sınıfın yapıcısında da private elemanlara değer atayabiliriz.
     * Fakat değer okuyamayız. Çünkü yapıcılar geriye değer döndürmezler. Ayrıca yapıcılar içerisinde farklı bir metod da çağırılabilir.
    */

    private int age; 
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Example2(int age, String name) { //constructor
        //this.age = age;
        //this.name = name;

        setAge(age);
        setName(name);
    }

    public static void main(String[] args) {
        Example2 e1 = new Example2(21, "Uğur");
        System.out.println(e1.getAge());
        System.out.println(e1.getName());
    }    

}
