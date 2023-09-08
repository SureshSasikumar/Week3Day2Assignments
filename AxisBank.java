package week3.day2.assignment1;

public class AxisBank extends BankInfo{

	
	public void deposit(int num) {

		System.out.println("deposited" +num);
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		AxisBank ax= new AxisBank();
		ax.deposit();
		ax.deposit(50000);
		ax.fixed();
		ax.saving();
	}
}
