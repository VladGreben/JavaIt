package Module4.Vebinar.Polimorph.abstraction;

public class HREployee extends Employee {
    @Override
    void payalary() {
        double k = 1.1;
        balance+=salary*k;

    }

}
