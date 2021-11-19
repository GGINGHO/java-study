package application;

import java.util.Scanner;

public class NewArray2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers;			
		numbers = new int[3];	
		
		numbers[0] = scanner.nextInt();
		numbers[1] = scanner.nextInt();
		numbers[2] = scanner.nextInt();
		
		int total = 0;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
			total = total + numbers[i]; // 모든 배열의 값을 더함
		}
		
		System.out.println("총 합은 : " + total);
	}

}
