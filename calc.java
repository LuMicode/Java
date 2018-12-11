//Simple Calculater
import java.util.Scanner;

public class calc{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Scanner x = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int num1 = s.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = s.nextInt();
		System.out.println("Enter the Symbol: ");
		String symbol = x.next();
		if(symbol.equals("+")){
			System.out.println(addNumber(num1,num2));
		}else if(symbol.equals("-")){
			System.out.println(subNumber(num1,num2));
		}else if(symbol.equals("*")){
			System.out.println(mulNumber(num1,num2));
		}else if(symbol.equals("/")){
			System.out.println(divNumber(num1,num2));
		} 	
	}

	static int addNumber(int a, int b){
		int sum = a + b;
		return sum;
	}
	static int subNumber(int a, int b){
		int sub = a - b;
		return sub;
	}
	static int mulNumber(int a, int b){
		int mul = a * b;
		return mul;
	}
	static int divNumber(int a, int b){
		int div = a / b;
		return div;
	}
}	
