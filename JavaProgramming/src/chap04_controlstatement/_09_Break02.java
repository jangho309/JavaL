package chap04_controlstatement;

import java.util.Scanner;

public class _09_Break02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 사용자가 입력한 숫자 단까지 구구단을 출력하는 프로그램을 작성하세요. 0을 입력하면 종료하세요.
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("구구단을 출력할 단 수를 입력하세요.");
//			int inputNum = sc.nextInt();
//			
//			if(inputNum == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				sc.close();
//				break;
//			} else {
//				System.out.println("2단 부터 " + inputNum + "단까지 출력 시작합니다.");
//				System.out.println("------------------------");
//				for(int i = 2; i <= inputNum; i++) {
//					for(int j = 1; j <= 9; j++) {
//						System.out.println(i + " * " + j + " = " + i * j);
//						if(j == 3) break;
//					}
//					System.out.println("------------------------");
//				}
//			}
//			
//		}
		
		while(true) {
			System.out.print("숫자를 입력하세요.(0 입력 시 종료)");
			
			int userNum = sc.nextInt();
			
			if(userNum == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			for(int i = 2; i <= userNum; i++) {
				System.out.println(i + "단");
				for(int j = 1; j <= 9; j++) {
					// 내부 for문을 중단하는 break
					// j가 4가 되는 순간 내부 for문이 종료되고 외부 for문의 증감식으로 이동한다.
					if(j > 3) break;
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}
		}
		
		sc.close();
		
	}

}
