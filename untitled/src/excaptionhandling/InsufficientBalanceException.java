// Custom exception class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

 class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance.");
        }
        balance -= amount; // Deduct the amount from the balance
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance

        double withdrawAmount = 1500; // Amount to withdraw

        try {
            account.withdraw(withdrawAmount); // Attempt to withdraw
        } catch (InsufficientBalanceException e) {
            // Catch the custom exception and display the error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}

