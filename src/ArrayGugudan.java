
public class ArrayGugudan {
	public static void main(String[] org) {
//		int[] result = new int[9];
//			for(int i =0;i<result.length;i++) {
//				result[i]= 2 * ( i + 1 );
//			}
			//result[0]�� ��쿣 ù �迭�� 2���� �� �Էµ� ������ 18�� ����ǰ�
			//�������� ������ �ȵ����ϱ� �� ���� 0 �� ���´�.
//			for(int i =0;i<result.length;i++) {
//				System.out.println(result[i]);
//			}
//			result = new int[9];
//			for(int i =0;i<result.length;i++) {
//				result[i]= 3 * ( i + 1 );
//			}
//			
//			for(int i =0;i<result.length;i++) {
//				System.out.println(result[i]);
//			}
//			//������ ������� �迭�� �� ����� ������ ���� int[]-�迭�� ����� ���� ������
			//������ ���� �迭�� �ٽ� ����� �� �ٸ� ���� �����ϴ°� �����ϴ�
			
			int[] array = new int[9];
			for(int i = 2 ; i <array.length ; i++) {
				for (int j =0 ; j<array.length; j++) {
					array[j] = i * (j + 1);
					System.out.println(array[j]);
				}
			}
			// �������� ���� �迭���� ���� i �κи� ���ϰ� �������� �ߺ��ȴ�
			// ������ ���µ� �� �ߺ��Ǵ� �κ��� ������ ���������� ����� ���� �ذ� ����
			//25���� ������ �ʱⰪ ����ϰ� ������������ ������ �ٵ��� �ٽ� �ʱ� ���� �ι��� ���� �� �������� ���� ����Ŭ �ݺ�
	}
}



}
