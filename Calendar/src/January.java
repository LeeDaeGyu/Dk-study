
public class January {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		  System.out.println("----------------------------------------------------");
	
		  printmonth();
		  
	
	}
	static int staticindex=2;
	static int index=2 ;

	public static void printmonth() {
		for (int i = index; i > 0; i--) {
			System.out.print("\t");

		}

		index = staticindex + 1;

		for (int i = 1; i < 32; i++) {
			if (index % 7 == 0) {
				System.out.println(i + "\t");

			} else {
				System.out.print(i + "\t");
			}
			index++;
		}
	}
}
