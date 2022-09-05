package net.kh.third;

public class Main {

	public static void main(String[] args) {
		
		Circle refCir = new Circle();
		double area1 = refCir.getArea();
		System.out.println("원의 넓이:"+ area1);
		
		Rectangle refRec = new Rectangle();
		double area2 = refRec.getArea();
		System.out.println("사각형의 넓이:"+area2);
		
		Triangle refTri = new Triangle();
		double area3 = refTri.getArea();
		System.out.println("삼각형의 넓이:"+ area3);

	}

}
