package ExceptionHandlingConcept;

import java.util.Scanner;

public class ThrowKeyWord {
    /* Geliştirici, uygulamanın herhangi bir yerinde kendisi için bir Exception verebilir ve daha sonra throw kelimesi ile fırlatıığı bu Exception'ı başka bir yerde kullanabilir. */

    public static int divideNumbers(int num1, int num2){
            if(num2 == 0){
                throw new ArithmeticException("İkinci sayı sıfırdan farklı olmalı");
            }
            int result = num1 / num2;
            return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("1. sayıyı girin: ");
            int a = sc.nextInt();
            System.out.println("İkinci sayıyı girin: ");
            int b = sc.nextInt();
            int result;
            result = divideNumbers(a, b);
            System.out.println("Result: " + result);
        } catch (NullPointerException ne) {
            System.out.println(ne.toString());
        }
    }
}
