/**TASK 3
 ATM INTERFACE
 1.
 Create a class to represent the ATM machine.
 2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
 checking the balance.
 3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
 checkBalance().
 4. Create a class to represent the user's bank account, which stores the account balance.
 5. Connect the ATM class with the user's bank account class to access and modify the account
 balance.
 6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
 7. Display appropriate messages to the user based on their chosen options and the success or failure
 of their transactions**/

import java.util.Scanner;

class ATM_machine{
   static int balance = 1000000;

}

class Transaction extends ATM_machine{
    
      void withdraw(int amount){
        if(amount<balance){
            balance-=amount; 
            System.out.println("You withdrawed: "+amount);
            System.out.println("Available balance: "+balance);
            System.out.println();

        }
        else{
            System.out.println("you are going to withdraw "+amount+" but you have only "+balance+" So you cant withdraw your amount brother");
            System.out.println();
        }

    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("You deposited: "+amount);
        System.out.println("available balance: "+balance);
        System.out.println();

    }
    void checkbalance(){
        System.out.println("the available balance is: "+balance);
        System.out.println();
    }
}
class hello extends Transaction{
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        boolean needopeartion = true;
        System.out.println("welcome to the bank");
        while(needopeartion = true){

        System.out.print("Choose the Mode of operation (withdraw/deposit/checkbalance): ");
        String transaction = a.nextLine();
        Transaction t1 = new Transaction();
        if(transaction.equalsIgnoreCase("withdraw")){
            System.out.print("Enter the amount you want to withdraw: ");
            int amt = a.nextInt();
            t1.withdraw(amt);
        }
        else if(transaction.equalsIgnoreCase("deposit")){
            System.out.print("Enter the amount you want to deposit: ");
            int amt = a.nextInt();
            t1.deposit(amt);
        }
        else if(transaction.equalsIgnoreCase("checkbalance")){
            System.out.print("your account balance is: "+balance);
           
        }
        else{
            System.out.println("you entered wrong operation");
            
            
        }
        a.nextLine();
        System.out.print("do you want do anymore transaction: ");
        String response = a.nextLine();
        if(response.equals("yes")|| response.equals("YES")){
            needopeartion = true;
        }
        else{
            needopeartion = false;
            System.out.println("thanks for visiting our bank");
        } 
    }}
}
