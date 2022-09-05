package net.kh.sixth;

public class Main {

	public static void main(String[] args) {
		
		Human refHuman = new Human();
		
		refHuman.eatBreakfast(new Food());
		refHuman.eatLunch(new Food());
		refHuman.eatDinner(new Food());
		/*
		 익명 객체, 일회용
		 객체를 재사용하지 않고 필요한 시점에 한번만 사용
		 	- 익명 객체(Anonymous Object)
		 	- 형식 : 참조 변수를 선언하지 않고 매개변수에 바로 객체의 주소를 대입
		 		- 메소드명(new 클래스명())
		 	- 객체를 한번만 사용
		 	 	- 이유 : 객체의 주소를 따로 참조 변수에게 대입하지 않기 때
		 	- 남발하면 메모리 소 
		 */
		
		Food refFood = new Food();
		refHuman.eatBreakfast(refFood);
		refHuman.eatLunch(refFood);
		refHuman.eatDinner(refFood);

	}

}
