package Module4.Task;

public class User {
    private long id;
    private String name;
    private double balance;
    private int mounthOfEmployment;
    private String companyName;
    private int salary;
    Bank bank;

    public User(long id, String name, double balance, int mounthOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.mounthOfEmployment = mounthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMounthOfEmployment() {
        return mounthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public Bank getBank() {
        return bank;
    }
}
