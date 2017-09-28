package Module4.Vebinar.Polimorph.abstraction;

public abstract class Employee {
    int balance;
    int salary;
    public int getBalance() {
        return balance;
    }

    public int getSalary() {
        return salary;
    }




    abstract void  payalary();

    void printBalance(){
        System.out.println(balance);
    }

}
