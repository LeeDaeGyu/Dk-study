import java.util.Scanner;

public class Review {
	public static void main(String[] org) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("����ϰ� ���� ���� �Է��ϼ���");
//		int number = scanner.nextInt();	//�� �κ��� �Է��̱� ������ �� ���� print�� �־�ߵȴ�
//		System.out.println(number*1);
//		System.out.println(number*2);
//		System.out.println(number*3);
//		System.out.println(number*4);
//		System.out.println(number*5);
//		System.out.println(number*6);
//		System.out.println(number*7);
//		System.out.println(number*8);
//		System.out.println(number*9);
		
//		int i = 1;
//		while(i<10) {
//			System.out.println(6*i);
//			i++;
//		}
//		while���� ���� �Ͽ��� ���Ʊ�� ����
//		while���� �ʱⰪ , ���� , Ŀ���� �� ��Ƴ����� for��
//		for(int i=0 ; i<10 ; i++) {
//			System.out.println(6*i);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("���� �Է��ϼ��� :");
//		int number = scanner.nextInt();
//		if(number <2 ll number >9) {
//			
//			System.out.println("���� �߸��Է��ϼ̾��.");
//		}
//		
//		else{
//			
//			for(int i = 1 ; i<10 ; i++) {
//			System.out.println(number * i );
//				}
			
			
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("���� �Է��ϼ���");
//		int number = scanner.nextInt();
//		int i =1 ; //i�� ���⼭ �ʱ�ȭ �����ָ� while ������ ���� ����ߵ�
//		while(i<10) {
//			System.out.println(number*i);
//			i++;
//			}
//		
//		int[] result = new int[9];
//		for(int i = 0 ; i<result.length ; i++) {
//			result[i]= 2 *(i+1);
//		}
//		
//		for(int i = 0 ; i<result.length ; i++) {
//			System.out.println(result[i]);
//		}
//		int[] array = new int[9];
//		for(int i = 0; i<array.length; i++) {
//			for(int j = 1; j<10;j++) {
//				array[i]=j*(i+1);
//				System.out.println(array[i]);
//			}
//			
//		}
//		int[] result = calculate(2); // �޼ҵ�� ���� �־��ָ� ����
//		for(int i =0;i<result.length;i++) {
//		//result�� calculate�� �迭�� ���Ŷ� ���̰� 9�� ���� result.length�� 9
//		System.out.println(result[i]);
//		print(result); // result�� �̹� calculate�� ��� �迭�̴� �迭�� �ᵵ �ȴ�
		
//		for(int i = 2;i<10; i++) {
//			int[] result = calculate(i);
//			print(result);
//			}
//		}
//	
//	//�żҵ�� �Է�(����)�� ���(return)�� �ִ� int[]�κ��� �����ϴ� �� ����
//	public static int[] calculate(int number) {
//		int[] result=new int[9];
//		for(int i =0;i<result.length;i++) {
//			result[i]=number*(i+1);
//		}
//		return result; // ������ ���� �̹� result�� Ÿ���� ������ ����� ������ �׳� �� ����ȴ�.
//	}
//	
//	public static void print(int[] a) {  //print�� ��ȯ�̾ƴ϶� ����̶� void
//		for(int i =0; i<a.length;i++) {
//		System.out.println(a[i]); //a�� ������ ���ڸ� �޾ƿ��� ���̴ϱ� �ƹ����Գ� ���� ����
//		}
		
		for(int i = 2; i<10 ; i++) {
			int[] result =GugudanSub.calculate(i);
			GugudanSub.print(result);
		}
	}//�ٸ� Ŭ�������� �ҷ��� ���� �տ� Ŭ���� ���� ����ߵȴ�.
}