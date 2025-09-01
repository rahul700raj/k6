import java.util.*;

// ========== Custom Exceptions ==========
class InvalidPINException extends Exception {
    public InvalidPINException(String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// ========== Transaction Class ==========
class Transaction {
    private String type;
    private double amount;
    private Date date;
    private double balanceAfter;

    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return date + " | " + type + " | " + amount + " | Balance: " + balanceAfter;
    }
}

// ========== Account Class ==========
abstract class Account {
    protected String accountNo;
    protected double balance;
    protected List<Transaction> history = new ArrayList<>();

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public abstract String getType();

    public void deposit(double amount) {
        balance += amount;
        history.add(new Transaction("Deposit", amount, balance));
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        }
        balance -= amount;
        history.add(new Transaction("Withdraw", amount, balance));
    }

    public double getBalance() {
        return balance;
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transaction t : history) {
                System.out.println(t);
            }
        }
    }
}

class SavingAccount extends Account {
    public SavingAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public String getType() {
        return "Saving Account";
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public String getType() {
        return "Current Account";
    }
}

// ========== Card Class ==========
class Card {
    private String cardNo;
    private int pin;
    private Account account;

    public Card(String cardNo, int pin, Account account) {
        this.cardNo = cardNo;
        this.pin = pin;
        this.account = account;
    }

    public void validatePIN(int enteredPin) throws InvalidPINException {
        if (enteredPin != pin) {
            throw new InvalidPINException("❌ Invalid PIN!");
        }
    }

    public Account getAccount() {
        return account;
    }
}

// ========== ATM Class ==========
class ATM {
    private Scanner sc = new Scanner(System.in);

    public void start(Card card) {
        try {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();
            card.validatePIN(pin);

            int choice;
            do {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Balance Enquiry");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transaction History");
                System.out.println("5. Exit");
                System.out.print("Choose option: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: " + card.getAccount().getBalance());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double dep = sc.nextDouble();
                        card.getAccount().deposit(dep);
                        System.out.println("✅ Deposited.");
                        break;
                    case 3:
                        System.out.print("Enter withdraw amount: ");
                        double wit = sc.nextDouble();
                        try {
                            card.getAccount().withdraw(wit);
                            System.out.println("✅ Withdrawn.");
                        } catch (InsufficientBalanceException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("\n--- Transaction History ---");
                        card.getAccount().printHistory();
                        break;
                    case 5:
                        System.out.println("Thank you! Goodbye.");
                        break;
                    default:
                        System.out.println(" Invalid choice.");
                }
            } while (choice != 5);

        } catch (InvalidPINException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// ========== Main ==========
 class ATMSimulation {
    public static void main(String[] args) {
        // Create an account & card
        Account acc = new SavingAccount("SA1001", 5000);
        Card card = new Card("1111-2222-3333", 1234, acc);

        // Start ATM
        ATM atm = new ATM();
        atm.start(card);
    }
}
