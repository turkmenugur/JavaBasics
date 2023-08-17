public class Methods{
    public static void main(String[] args) {
        printToScreen();

        String isim = sendName();
        System.out.println("İsim: "+isim);
        //System.out.println(sendName()); bu şekilde de yazılabilirdi

        multiply(5, 7);

        int biggestNumber = compareNumbers(15, 10);
        System.out.println(biggestNumber);

    
    }

    //Parametresiz - değer döndürmeyen
    public static void printToScreen(){
        System.out.println("Metot çağırıldı");
    }

    //parametresiz - değer döndüren
    static String sendName(){
        return "Uğur";
    }

    //parametreli - değer döndürmeyen
    static void multiply(int num1, int num2){
        System.out.println(num1*num2);
    }

    //parametreli - değer döndüren
    static int compareNumbers(int a, int b){

        if(a>b)
            return a;
        else if(b>a)
            return b;
        else 
            return a;
    }
}