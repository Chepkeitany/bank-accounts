// Savings class inherits from Account class
class Savings extends Account {
  
  double interestRate = 0.8; // member variable

  public Savings(int balance) { // parametrized contructor
    super(balance); // calling base class constructor using super() keyword
  }

  // Overriding method defined in base class
  // Method overriding is used as dynamic polymorphism
  public void Deposit(double amount) {
    balance += amount + (amount * interestRate);
  }

  public void Withdraw(double amount) {
    balance -= amount + (amount * interestRate);
  }

  public void printBalance() {
    System.out.println("Balance in your saving account: " + balance);
  }
  
}