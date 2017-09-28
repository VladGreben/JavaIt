package Module4.Task;

public class BankSystemimpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {


        double comision = 0;
        double withdraw = 0;
        if (user.bank.getLimitOfWithdrawal()>amount) {
            comision = user.bank.getCommission(amount)*amount;

            withdraw = (user.getBalance() - amount)-comision;
            System.out.println("Balance afer withdraw: "+withdraw);
        }else if (user.bank.getLimitOfWithdrawal()<amount){
            System.out.println("U dont cant withdrawl,limit of withdraw:  "+ user.bank.getLimitOfWithdrawal());
        }




    }

    @Override
    public void fundUser(User user, int amount) {
        double funding = 0;
        double comision = 0;
        if (user.bank.getLimitOfFunding()>amount) {
            comision = user.bank.getCommission(amount)*amount;

            funding = user.getBalance() + amount-comision;
            System.out.println("Balance after funding: " +funding);
        }else if (user.bank.getLimitOfFunding()<amount){
            System.out.println("U dont cant funding,limit of funding :"+ user.bank.getLimitOfFunding());
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double transfer = 0;
        double withdraw = 0;
        double comision = 0;
        if(fromUser.getBalance()>amount){
            comision = fromUser.bank.getCommission(amount)*amount;
            withdraw = fromUser.getBalance()-amount-comision;
            transfer = toUser.getBalance()+amount;
            System.out.println("From user money after operation: "+withdraw);
            System.out.println("To user  money after operation: "+transfer);

        }else if(fromUser.getBalance()<amount){
            System.out.println("U dont have enogth money!");
        }


    }

    @Override
    public void paySalary(User user) {
        double comision = user.bank.getCommission(user.getSalary())*user.getSalary();
        double paySalary = user.getBalance()-user.getSalary()-comision;
        System.out.println("Balance after salary: "+paySalary);


    }
}
