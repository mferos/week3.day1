package week3.day1.assignments;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("AxisBank - Deposit");
	}

	public static void main(String[] args) {
		AxisBank axisBank = new AxisBank();
		axisBank.deposit();
	}

}
