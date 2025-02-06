package oops;
class bankaccount{
	double balance;
	bankaccount(double balance){
		this.balance=balance;
	}
	void calcinterest() {
		System.out.println("interest rate calculated");
	}
}
class currentaccount extends bankaccount{
	currentaccount(double balance){
		super(balance);
	}
	@Override
	void calcinterest() {
		double interest=balance*0.04;
		System.out.println("interest is:"+interest);
	}
}

class savingsaccount extends bankaccount{
	savingsaccount(double balance){
		super(balance);
	}
	@Override
	void calcinterest() {
	
		double interest= balance*0.2;
		System.out.println("savings account interest is:"+interest);
	}
}

public class bankingsystem {
	public static void main(String[] args) {
		bankaccount b=new currentaccount(24200.00);
		bankaccount ba=new savingsaccount(2300000.00);
		b.calcinterest();
		ba.calcinterest();
	}
}
