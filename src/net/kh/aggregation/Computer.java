package net.kh.aggregation;

public class Computer {
	
	//1. 4개의 컴퓨터 부품 객체의 주소를 보관할 참조 변수들을 선언
	private Monitor refMonitor;
	private Mouse refMouse;
	private Keyboard refKeyboard;
	private Board refBoard;
	
	
	//4.모니터 객체에 접근할 때 사용할 getter/setter 정의
	public Monitor getRefMonitor() {
		return refMonitor;
	}

	public void setRefMonitor(Monitor refMonitor) {
		this.refMonitor = refMonitor;
	}
	
	public Mouse getRefMouse() {
		return refMouse;
	}

	public void setRefMouse(Mouse refMouse) {
		this.refMouse = refMouse;
	}

	public Keyboard getRefKeyboard() {
		return refKeyboard;
	}

	public void setRefKeyboard(Keyboard refKeyboard) {
		this.refKeyboard = refKeyboard;
	}

	public Board getRefBoard() {
		return refBoard;
	}

	public void setRefBoard(Board refBoard) {
		this.refBoard = refBoard;
	}

	
	//2. 기본 생성자를 정의(상속을 위한 메소드)
	public Computer() {
		
	}


	//3. 매개변수를 갖는 생성자를 정의 - 클래스 외부로부터 4개의 컴퓨터 품 객체의 주소 입력받음
	public Computer(Monitor refMonitor, Mouse refMouse, Keyboard refKeyboard, Board refBoard) {
		this.refMonitor = refMonitor;
		this.refKeyboard = refKeyboard;
		this.refBoard = refBoard;
		this.refMouse = refMouse;
	}
	

}
