package Re11;

/**
 * @author kongzi
 * @date 2022. 3. 3. - 오후 9:07:09
 * @subject	달력만들기
 * @content	
 * 				0. 달력 그리기
 * 				1. 년,월의 1일이 무슨 요일인지?
 * 				2. 총 날짜수를 알아야함 ex) 1.1.1 ~ 2010.5.1
 * 				3. 총 날짜수 % 7 1일이 무슨 요일? 0(일), 1(월), 2(화), 3(수), 4(목), 5(금), 6(토)
 * 				4. 월의 마지막 일 ex) 28, 29, 30, 31
 * 					ㄱ. 28: 2월-평년
 * 					ㄴ. 29: 2월-윤년
 * 					ㄷ. 30: 4,6,9,11월
 * 					ㄹ. 31: 1,3,5,7,8,10,12월
 */
public class printCalendar {

	public static void main(String[] args) {

		int year, month, date;
		
		if(args.length != 2) {
			System.out.println("> java.exe printCalendar 2010 5 년도, 월 매개변수 필요");
			return;
		}//if
		
		year = Integer.parseInt(args[0]);
		month = Integer.parseInt(args[1]);
		
		printCalendar(year, month);
		
	}//main
//********************************************************************
	private static int getTotalDays(int year, int month, int date) {
		
		int totalDays = 0;
		
		totalDays = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		
		int m[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < month - 1; i++) totalDays += m[i];
		if(methodMenu.LeapYear.isLeapYear(year) && month >= 3) totalDays++;
		totalDays += date;
		
		return totalDays;
	}//getTotalDays
//********************************************************************
	private static void printCalendar(int year, int month) {
		
		int day1ofWeek = getDay1ofWeek(year,month);
		int lastDay = getLastDay(year,month);
		
		System.out.printf("\t\t\t%d년 %d월\n",year,month);
		methodMenu.drawLine.drawLine(63,'─');
		
		String week = "일월화수목금토";
		for(int i = 0; i < week.length(); i++) System.out.printf("\t%c",week.charAt(i));
		System.out.println();
		methodMenu.drawLine.drawLine(63,'─');
		
		for (int i = 0; i < day1ofWeek; i++) System.out.print("\t");
		for (int i = 1; i <= lastDay; i++) {
			System.out.print("\t" + i);
			if((day1ofWeek + i) % 7 == 0) System.out.println();
		}
		System.out.println();
		
		
		methodMenu.drawLine.drawLine(63,'─');
		
	}//printCalendar
//********************************************************************
	private static int getLastDay(int year, int month) {
		int lastDay;

		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 11:
			lastDay = 31;
			break;
		case 2:
			lastDay = methodMenu.LeapYear.isLeapYear(year) ? 29 : 28;
			break;
		default:
			lastDay = 30;
			break;
		}
		
		return lastDay;
	}
//********************************************************************
	private static int getDay1ofWeek(int year, int month) {
		
		int totalDays;
		totalDays = getTotalDays(year, month, 1);
		int day1ofWeek = totalDays % 7;
		
		return day1ofWeek;
	}//getDay1ofWeek
//********************************************************************
}// class
