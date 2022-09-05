package net.kh.fifth;

public class User {
	
	private SmartPhone refObj = null;
	
	public User() {
		refObj = new SmartPhone();
	}
	
	public void method1() {
		refObj.turnOn();
	}
	public void method2() {
		refObj.turnOff();
	}
	public void method3() {
		refObj.phoneCall();;
	}

}
