package week3.day1.assignment2;

public class KVB extends RBI{

	public void loanInterestRate(String personalLoan) {



		System.out.println("loan interest at KVB :"+personalLoan+"%");

	}


	public static void main(String[] args) {

		KVB obj = new KVB();


		obj.loanInterestRate("8");
		obj.loanInterestRate("7");
		obj.loanInterestRate(9);



	}
}
