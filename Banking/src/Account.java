import java.text.NumberFormat;
public class Account {
    private double balance, minBalance, extraCharge;
    private Customer cust;
    private String fullName;

    /**
     * constructor
     * pre: none
     * post: An account created. Balance and
     * customer data initialized with parameters.
     */
    public Account(double bal, double minBalance, double extraCharge, String fName, String lName,
            String str, String city, String st, String zip) {
        balance = bal;
        this.extraCharge = extraCharge;
        this.minBalance = minBalance;
        cust = new Customer(fName, lName, str, city, st, zip);
        fullName = fName + " " + lName;
    }

    /**
     * Returns the current balance.
     * pre: none
     * post: The account balance has been returned.
     */
    public double getBalance() {
        return (balance);
    }

    public String getName(){
        return (fullName);
    }

    public double getMinBal(){
        return minBalance;
    }

    public double extraCharge (){
        return extraCharge;
    }
    /**
     * A deposit is made to the account.
     * pre: none
     * post: The balance has been increased by the amount of the deposit.
     */
    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited successfully! Your new balance is $" + balance);
    }

    /**
     * A withdrawal is made from the account if there is enough money.
     * pre: none
     * post: The balance has been decreased by the amount withdrawn.
     */
    public void withdrawal(double amt) {
        if (amt <= balance) {
            if ( (balance - amt) <= minBalance ){
                balance -= (amt + extraCharge);
                System.out.println("You have been charged $" + extraCharge + " for not maintaining min. balance.");
                System.out.println("Withdrawed successfully. Your new balance is $" + balance);
            }
            else{
                balance -= amt;
                System.out.println("Withdrawed successfully. Your current balance is $" + balance);
            }
        } else {
            System.out.println("Not enough money in account.");
        }
    }
    /**
     * Returns a String that represents the Account object.
     * pre: none
     * post: A string representing the Account object has
     * been returned.
     */
    public String toString() {
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        accountString = cust.toString();
        accountString += "Current balance is: " + money.format(balance);
        return (accountString);
    }

}