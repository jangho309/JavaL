package chap07_class.circle;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(3);
		System.out.println("원의 둘레 : " + circle.circleAround());
		System.out.println("원의 넓이 : " + circle.circleArea());
	}

}
