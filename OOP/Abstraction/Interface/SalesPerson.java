package OOP.Abstraction.Interface;

public class SalesPerson implements EmployeeCommision{

    //Bu sınıf EmployeeCommision arayüzünden implement ettik

    double salaryConstant;
    double commission;

    @Override
    public double salary() {
        return ((salaryConstant * ratio)+commission);
    }

    @Override
    public void employeeDepartment() {
        System.out.println("Satış Elemanı");
    }

    @Override
    public void setSalary(double salaryConstant) {
        this.salaryConstant = salaryConstant;
    }

    //satış elemanının komisyonunu belirleyen metod
    public void setSalesCommision(int quantity){
        commission = quantity * commissionRatio;
    }

    //Bir sınıf, bir arayüzden implement ediliyorsa ve bu arayüz de başka bir arayüzden miras alınmışsa sınıfımız bu iki arayüzdeki metodları da override etmelidir.
    
}
