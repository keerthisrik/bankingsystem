
import java.util.*;
class BankAccount{
	int balance=20000;
	int previousTransaction;
	String customerName;
	String customerId;
	BankAccount(String cname,String cid){
		customerName=cname;
		customerId=cid;
	}
	void deposit(int amount) {
		balance=balance+amount;
		previousTransaction=amount;
		
	}
	void withdraw(int amount) {
		balance=balance-amount;
		previousTransaction=-amount;
		if(balance<amount) {
			System.out.println("withdraw can not be done");
		}
	}
		void getPreviousTransaction(){
			if(previousTransaction>0) {
				System.out.println("Deposit:"+previousTransaction);
			}
			else if(previousTransaction<0) {
				System.out.println("Withdraw:"+previousTransaction);
			}
			else {
				System.out.println("invalid option");
			}
			
		}
	void menu() {
		char option='\0';
		Scanner s=new Scanner(System.in);
		System.out.println("username:"+customerName);
		System.out.println("userid:"+customerId);
		System.out.println("\n");
		System.out.println("A. Checkbalance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. PreviousTransaction");
		System.out.println("E. Exit");
		do {
			System.out.println("------------------------------------------------------------------");
			System.out.println("Enter the options");
			System.out.println("-------------------------------------------------------------------");
			option=s.next().charAt(0);
			System.out.println("\0");
			switch(option) {
			case 'A':
				System.out.println("------------------------------------------------------------------");
				System.out.println("Balance:"+balance);
				System.out.println("------------------------------------------------------------------");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("------------------------------------------------------------------");
				System.out.println("Enter deposit amount:");
				System.out.println("------------------------------------------------------------------");
				int amount=s.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("------------------------------------------------------------------");
				System.out.println("Enter withdraw amount:");
				System.out.println("------------------------------------------------------------------");
				int amount1=s.nextInt();
				withdraw(amount1);
				System.out.println("\n");
				break;
			case 'D':
				System.out.println("------------------------------------------------------------------");
				getPreviousTransaction();
				System.out.println("------------------------------------------------------------------");
				System.out.println("\n");
				break;
			case 'E':
				System.out.println("------------------------------------------------------------------");
				break;
				default:
					System.out.println("invalid input");
			}
		}
		while(option!= 'E');
		System.out.println("Thanks for your service");
	}
}
				
public class BankingApplication {

	public static void main(String[] args) {
		BankAccount obj=new BankAccount("Mary","123");
		obj.menu();
		
		
	}
}