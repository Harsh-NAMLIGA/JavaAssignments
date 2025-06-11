 class BankAccount
 {
     int accountNumber;
     String accountHolderName;
     int balance;

     void deposit(double amount)
     {
        balance += amount;


     }

     void display(){
         System.out.println("AccountNumber is " + accountNumber);
         System.out.println("AccountHolderName is " + accountHolderName);
         System.out.println("Balance is " + balance);
     }



     public static void main(String[] args) {
         BankAccount b = new BankAccount();
         b.accountNumber=1234;
         b.accountHolderName="Harsha";
         b.balance=200;
         b.display();

         b.deposit(200.50);
         System.out.println("UpdatedBalance is " + b.balance);



     }
}
