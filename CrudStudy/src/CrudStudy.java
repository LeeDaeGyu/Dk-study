import java.util.Scanner;

public class CrudStudy {
	public static void main(String[] org) {
		while(true) {
		System.out.println("0.종료  1.입력 2.수정 3.삭제 4.모두 출력");
		Scanner first = new Scanner(System.in);
		int number = first.nextInt();
		
		if(number==0) {
			break;
		}
		else if(number==1) {
			input();
			}
		else if(number==4) {
			allinput();
			}
		else if(number==3) {
			delete();
			}
		else if(number==2) {
			modified();
			}
		else {
			System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

static String[] one =new String[100]; // 전역 변수 쓰면 배열을 공유한다.
static String[] four= new String[100];
static int sum=0;
static String[] number=new String[100];
static int soonseo = 0;

		public static void input() {
			System.out.println("아래 내용을 입력하시오!");
 
		Scanner b =new Scanner(System.in);
		System.out.println("이름 :");
		String name = b.nextLine();
		
		Scanner c =new Scanner(System.in);
		System.out.println("연락처 :");
		String number = c.nextLine();
		
		Scanner d = new Scanner(System.in);
		System.out.println("주소 :");
		String address = d.nextLine();
		
		System.out.println("[ 이름 :" + name + " 연락처 :" + number + " 주소:" + address +" ]");
		
		
		
	
		 
		one[sum]=("[ 이름 :" + name + " 연락처 :" + number + " 주소:" + address +" ]");
		sum++;
			
		
		
		}


		public static void allinput() {
		for(int i = 0; i <one.length;i++) {
		number[i]=("순서 :  "+i);
		   
		 if(one[i]==null) {
			 break;
		 }
		System.out.println(number[i]+   one[i] );
			
			}
		}
		

		public static void delete() {
		System.out.println("삭제를 눌렀습니다. 삭제할 번호를 선택해주세요.");
		
		allinput();
		
		Scanner scanner =new Scanner(System.in);
		int number= scanner.nextInt();
		
		for(int i =number+1;i<one.length;i++) {
			one[i-1]=one[i];
			
			 }
		  }
		
		 
		

		
		
	public static void modified() {
		System.out.println("수정을 선택하셨습니다. 수정할 순서는 몇번인가요?");
		Scanner scanner= new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("아래의 내용을 입력하시오!");
		
		Scanner b =new Scanner(System.in);
		System.out.println("이름 :");
		String name = b.nextLine();
		
		Scanner c =new Scanner(System.in);
		System.out.println("연락처 :");
		String number = c.nextLine();
		
		Scanner d = new Scanner(System.in);
		System.out.println("주소 :");
		String address = d.nextLine();
		
		one[a]=("[ 이름 :" + name + " 연락처 :" + number + " 주소:" + address +" ]");
		
		
	}
}	
 
