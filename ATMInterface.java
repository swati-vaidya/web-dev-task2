
package atminterface;

import java.text.DecimalFormat;
import java.util.Scanner;


public class ATMInterface {
Scanner input = new Scanner(System.in);
DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
   private double checkingBalance;
   private int userID;
   private int userPIN;
   public int setUserID(int userID){
   this.userID = userID;
   return userID;
   }
      public int setUserPIN(int userPIN){
   this.userPIN = userPIN;
   return userPIN;
   }
      public int getUserID(){
      return userID;

      }
            public int getUserPIN(){
      return userPIN;

      }


   
   public double getCheckingBalance(){
return checkingBalance;
}
   public double calcCheckingWithdrawal(double amount){
   checkingBalance = (checkingBalance-amount);
   return checkingBalance;
   }
   public double calcCheckingDeposit(double amount){
   checkingBalance = (checkingBalance-amount);
   return checkingBalance;
   
   }
   public void getCheckingWithdrawalInput(){
   System.out.println("Checking account Balance"+moneyFormat.format(checkingBalance));
   System.out.println("Amount you want to withdraw");
   double amount = input.nextDouble();
   if((checkingBalance-amount)>=0){
     calcCheckingWithdrawal(amount);
     System.out.println("New checking account balance"+moneyFormat.format(checkingBalance));
     
   }else{
   System.out.println("Insufficient Balance");
   }
   
   }
   public void getCheckingDepositInput(){
      System.out.println("Checking account Balance"+moneyFormat.format(checkingBalance));
   System.out.println("Amount you want to deposit from checking Account");
   double amount = input.nextDouble();
   if((checkingBalance+amount)>=0){
     calcCheckingWithdrawal(amount);
     System.out.println("New checking account balance"+moneyFormat.format(checkingBalance));
     
   }else{
   System.out.println("Balance can not be negative");
   }

   } 

}
