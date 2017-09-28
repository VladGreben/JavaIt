package Module4.Vebinar.Polimorph.abstraction;

public class main {

    static void paySalary(Employee[] employees){
        for (Employee employee:employees){
            employee.payalary();
        }

    }

    public static void main(String[] args) {
      DeveloperEployee developerEployee = new DeveloperEployee(0,2000);
      ManagreEployee managreEployee = new ManagreEployee(10,500);
      /*developerEployee.payalary();
      managreEployee.payalary();

       System.out.println(developerEployee.balance);
       System.out.println(managreEployee.balance);*/


        Employee[] employees = {developerEployee,managreEployee};
        paySalary(employees);
        System.out.println(developerEployee.getBalance());
        System.out.println(managreEployee.getBalance());



    }

}
