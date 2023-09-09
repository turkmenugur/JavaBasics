package OOP.Inheritance.MethodOverriding.Example1;

public class ClassB extends ClassA{

    public String metod() { //metod override edildi
        return age+name+age;
    }

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        System.out.println(classB.metod());
    }
}
