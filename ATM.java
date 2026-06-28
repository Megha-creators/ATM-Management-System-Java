class ATM {
    private int pin = 1234;
    private double balance = 10000;

    boolean login(int enteredPin) {
        return enteredPin == pin;
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " Deposited Successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
