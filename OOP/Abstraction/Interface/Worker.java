package OOP.Abstraction.Interface;

public class Worker implements Employee{
    double salaryConstant;

    //çalışan ücretini döndüren metod
    @Override
    public double salary() {
        return salaryConstant * ratio;
    }

    //çalışan bölümünü ekrana yazdıran metod
    @Override
    public void employeeDepartment() {
        System.out.println("Ücretli Çalışan");
    }

    //çalıian öcretini belritmek için kullanılan metod
    @Override
    public void setSalary(double salaryConstant) {
        this.salaryConstant = salaryConstant;
    }

    

}
