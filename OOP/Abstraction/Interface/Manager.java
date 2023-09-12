package OOP.Abstraction.Interface;

public class Manager implements Employee{

    double salaryConstant;

    @Override
    public double salary() {
        return salaryConstant;
    }

    @Override
    public void employeeDepartment() {
        System.out.println("Yönetici");
    }

    @Override
    public void setSalary(double salaryConstant) {
        this.salaryConstant = salaryConstant;
    }
    
}
