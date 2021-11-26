package practice_02;

public class Practice2 {
	private String name;
	private int age;
	private boolean isVisible;
	private double temperature;
	
	public Practice2(String name, int age) {
		isVisible = true;
		temperature = 0.0;
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	public int getAge() {
		return age;
	}
	
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public boolean getIsVisible() {
		return isVisible;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getTemperature() {
		return temperature;
	}
	
	public String toString() {
		return "학생 [이름=" + name + ", 나이=" + age + ", 집체=" + isVisible + ", 온도=" + temperature + "]";
	}
	
	
	
	
	
	
}	