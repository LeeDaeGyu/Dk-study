package calendarproject;

import java.util.Scanner;

public class Months {

	static int index=2;
	static int staticindex=2;
	public static void main(String[] args) {
		
		
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------");
		printmonth(number);
	}

	public static void printmonth(int number) {
		if (number == 1) {
			for (int i = index; 0 < index; index--) {
				System.out.print("\t");

			}

			index = staticindex + 1;

			for (int i = 1; i <= 31; i++) {
				if (index % 7 == 0) {
					System.out.println(i + "\t");
				} else {
					System.out.print(i + "\t");
				}
				index++;
			}
		}
		
		}
	}

