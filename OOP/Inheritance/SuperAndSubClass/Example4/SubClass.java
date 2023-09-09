package OOP.Inheritance.SuperAndSubClass.Example4;

public class SubClass extends SuperClass{
    int x;

    public SubClass(int i, int j){
        super.x=i; //SuperClass'ın x değişkenine atar
        x=j; //SubClass'ın x değişkenine atar
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass(3, 6);
    }
}
