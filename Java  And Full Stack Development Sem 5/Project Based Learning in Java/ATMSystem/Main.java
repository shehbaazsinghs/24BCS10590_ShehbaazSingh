class BankAccount {
    private String accountNumber;
    private double accountBalance;

    public BankAccount(String accNumber, double openingBalance) {
        accountNumber = accNumber;
        accountBalance = openingBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            accountBalance = newBalance;
        }
    }

    public void deposit(double depositAmount) {
        accountBalance += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if (accountBalance - withdrawAmount >= 0) {
            accountBalance -= withdrawAmount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("122365478", 1000);
        myAccount.deposit(100.50);
        myAccount.withdraw(200.80);
        myAccount.withdraw(900);
        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}