package honux.calandar;

import java.util.Scanner;

public class Calandar {
	public static void main(String[] args) {
//		System.out.println("hello, calndar");
		
		//숫자를 입력받아 해당하는 달의 최대 일수을 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("달을 입력하세요");
		int month = scanner.nextInt();
		
		
		int [] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d월은 %d 일 까지 있습니다.\n", month, maxDays[month - 1]);
		scanner.close();
		
		
		 
		
		//
	}
}
 