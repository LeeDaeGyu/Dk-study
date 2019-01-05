
public class GugudanSub {
	public static int[] calculate(int number) {
		int[] result=new int[9];
		for(int i =0;i<result.length;i++) {
			result[i]=number*(i+1);
			
		}
		return result;
	}

	public static void print(int[] a) {
		for(int i = 0 ; i <a.length ; i++) {
			System.out.println(a[i]);
		}
	}

}
