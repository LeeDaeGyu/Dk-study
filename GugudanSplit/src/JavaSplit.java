import java.util.Scanner;

public class JavaSplit {
	public static void main(String[] org) {
		
//		String str1="123-4567-7890";
//		String[] a = str1.split("-");
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		
		

//		String str1="����,����,�뱸,�λ�,��õ,���";
//		String[] a=str1.split(",");
//		
//		for(int i=0 ; i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
//		String str1="����,�뱸,����,�λ�,��õ,���";
//		String[] a=str1.split(",");
//		
//		for(String k : a) {
//			System.out.println(k);
//		}
//		for-each������ k�� �ε���(������� ��������) : a�迭�� 
//		for-each���� �ѹ� ��� �ε��� �Ҿ� ����
	
//		split(String regex)�� �⺻�� ���ڸ� 1���� �޾Ƽ� ���ϴ´�� �迭 ��������
	
	
//		String str2="81-2-010-1234-5678";
//		String[] arr= str2.split("-", 2);
//		System.out.println("ret4 ="+arr[0]);
//		System.out.println("ret5 ="+arr[1]);
		
//		split(String regex,int limit)�� ���ڸ� 2���� �޾Ƽ� �տ��� �ɰ��� ���� �ι�°�� �迭 ũ������̴�
//		�迭 ũ�⸦ ������ �� �ִٴ� ����
		
//		String str = "�ϰ� ���� ���̿��� ��谡 ����";
//		String[] a=str.split("\\s");
//		
//		for(String wo : a ) {
//			System.out.println(wo);
//		}
//		\��|�� �ٸ��� |�� ��� ���ڴ� ������ \\s �� �������� ������
//		�ٵ� �� \\�ΰ� ��� �ɱ�?
		
//		Gugudan for using split 
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ܰ� ������ ���� �Է��ϼ���");
		System.out.println("ex)9,8�� 9�� 9*8����");
		String Number=scanner.nextLine();
		String[] number=Number.split(",");
		int a =Integer.parseInt(number[1]);
		for(int i=1;i<=a;i++) {
			System.out.println(number[0]+"*"+i);
		}
		
	}
}
