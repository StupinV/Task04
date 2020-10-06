package Task04_01;

public class Test1 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		change(a,b);

	}
	
	
	
	public static void change(int a, int b) {
		
		int number1 = a + 7;
		int number2 = b - 3; 
		output(a, b, number1, number2);
		
	}
	
	public static void output(int a, int b, int a1, int b1) {	
		
		System.out.println("1.Before : " + a + ", " + b);
		System.out.println("2.After : " + a1 + ", " + b1);
		
	}
	

}
