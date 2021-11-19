package practice_01;

import java.util.Scanner;

public class 연습8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int totalSec = scanner.nextInt();
		int hour = totalSec/3600;
		int min = (totalSec%3600)/60;
		int sec = totalSec%60;
		
		System.out.println(hour + "시간 ");
		System.out.println(min + "분 ");
		System.out.println(sec + "초");
		scanner.close();
	}

}
