package week1.day2;



public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}


	public double sub(double a,double b) {
		return a-b;
	}
	public int Multiply(int a, int b) {
		return a*b;
	}
	public double Divide(double a, double b) {
		return a/b;
		
	}
	

	
	public static void main(String[] args) {
		Calculator Cals = new Calculator();
		int add = Cals.add(10,20);
		System.out.println(add);
		System.out.println(Cals.sub(25.5222,2.52222 ));
		int multiply = Cals.Multiply(5, 5);
		System.out.println(multiply);
		System.out.println(Cals.Divide(10.5, 5.5));
		
	}}