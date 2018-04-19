package honux.calandar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	/**
	 * 
	 * @param week 요일명
	 * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
	 */
	public int parseDay(String week) {
		if ( week.equals("su")) return 0;
		else if ( week.equals("mo")) return 1;
		else if ( week.equals("tu")) return 2;
		else if ( week.equals("we")) return 3;
		else if ( week.equals("th")) return 4;
		else if ( week.equals("fr")) return 5;
		else if ( week.equals("sa")) return 6;
		else
			return 0;
	}
	
	public void runPrompt() {

		//숫자를 입력받아 해당하는 달의 최대 일수을 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calandar cal = new Calandar();
		
		System.out.println("반복횟수를 입력하세요");
		
		//int repeat = scanner.nextInt();
		int month = 1;
		int year = 2017;
		int weekday = 0;
		
		while(true)
		{
			System.out.println("년도를 입력하세요.");
			System.out.print(PROMPT);
			year = scanner.nextInt();
			
			if(year == -1)
				break;
			
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			
			System.out.println("첫번째 요일을 입력하세요.(su, mo, tu, we, th, fr, sa)");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			System.out.println(weekday);
			
			if(month > 12 || month < 1)
			{
				System.out.println("유효한 월을 입력하세요.");
				continue;
			}
				
			
			cal.printCalendar(year, month, weekday);
			//System.out.printf("%d월은 %d 일 까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
			
		}
		System.out.println("bye~");
		
		//
		scanner.close();
	}
	
	public static void main(String[] args) {
		//셸 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
