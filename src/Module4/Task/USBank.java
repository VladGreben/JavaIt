package Module4.Task;

public class USBank extends  Bank {




    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        String usd = "USD";
        String eur = "EUR";
        if(getCurrency().USD.name()==usd){
            limitOfWithdrawal=1000;
        }
        if (getCurrency().EUR.name()==eur){
            limitOfWithdrawal=1200;
        }

        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {

        int limitOfFunding = 0;
        Integer max = Integer.MAX_VALUE;
        String usd = "USD";
        String eur = "EUR";
        if(getCurrency().USD.name()==usd){
            limitOfFunding=max;
        }
        if (getCurrency().EUR.name()==eur){
            limitOfFunding=10000;
        }

        return limitOfFunding;
    }

    @Override
    double getMonthlyRate() {
        double montlyRate = 0;
        String usd = "USD";
        String eur = "EUR";
        if(getCurrency().USD.name()==usd){
            montlyRate=0.01;
        }
        if (getCurrency().EUR.name()==eur){
            montlyRate=0.02;
        }

        return montlyRate;
    }

    @Override
    double getCommission(int summ) {
        double comision = 0;
        String usd = "USD";
        String eur = "EUR";
        if(getCurrency().USD.name()==usd&&summ<1000){
            comision=0.05;
        }else if (getCurrency().USD.name()==usd&&summ>1000){
            comision=0.07;
        }
        if (getCurrency().EUR.name()==eur&&summ<1000){
            comision=0.06;
        }else if (getCurrency().EUR.name()==eur&&summ>1000){
            comision=0.08;
        }

        return comision;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }


}
