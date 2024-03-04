package atminterface;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

 public class User extends ATMInterface {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
HashMap<Integer, Integer> data = new HashMap<>();
public void getLogin()throws IOException{
int x = 1;
do{
try{
data.put(123456, 123);
data.put(211212, 212);
System.out.println("Welcome the ATM project");
System.out.println("Enter your User id");
setUserID(menuInput.nextInt());
System.out.println("Enter your User pin");
setUserPIN(menuInput.nextInt());

}
catch (Exception e){
System.out.println("Invalid character, Enter only Number");
x=2;
}
for(Entry<Integer, Integer> entry:data.entrySet()){
if(entry.getKey()==getUserID() && entry.getValue()==getUserPIN()){
getChecking();
}
}
System.out.println("Wrong User Id");
}while(x==1);

}
int selection;
public void getChecking(){
System.out.println("Type 1: View Balance" );
System.out.println("Type 2: Withdraw funds" );
System.out.println("Type 3: Deposit funds" );
System.out.println("Type 4: Exit" );
System.out.println("Choice :" );
selection = menuInput.nextInt();
switch(selection){
    case 1:
        System.out.println("Checking Account Balance"+moneyFormat.format(getCheckingBalance()));
        getChecking();
        break;
    case 2:
        getCheckingWithdrawalInput();
                getChecking();
    break;
    case 3:   
                getCheckingDepositInput();
                getChecking();
    break;
    default:
        System.out.println("Invalid Choice");
        
        

}

}
}

