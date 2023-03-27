public class SavingsAccount {
    int balance;

    public SavingsAccount(int initialDeposit) {
        balance = initialDeposit;
    }

    public void checkBalance() {
        System.out.println("Hello there!");
        System.out.println("You have " + balance + " on your Account.");
    }


    public int deposit(int amountOfDeposit) {
        balance = balance + amountOfDeposit;
        System.out.println("You have deposited " +  amountOfDeposit);
        return amountOfDeposit;

    }

    public void withdraw(int amountWithdrawn) {
        balance = balance - amountWithdrawn;
        System.out.println("You have Withdrawn " +  amountWithdrawn);

    }

    public String toString() {
        return "This Savings Account now have a balance of " + balance;
    }
}



