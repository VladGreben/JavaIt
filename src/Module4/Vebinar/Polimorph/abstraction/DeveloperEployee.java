package Module4.Vebinar.Polimorph.abstraction;

public class DeveloperEployee extends Employee {
    public DeveloperEployee(int balance, int salary) {
        this.balance = balance;
        this.salary = salary;
    }

    @Override
    void payalary() {
        balance+=salary+100;
    }
}
