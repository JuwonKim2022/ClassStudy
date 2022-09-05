package net.kh.first;

public class A {
	
	private B refObject = null; //null = 객체 주소가 할당 안되어 있음
	
	public A() {
		refObject = new B();
		refObject.method();
	}

}
