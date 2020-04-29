// Base class
class Account {
  
  protected double balance; // protected variable

  public Account(double balance) { // parametrized constructor
    this.balance = balance;
  }

  // member functions (to be overridden)
  public void Deposit(double amount){}
  public void Withdraw(double amount){}
  public void printBalance(){}
  
}