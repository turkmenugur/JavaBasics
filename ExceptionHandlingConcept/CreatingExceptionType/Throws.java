package ExceptionHandlingConcept.CreatingExceptionType;

public class Throws {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        try {
            exampleClass.function();
        } catch (MyExceptionType mExceptionType) {
            System.out.println(mExceptionType.toString());
        }
    }
}
