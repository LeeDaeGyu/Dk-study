import java.util.Scanner;

public class CrudStudy {
	public static void main(String[] org) {
		while(true) {
		System.out.println("0.����  1.�Է� 2.���� 3.���� 4.��� ���");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

static String[] one =new String[100]; // ���� ���� ���� �迭�� �����Ѵ�.
static String[] four= new String[100];
static int sum=0;
static String[] number=new String[100];
static int soonseo = 0;

		public static void input() {
			System.out.println("�Ʒ� ������ �Է��Ͻÿ�!");
 
		Scanner b =new Scanner(System.in);
		System.out.println("�̸� :");
		String name = b.nextLine();
		
		Scanner c =new Scanner(System.in);
		System.out.println("����ó :");
		String number = c.nextLine();
		
		Scanner d = new Scanner(System.in);
		System.out.println("�ּ� :");
		String address = d.nextLine();
		
		System.out.println("[ �̸� :" + name + " ����ó :" + number + " �ּ�:" + address +" ]");
		
		
		
	
		 
		one[sum]=("[ �̸� :" + name + " ����ó :" + number + " �ּ�:" + address +" ]");
		sum++;
			
		
		
		}


		public static void allinput() {
		for(int i = 0; i <one.length;i++) {
		number[i]=("���� :  "+i);
		   
		 if(one[i]==null) {
			 break;
		 }
		System.out.println(number[i]+   one[i] );
			
			}
		}
		

		public static void delete() {
		System.out.println("������ �������ϴ�. ������ ��ȣ�� �������ּ���.");
		
		allinput();
		
		Scanner scanner =new Scanner(System.in);
		int number= scanner.nextInt();
		
		for(int i =number+1;i<one.length;i++) {
			one[i-1]=one[i];
			
			 }
		  }
		
		 
		

		
		
	public static void modified() {
		System.out.println("������ �����ϼ̽��ϴ�. ������ ������ ����ΰ���?");
		Scanner scanner= new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("�Ʒ��� ������ �Է��Ͻÿ�!");
		
		Scanner b =new Scanner(System.in);
		System.out.println("�̸� :");
		String name = b.nextLine();
		
		Scanner c =new Scanner(System.in);
		System.out.println("����ó :");
		String number = c.nextLine();
		
		Scanner d = new Scanner(System.in);
		System.out.println("�ּ� :");
		String address = d.nextLine();
		
		one[a]=("[ �̸� :" + name + " ����ó :" + number + " �ּ�:" + address +" ]");
		
		
	}
}	
 
