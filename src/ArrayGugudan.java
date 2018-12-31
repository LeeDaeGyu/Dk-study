
public class ArrayGugudan {
	public static void main(String[] org) {
//		int[] result = new int[9];
//			for(int i =0;i<result.length;i++) {
//				result[i]= 2 * ( i + 1 );
//			}
			//result[0]일 경우엔 첫 배열에 2단이 다 입력돼 마지막 18이 저장되고
			//나머지는 저장이 안됐으니까 빈 값인 0 이 나온다.
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
//			//기존에 만들었던 배열을 또 만들면 오류가 난다 int[]-배열을 만드는 놈을 삭제해
			//기존에 쓰던 배열을 다시 사용해 또 다른 값을 저장하는건 가능하다
			
			int[] array = new int[9];
			for(int i = 2 ; i <array.length ; i++) {
				for (int j =0 ; j<array.length; j++) {
					array[j] = i * (j + 1);
					System.out.println(array[j]);
				}
			}
			// 이중포문 위의 배열들을 보면 i 부분만 변하고 나머지는 중복된다
			// 포문을 쓰는데 또 중복되는 부분이 있으면 이중포문을 사용해 쉽게 해결 가능
			//25번줄 포문이 초기값 사용하고 이중포문에서 한차례 다돌면 다시 초기 포문 두번쨰 적용 후 이중포문 돌고 사이클 반복
	}
}



}
