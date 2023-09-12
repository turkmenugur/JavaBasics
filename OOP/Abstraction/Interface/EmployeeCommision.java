package OOP.Abstraction.Interface;

//Arayüz genişletme örneği
public interface EmployeeCommision extends Employee{
    //Bu arayüzü Employee arayüzünden miras aldık
    double commissionRatio = 0.3;

    //komisyon belirleyecek metod
    public void setSalesCommision(int quantity);
}
