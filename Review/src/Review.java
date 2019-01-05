import java.util.Scanner;

public class Review {
	public static void main(String[] org) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("출력하고 싶은 단을 입력하세요");
//		int number = scanner.nextInt();	//이 부분이 입력이기 때문에 이 위에 print가 있어야된다
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
//		while문은 조건 하에서 돌아기는 경우다
//		while문의 초기값 , 범위 , 커지는 것 모아놓은게 for문
//		for(int i=0 ; i<10 ; i++) {
//			System.out.println(6*i);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("단을 입력하세요 :");
//		int number = scanner.nextInt();
//		if(number <2 ll number >9) {
//			
//			System.out.println("값을 잘못입력하셨어요.");
//		}
//		
//		else{
//			
//			for(int i = 1 ; i<10 ; i++) {
//			System.out.println(number * i );
//				}
			
			
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("단을 입력하세요");
//		int number = scanner.nextInt();
//		int i =1 ; //i를 여기서 초기화 안해주면 while 끝날때 마다 해줘야됨
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
//		int[] result = calculate(2); // 메소드명에 인자 넣어주면 저장
//		for(int i =0;i<result.length;i++) {
//		//result는 calculate의 배열이 담긴거라 길이가 9다 따라서 result.length도 9
//		System.out.println(result[i]);
//		print(result); // result는 이미 calculate에 담긴 배열이니 배열명만 써도 된다
		
//		for(int i = 2;i<10; i++) {
//			int[] result = calculate(i);
//			print(result);
//			}
//		}
//	
//	//매소드는 입력(인자)과 출력(return)이 있다 int[]부분은 리턴하는 놈 영향
//	public static int[] calculate(int number) {
//		int[] result=new int[9];
//		for(int i =0;i<result.length;i++) {
//			result[i]=number*(i+1);
//		}
//		return result; // 리턴할 때는 이미 result의 타입을 위에서 맞췄기 때문에 그냥 명만 쓰면된다.
//	}
//	
//	public static void print(int[] a) {  //print는 반환이아니라 출력이라 void
//		for(int i =0; i<a.length;i++) {
//		System.out.println(a[i]); //a는 임의의 인자를 받아오는 놈이니까 아무렇게나 설정 가능
//		}
		
		for(int i = 2; i<10 ; i++) {
			int[] result =GugudanSub.calculate(i);
			GugudanSub.print(result);
		}
	}//다른 클레스에서 불러올 때는 앞에 클레스 명을 써줘야된다.
}