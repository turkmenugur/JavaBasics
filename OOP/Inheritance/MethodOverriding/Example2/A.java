package OOP.Inheritance.MethodOverriding.Example2;

public class A {
    int x,y;
    A(int i, int j){
        //A sınıfının yapıcısı

        x = i;
        y = j;
    }

    void printConsole(){
        System.out.println("x ve y: " +x+" "+y);
    }
}
