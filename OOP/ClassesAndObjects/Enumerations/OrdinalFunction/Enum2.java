package OOP.ClassesAndObjects.Enumerations.OrdinalFunction;

//Example 2

enum aylar{
    ocak, subat, mart //sona noktalı virgül gelmeyebilir
}

public class Enum2 {
    
    public static void main(String[] args) {
        
        int x = aylar.mart.ordinal();
        
        switch(x){
            case 0: System.out.println("Ocak ayı");
            break;
            case 1: System.out.println("Şubat ayı");
            break;
            case 2: System.out.println("Mart ayı");
            break;
            default: System.out.println("Bu aylardan biri değil");
            break;
        }

    }
    
}
