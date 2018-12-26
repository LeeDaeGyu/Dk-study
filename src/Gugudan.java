import java.util.Scanner;

public class Gugudan {
	public static void main(String[] org) {
		//2단
//		
//		
//		System.out.println("4단");
//		System.out.println(4*1);
//		System.out.println(4*2);
//		System.out.println(4*3);
//		System.out.println(4*4);
//		System.out.println(4*5);
//		System.out.println(4*6);
//		System.out.println(4*7);
//		System.out.println(4*8);
//		System.out.println(4*9);
	
//		
//		System.out.println("출력하려는 단은? :");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//	    System.out.println(number*1);
//	    System.out.println(number*2);
//	    System.out.println(number*3);
//	    System.out.println(number*4);
//	    System.out.println(number*5);
//	    System.out.println(number*6);
//	    System.out.println(number*7);
//	    System.out.println(number*8);
//	    System.out.println(number*9);
	    //6단
//	    int i = 1;
//	    while(i<10) {
//	    	System.out.println(6*i);
//	    	i++;
//	    	
//	    }
//		//7단
//	    for(int j=1;j<10;j++) {
//	    	System.out.println(7*j);
//	    }
		
//	    System.out.println("원하는 단을 입력하세요 :");
//		Scanner scanner = new Scanner(System.in);
//	    int number = scanner.nextInt();
//	    
//	    if(number<2) {
//	    	System.out.println("값을 잘못 입력하셨습니다.");
//	    	}else if (number>9) {
//	    	System.out.println("값을 잘못 입력하셨습니다.");
//	    	}else {
//	    	System.out.println(number+"단은");
//		    for(int i = 1 ; i<10 ; i++) {
//		    	System.out.println( number *i);  }
//		    System.out.println("입니다.");
//
//	    }
	    
	    System.out.println("원하는 단을 입력하세요 :");
	    Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    int i =1;
	    System.out.println("입력하신 단은:"+number);
	    while( i<10) {
	    	System.out.println(number*i);
	    	i++;
	    }
	    	
	}
}
