package net.kh.sixth;

public class Human {
	
	public void eatBreakfast(Food refFood) {
		System.out.println("아침에 식사를 합니다.");
		refFood.method();
	}
	public void eatLunch(Food refFood) {
		System.out.println("점심에 식사를 합니다.");
		refFood.method();
	}
	public void eatDinner(Food refFood) {
		System.out.println("저녁에 식사를 합니다.");
		refFood.method();
	}

}
