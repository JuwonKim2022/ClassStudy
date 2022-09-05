package net.kh.third;

public class Circle extends Shape {

	@Override
	public double getArea() {
		System.out.println("Circle클래스에서 재정의한 getArea()");
		return 100;
	}

}
