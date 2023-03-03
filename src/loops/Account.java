package loops;

public class Account {
    public static void main(String[] args) {
        //write the account balance of every year to the console if there is no interest rate etc.:
        int years = 10;
        double investment = 0;
        double interestRate = 0.025;//das sind nämlich 2.5%
        double startingWealth = 2000;

        accountBalance(years, startingWealth);

    }

    public static void accountBalance (int years, double startingWealth){
        for (years = 1; years <=10; years++){
            startingWealth = startingWealth + startingWealth;
            System.out.println("Your account balance after " + years + " year(s) is " + startingWealth + " Euros.");
        }
    }
}
