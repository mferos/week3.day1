package week3.day1;

public class Calculator {

	public void add (int a, int b)
	{
		System.out.println("Sum of a & b is: " + (a+b));
	}
	
	public void add (int a, int b, int c)
	{
		System.out.println("Sum of a, b & c is: " + (a+b+c));
	}
	
	public void multiply (int a, int b)
	{
		System.out.println("Multiply of a & b is: " + (a*b));
	}
	
	public void multiply (int a, double b)
	{
		System.out.println("Multiply of a & b is: " + (a*b));
	}
	
	public void sub (int a, int b)
	{
		System.out.println("Sub of a & b is: " + (a-b));
	}
	
	public void sub (double a, double b)
	{
		System.out.println("Sub of a & b is: " + (a-b));
	}
	
	public void div (int a, int b)
	{
		System.out.println("Div of a & b is: " + (a/b));
	}
	
	public void div (double a, double b)
	{
		System.out.println("Div of a & b is: " + (a/b));
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(1, 2);
		calculator.add(1, 2, 3);
		calculator.multiply(2, 3);
		calculator.multiply(3, 2.5d);
		calculator.sub(4, 2);
		calculator.sub(5.5d, 2.3d);
		calculator.div(6, 2);
		calculator.div(6.6d, 2.2d);
	}
	
}
