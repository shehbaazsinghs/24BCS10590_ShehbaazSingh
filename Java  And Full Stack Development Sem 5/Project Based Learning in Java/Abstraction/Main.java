abstract class Bank {
    private static int bal = 3000;

    public int getBalance() {
        return bal;
    }

    public void setBalance(int bal) {
        Bank.bal = bal;
    }
}

class Sbi extends Bank {
    public void debit(int amount) {
        int currentBalance = super.getBalance();
        currentBalance += amount;
        super.setBalance(amount);
    }

    public void credit(int amount) {
        int currentBalance = super.getBalance();
        super.setBalance(currentBalance);
    }

    public void display() {
        System.out.println(super.getBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        s.display();
        s.credit(100);
        s.display();
    }
}