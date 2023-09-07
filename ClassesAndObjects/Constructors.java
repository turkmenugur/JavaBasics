package ClassesAndObjects;

public class Constructors {
    int value1, value2;

    public Constructors(){
        value1 = 12;
    }

    public Constructors(int number){
        value2 = number;
    }

    public static void main(String[] args) {
        Constructors c1 = new Constructors();
        Constructors c2 = new Constructors(10);

        System.out.println("İlk nesnenin değeri: " + c1.value1);
        System.out.println("İkinci nesnenin değeri: " + c2.value2);
    }
}
