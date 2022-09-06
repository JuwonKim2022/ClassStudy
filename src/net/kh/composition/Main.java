package net.kh.composition;

public class Main {

	public static void main(String[] args) {
	
		House refHouse = new House();
		
		refHouse.getRefRoom().method1();
		System.out.println("==========================");
		refHouse.getRooms();
		
	}
	
}
