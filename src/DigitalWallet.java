public class DigitalWallet {
    private double balance;

    public DigitalWallet(double initialBalance) {
        balance = initialBalance;
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void spend(double amount) {
        if (balance > amount) {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        DigitalWallet myWallet = new DigitalWallet(100.0);
        myWallet.spend(100.0);
        System.out.println("Remaining balance: " + myWallet.balance);
    }
}
