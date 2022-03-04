package methodMenu;

import java.util.Scanner;

/**
 * @author Kongzi
 * @date 2022. 2. 24. - 오후 12:34:54
 * @subject		
 * @content		
 */
public class LeapYear {

	public static void main(String[] args) {
		// 년도를 입력받아서 "윤년"/"평년" 출력하는 코딩

		Scanner sc = new Scanner(System.in);
		
		int year;
		
		String regex = "\\d+"; // 역슬러시 두개를 줘야 하나가 뜸
		String sYear;
		do {
			System.out.print("년도를 입력하세요: ");
			sYear= sc.next();
			if(!sYear.matches(regex)) {
				System.out.println("잘못된 값입니다.");
			}
		} while(!sYear.matches(regex));

		
		year = Integer.parseInt(sYear);
		if(isLeapYear(year)) {
			System.out.print("윤년");
		}
		else {
			System.out.print("평년");
		}
		
	}// main
	
	// 메서드 선언부
	// 윤년 true, 평년 false
	public static boolean isLeapYear(int year) {
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true; // 메서드 호출한 곳으로 리턴
		}
		else {
			return false;
		}
		
	}// isLeapYear [method == function] == procedure

}// class
