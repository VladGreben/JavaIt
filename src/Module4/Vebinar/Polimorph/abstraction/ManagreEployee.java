package Module4.Vebinar.Polimorph.abstraction;

public class ManagreEployee extends Employee {
    public ManagreEployee(int balance, int salary) {
        this.balance = balance;
        this.salary = salary;
    }


    @Override
    void payalary() {
        double k = 1.1;
        balance+=salary * k + 200;

    }
}
