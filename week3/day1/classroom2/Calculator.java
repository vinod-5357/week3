package week3.day1.classroom2;

public class Calculator {


	public void add(int a,int b) {

		System.out.println("Addition of two integer :"+(a+b));
	}


	public void add(int a,int b,int c) {

		System.out.println("Addition of three integer :"+(a+b+c));
	}



	public void Multiply(int a,int b) {

		System.out.println("Multiplication of two integer :"+(a*b));
	}

	public void Multiply(int a,double d) {

		System.out.println("Multiplication of one int value and double value :"+(a*d));
	}

	public void Subrtract(int a,int b) {

		System.out.println("Subtraction of two integer value :"+(a-b));
	}

	public void Subract(double a,double d) {

		System.out.println("Subtraction of two double value :"+(a-d));
	}


	public void Divide(int a,int e) {

		System.out.println("division of one int value to other value :"+(a/e));
	}

	public void Divide(double d,int e) {

		System.out.println("Division of one double by int value :"+(d/e));
	}


	public static void main(String[] args) {

		Calculator obj = new Calculator();

		obj.add(5, 10);
		obj.add(5, 10, 5);
		obj.Multiply(5, 15.5);
		obj.Multiply(5, 10);
		obj.Subrtract(10, 5);
		obj.Subract(15.5, 5.5);
		obj.Divide(10, 2);
		obj.Divide(15.5, 2);


	}


}

