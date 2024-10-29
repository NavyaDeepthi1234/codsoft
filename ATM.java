import java.util.Scanner;
 public class ATM {
	 public static void main(String args[]) {
		 int balance=10000;
		 int Withdraw;
		 int diposit;
		// int checkbalance;
		 //creating object
		Scanner scanner=new Scanner (System.in);
		while(true) {
			System.out.println("ATM Machine");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for Diposit");
			System.out.println("choose 3 checking Balance");
			System.out.println("choose 4 Exit");
			System.out.println("choose the opption which we want to perform");
			//read the user choice
			int choice=scanner.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter money to withdraw:");
				Withdraw=scanner.nextInt();
				//check the balance to withdraw
				if(balance>=Withdraw) {
					//remove the amount from the total money
					balance=balance-Withdraw;
					System.out.println("please collect your money");
				}
				else {
					System.out.println("insufficent balance");
				}
				System.out.println("");
					break;
				
				case 2:
					System.out.println("Enter money to  be diposited:");
					diposit=scanner.nextInt();
					//add the amount with balance amount
					balance=balance+diposit;
					System.out.println("your money has been successfully diposited");
					System.out.println("");
					break;
					 
				case 3:
					//display total balance from the user
					System.out.println("Balance:"+balance);
					System.out.println("");
					break;
					 
				case 4:
					System.out.println("Exit");
					System.exit(0);
			}
			
		}
	 }
	 
 }
