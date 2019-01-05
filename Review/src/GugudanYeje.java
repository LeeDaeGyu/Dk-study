import java.util.Scanner;

public class GugudanYeje {
	public static void main(String[] org) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("단을 입력하세요");
			int number = scanner.nextInt();
			int[] result=calculate(number);
			print(result);
			
			
		
		
	}
	
	public static int[] calculate(int number) {
		int[] calculate=new int[number];
		for(int i = 0 ; i<calculate.length;i++) {
			calculate[i]=number*(i+1);
		}
		return calculate;
	}
	
	public static void print(int[] a) {
		for(int i = 0; i <a.length ; i++) {
			System.out.println(a[i]);
		}
	}
}