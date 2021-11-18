package application;

public class Printf {

	public static void main(String[] args) {
		// printf 출력
		int age = 26;
		int age1 =27;
		String addr = "부산진구";
		double pi = 3.141592;
		
		System.out.printf("내 나이는 %d살입니다. %d살 일수도, %d 살인가, %d살로 합시다.\n", age, age1, age1, age); // printf 도 줄 뛰움이 없음
		System.out.printf("내 나이는 %d살이고 %s에 살고 있습니다.\n", age, addr);
		System.out.printf("파이의 값은 : %.3f", pi);  // %.nf는 소수점 n자리까지
	}

}
