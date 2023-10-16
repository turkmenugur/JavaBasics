package ExceptionHandlingConcept.CreatingExceptionType;

public class MyExceptionType extends Exception{

    String exceptionText = "Özel hata tipi";
    String exceptionType = "MyExceptionType";

    public void MyExceptionType(){
        //constructor
    }

    public String toString(){
        exceptionText += String.format(" : ", exceptionType);
        //toString metodu ile hata ile ilgili bilgiler gönderilir
        return exceptionText;
    }
    
}
