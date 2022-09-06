package net.kh.aggregation;

public class Main {

	public static void main(String[] args) {
		/*
		 이유 : 사람의 일생 -> 객체의 일생(시작, 사용, 끝)
		 
		 프로그램 전체에서 시작 : main() 메소드
		 객체의 시작 : main()
		 	-> new	연산자를 사용해서 객체를 생성(명령어)
		 	-> 명령어가 실행되어 칩 메모리에 객체가 생성
		 */
		Monitor refMonitor = new Monitor();
		Keyboard refKeyboard = new Keyboard();
		Board refBoard = new Board();
		Mouse refMouse = new Mouse();
		
		//컴퓨터 전체 객체를 생성 : 매개변수가 있는 생성자를 선택
		Computer refComputer = new Computer(refMonitor, refMouse, refKeyboard, refBoard);
		
		//각각의 부품 클래스에서 만든 메소드를 호출
		refMonitor.method1();
		refKeyboard.method3();
		refMouse.method2();
		refBoard.method4();
		System.out.println();
		/*
		 각각의 부품 객체를 사용하는 방법
		 	1. 개별적인 부품 객체 하나하나를 사용
		 	2. 전체 객체인 컴퓨터를 통해서 각각의 부품 객체에 접근(사용) 가능
		 		- 문제점 : 참조 변수의 접근 제한자가 private
		 	
		 	refComputer.참조변수명: 불가능(참조변수가 접근 제한자가 private)
		 		해결법 1) getter 
		 */
		Monitor refMonitor2 = refComputer.getRefMonitor();
		Mouse refMouse2 = refComputer.getRefMouse();
		Keyboard refKeyboard2 = refComputer.getRefKeyboard();
		Board refBoard2 = refComputer.getRefBoard();
		
		//모니터 클래스의 메서드1 호출
		refMonitor2.method1();
		refMouse2.method2();
		refKeyboard2.method3();
		refBoard2.method4();
		
	}

}
