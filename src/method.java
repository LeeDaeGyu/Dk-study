
public class method {
	public static int[] calculate(int times) {
		
		int[] array =new int[9];
		for(int i =0 ; i<array.length; i++) {
			array[i]= times*(i+1);
		}
		return array;
	}
	//main �޼ҵ�� ��ȯ�Ұ� ��� void ���� ������ �迭�� ��ȯ�ؾߵż� int[]�迭�� ���
	//�޼ҵ�� �Է°� ��ȯ(���)���� �̷������ �޼ҵ�� ���� ����ϴ� ���̰� �޼ҵ�� ���ϰ� �Է� ��
	//return �Ҷ��� �迭�� ���� �ȴ� �׸��� �츮�� �������� ���ϴ°ſ��� �Է��� ���� �̱����� times�� ���۴�

	//	public static void main(String[] org) {
	//		int[] result = calculate(2);
	//		for(int i=0 ; i<result.length ; i++) {
	//			System.out.println(result[i]);
	//		}
	//		result = calculate(3);
	//		for(int i=0 ; i<result.length ; i++) {
	//			System.out.println(result[i]);
	//		}
 		
	//		
	//		result = calculate(4);
	 		
	 		
	//	}
	//int[] result = calculate(2) ���ο� �迭�� �ƴ϶� ��°Ŵϱ� new int ������ �޼ҵ带 �迭�� ��´�
	//�迭�� �迭�� ����� ��� ��
	public static void print(int[] a) {
	
		for(int i = 0 ; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//�� �޼ҵ�� print �ϱ� ���� �޼ҵ�� ���� ��ȯ�� �ʿ� x void
		//���� ���ڰ����� �迭�� �����ϱ� ���� ���� ������
		//���ںκп� � �迭�� ���´ٴ� �͸� �˷��ָ� �ż� �迭 ���� �������
		//������ ���ڶ� �ʵ��� �迭���� ���ƾߵȴ� ���� ����޾ƾ��ؼ�
	}
	public static void main(String[] org) {

		
		//	int[] result = calculate(3);
		// 
		//	print(result);

		
		for(int i = 2 ; i<10 ; i++) {
			int[] result = calculate(i);
			print(result);
		}
		
	}
}