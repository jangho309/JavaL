package chap04_controlstatement;

public class _04_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1 ~ 100까지의 합
		int num = 1;
		int sum = 0;
		
		while(num <= 100) {
			sum += num++;
		}
		
		System.out.println("1~100까지의 합 : " + sum);
		System.out.println("-------------------------");
		
		// 2. while문을 이용해서 1~10까지 거꾸로 출력하세요.
		int num2 = 10;
		while(num2 > 0) {
			System.out.println("num2 -> " + num2--);
		}
		
		System.out.println("-------------------------");
		for(int num3 = 10; num3 > 0; num3--) {
			System.out.println("num3 -> " + num3);
		}
	}

}
