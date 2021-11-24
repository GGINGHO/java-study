package windowProgramming;

public class Window {
	
	private int width;// 가로
	private int height; // 세로
	private boolean isVisible; // 현재 보이는가?
	private int top; // 위치
	private int left; // 위치
	
	// get set 메소드 만들기
	
	// 가로
	public void setWidth(int width) {
		this.width = width; 
	}
	public int getWidth() {
		return width;
	}
	
	// 세로
	public void setHeight(int height) {
		this.height = height; 
	}
	public int getHeight() {
		return height;
	}
	
	// 현재 보이는가?
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible; 
	}
	public boolean getIsVisible() {
		return isVisible;
	}
	
	// 위치
	public void setTop(int top) {
		this.top = top; 
	}
	public int getTop() {
		return top;
	}
	
	// 위치
	public void setLeft(int left) {
		this.left = left; 
	}
	public int getLeft() {
		return left;
	}
	
}
