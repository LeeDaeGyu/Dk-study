
public class method {
	public static int[] calculate(int times) {
		
		int[] array =new int[9];
		for(int i =0 ; i<array.length; i++) {
			array[i]= times*(i+1);
		}
		return array;
	}
	//main 메소드는 반환할게 없어서 void 지만 지금은 배열로 반환해야돼서 int[]배열로 사용
	//메소드는 입력과 반환(출력)으로 이루어진다 메소드명 앞이 출력하는 형이고 메소드명 이하가 입력 값
	//return 할때는 배열명만 쓰면 된다 그리고 우리는 구구단을 원하는거여서 입력한 단을 뽑기위해 times로 버꾼다

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
	//int[] result = calculate(2) 새로운 배열이 아니라 담는거니까 new int 날리고 메소드를 배열로 담는다
	//배열을 배열로 끌고와 담는 것
	public static void print(int[] a) {
	
		for(int i = 0 ; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//이 메소드는 print 하기 위한 메소드다 따라서 반환이 필요 x void
		//또한 인자값으로 배열이 들어오니까 형도 같이 써주자
		//인자부분에 어떤 배열이 들어온다는 것만 알려주면 돼서 배열 명은 상관없다
		//하지만 인자랑 필드의 배열명은 같아야된다 같이 적용받아야해서
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