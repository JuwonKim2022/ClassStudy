package net.kh.third;

public class Rectangle extends Shape {

	@Override
	public double getArea() {
		System.out.println("Ractangle클래스에서 재정의한 getArea()");
		return 400;
	}

}
