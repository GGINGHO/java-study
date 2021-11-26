package practice_02;

public class Practice1 {
	public static void main(String[] args) {
		
		Practice2 p1 = new Practice2("가재", 15);
		Practice2 p2 = new Practice2("암탉", 20);
		Practice2 p3 = new Practice2("들개", 18);
		Practice2 p4 = new Practice2("숫소", 16);
		
		p1.setIsVisible(false);
		p2.setTemperature(35.9);
		p3.setTemperature(37.0);
		p4.setIsVisible(false);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}	
}
