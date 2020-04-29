// Current class inherited from the Account class
class Current extends Account {

  public Current(int balance) { // Parametrized constructor
    super(balance); // calling base class constructor using the super() keyword
  }

  // Overriding methods defined in base class
  // Method overriding is used as dynamic polymorphism
  public void Deposit(double amount) {
    balance += amount;
  }

  public void Withdraw(double amount) {
    balance -= amount;
  }

  public void printBalance() {
    System.out.println("Balance in your current account: " + balance);
  }
  
}