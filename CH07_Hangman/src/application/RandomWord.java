package application;

import java.util.Random;

public class RandomWord {

	private String str ="shopping tradition membership marriage temperature suggestion instruction property software argument football strategy philosophy chocolate direction addition description criticism insurance transportation university negotiation bathroom grandmother communication perception impression introduction reception relation improvement selection reputation satisfaction weakness classroom discussion language championship midnight measurement equipment birthday competition teaching permission presence assignment imagination committee";
	private String[] words = str.split(" "); // 문자열을 스페이스로 잘라서 배열에 입력

	private String selectWord; // 랜덤으로 선택된 단어	
	private char[] characters; // 문자 배열 선언
	Random random = new Random();  
	
	public RandomWord() {
		// 생성자 랜덤 단어를 선택 
		selectWord = words[random.nextInt(words.length)]; // 좀 있다 랜덤으로 수정
		characters = new char[selectWord.length()]; // 선택안어의 길이만큼 문자배열 크기로 생성
	}
	
	public void getWords() { // 현재 words배열에 있는 전체 단어를 출력 
		for(String w : words) {
			System.out.println(w);
		}
	}
	
	public String toString() {
		//단어를 _로 출력한다.
		String text = "";
		
		for(char c : characters) {
			if(c=='\u0000') { // 문자의 초기값이
				
			}
		}
		
		return selectWord; // 선택된 랜덤 단어를 가져옴
	}
}
