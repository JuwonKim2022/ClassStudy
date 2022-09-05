package net.kh.fourth;

public class A {
	
	/*
	 의존 관계
	  - 의존 : 메소드의 생명 주기에 의존
	  	- 다른 클래스에서 메소드가호출될 때 매개변수가 메모리에 생성
	  	- 메소드가 종료되면 매개변수가 메모리에 없어짐
	 */
	
	public void method1(B refObject) {
		System.out.println("클래스 A의 method(B refObject)");
		refObject.method2();
	}
	
	public void method3() {
		//오류 발생
//		refObject.method2();
	}

}
