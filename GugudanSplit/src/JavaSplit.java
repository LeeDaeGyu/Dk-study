import java.util.Scanner;

public class JavaSplit {
	public static void main(String[] org) {
		
//		String str1="123-4567-7890";
//		String[] a = str1.split("-");
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		
		

//		String str1="서울,대전,대구,부산,인천,울산";
//		String[] a=str1.split(",");
//		
//		for(int i=0 ; i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
//		String str1="서울,대구,대전,부산,인천,울산";
//		String[] a=str1.split(",");
//		
//		for(String k : a) {
//			System.out.println(k);
//		}
//		for-each문에선 k는 인덱스(마음대로 설정가능) : a배열명 
//		for-each문은 한번 모든 인덱스 쫘악 돈다
	
//		split(String regex)는 기본형 인자를 1개를 받아서 원하는대로 배열 생성가능
	
	
//		String str2="81-2-010-1234-5678";
//		String[] arr= str2.split("-", 2);
//		System.out.println("ret4 ="+arr[0]);
//		System.out.println("ret5 ="+arr[1]);
		
//		split(String regex,int limit)은 인자를 2개로 받아서 앞에는 쪼개는 기준 두번째엔 배열 크기규정이다
//		배열 크기를 조절할 수 있다는 장점
		
//		String str = "일과 놀이 사이에는 경계가 없다";
//		String[] a=str.split("\\s");
//		
//		for(String wo : a ) {
//			System.out.println(wo);
//		}
//		\랑|랑 다르다 |는 모든 문자다 나누고 \\s 는 공백으로 나눈다
//		근데 왜 \\두개 써야 될까?
		
//		Gugudan for using split 
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단과 마지막 행을 입력하세요");
		System.out.println("ex)9,8은 9단 9*8까지");
		String Number=scanner.nextLine();
		String[] number=Number.split(",");
		int a =Integer.parseInt(number[1]);
		for(int i=1;i<=a;i++) {
			System.out.println(number[0]+"*"+i);
		}
		
	}
}
