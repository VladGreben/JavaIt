package Module4.Task;

public class Main {
    public static void main(String[] args) {
        BankSystemimpl bankSystemimpl = new BankSystemimpl();
        Bank USBank = new USBank(1,"Poland",Currency.USD,1200,30000,1211122,1223333144);
        Bank EUBank = new EUBank(2,"England",Currency.EUR,1300,12233,456654,1223445666);
        Bank ChinaBank = new ChinaBank(3,"Hiuchanin",Currency.EUR,332,1234445,68888,889887);

        User userUSBank1 = new User(1,"Valera",2000,2,"GM",600,USBank);
        User userEUBank1 = new User(2,"Kolya",1000,5,"GM",800,EUBank);
        User userChinaBank1 = new User(3,"Rasf",6000,12,"Pelmeshi",2000,ChinaBank);
        User userUSBank2 = new User(4,"Garic",15000,18,"Gucci",6000,USBank);
        User userEUBank2 = new User(5,"Nadya",900,1,"UborkaOnline",100,EUBank);
        User userChinaBank2 = new User(6,"Ramirez",14000,1,"REPER",13000,ChinaBank);


        bankSystemimpl.transferMoney(userEUBank1,userUSBank1,300);
        bankSystemimpl.fundUser(userEUBank1,10000);
        bankSystemimpl.withdrawOfUser(userEUBank1,700);
        bankSystemimpl.paySalary(userEUBank1);

        bankSystemimpl.transferMoney(userEUBank2,userUSBank1,500);
        bankSystemimpl.fundUser(userEUBank2,9000);
        bankSystemimpl.withdrawOfUser(userEUBank2,4200);
        bankSystemimpl.paySalary(userEUBank2);

        bankSystemimpl.transferMoney(userChinaBank1,userUSBank2,331);
        bankSystemimpl.fundUser(userChinaBank1,4000);
        bankSystemimpl.withdrawOfUser(userChinaBank1,1300);
        bankSystemimpl.paySalary(userChinaBank1);

        bankSystemimpl.transferMoney(userChinaBank2,userUSBank2,3312);
        bankSystemimpl.fundUser(userChinaBank2,5000);
        bankSystemimpl.withdrawOfUser(userChinaBank2,1100);
        bankSystemimpl.paySalary(userChinaBank2);

        bankSystemimpl.transferMoney(userUSBank1,userUSBank2,612);
        bankSystemimpl.fundUser(userUSBank1,1000);
        bankSystemimpl.withdrawOfUser(userUSBank1,100);
        bankSystemimpl.paySalary(userUSBank1);

        bankSystemimpl.transferMoney(userUSBank2,userUSBank2,690);
        bankSystemimpl.fundUser(userUSBank2,5000);
        bankSystemimpl.withdrawOfUser(userUSBank2,600);
        bankSystemimpl.paySalary(userUSBank2);


    }
}
