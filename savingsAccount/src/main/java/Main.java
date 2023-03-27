public class Main {
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(10000);

        savings.checkBalance();

        savings.deposit(5000);

        savings.withdraw(2000);

        System.out.println(savings);



    }
}
