package week1.day2;

public class Calculator {
	private int addTwoNumbers(int num1, int num2) {
		   return num1+num2;
	   }
	   public float mul(float num1,int num2) {
		   return num1*num2;
	   }
	   public int sub() {
		   int a=100;
		   int b=50;
		   int c=a-b;
		   return c;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println(c.addTwoNumbers(50, 25));
		

	}

}
