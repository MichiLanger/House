package loops;

public class Account2 {
    public static void main(String[] args) {
        //write the account balance of every year to the console if there is a 2.5%-rate per year:
        int years = 10;
        double investment = 2000;//investment steht bei dieser Übung für "starting wealth" - also hab' ich erst jetzt hier gecheckt zwecks erster Account-Übung
        double interestRate = 0.025;

        accountBalanceWithInterestRate(years, investment, interestRate);

    }

    public static double accountBalanceWithInterestRate (int years, double investment, double interestRate){
        double accountBalance = investment;

        for (int i = 1; i <= years; i++){
            accountBalance = accountBalance + (accountBalance * interestRate);
            System.out.println("Your account balance afer " + i + " year(s) is " + accountBalance + " Euros.");
        }
        return accountBalance;
    }
}
