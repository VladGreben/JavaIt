package Module3.Task1.Task4;

public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;



    public static void main(String[] args) {


        User user1 = new User("Valera",2000,4,"RM",3000,"VOdii");
        User user2 = new User("Volodya",21000,31,"RM",6000,"Electrik");
        User user3 = new User("Vitya",7000,12,"LM",5000,"Electrik");

        User[] users = {user1,user2,user3};


        user1.paySalary();
        user1.withdraw(1000);
        user1.monthincreaser(2);


    }

    void paySalary(){
       balance+=salary;
        System.out.println(balance);
    }
    void  withdraw(int summ) {
        double comision;

        if (summ < 1000) {
            comision = summ+summ * 0.05;
            balance -= comision;

        } else {
            comision =summ+ summ * 0.1;
            balance -= comision;
        }
        System.out.println(balance);

    }
    void companyNameLeangth(){
        int coef;


    }
    void monthincreaser(int addMonth){
        monthsOfEmployment+=addMonth;
        System.out.println(monthsOfEmployment);
    }





    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {

        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


}
