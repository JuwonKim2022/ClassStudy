package net.kh.third;

public class Triangle extends Shape {

	@Override
	public double getArea() {
		System.out.println("Truangle클래스에서 재정의한 getArea()");
		return 300;
	}

}
