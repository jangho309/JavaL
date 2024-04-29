package chap04_controlstatement;

import java.util.Scanner;

public class _11_Continue02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. 사용자가 입력한 숫자 단까지 구구단을 출력하는 프로그램을 작성하세요. 0을 입력하면 종료.
		//	  2~9까지의 숫자만 입력할 수 있도록 한다. 다른 숫자를 입력하면 continue를 이용해서 다시 숫자를 입력하도록 한다.
		// ① 
		// 2 ~ 9 값을 입력시 17(int gugu = sc.nextInt();)줄의 java.util.NoSuchElementException 발생
		// 34(sc.close())줄 제거시 exception 안뜸
		// https://okky.kr/questions/508578 사이트 참조 Scanner가 close 되는 것이 아닌 System.in이 close되는 것임
//		while(true) {
//			System.out.println("구구단을 출력할 단수를 입력하세요.");
//			Scanner sc = new Scanner(System.in);
//			int gugu = sc.nextInt();
//			if(gugu == 0) {
//				System.out.println("구구단을 종료시킵니다.");
//				break;
//			} else if(gugu >= 2 && gugu <= 9) {
//				for(int i = 2; i <= gugu; i++) {
//					System.out.println("---------" + i + "단---------");
//					for(int j = 1; j <= 9; j++) {
//						System.out.println(i + " * " + j + " = " + i*j);
//					}
//					System.out.println("---------" + i + "단---------");
//				}
//			} else {
//				System.out.println("숫자는 2~9까지만 입력이 가능합니다. 다시 입력해 주세요.");
//				continue;
//			}
//			
////			sc.close(); 				
//		}
		// ②
		Scanner sc = null;
		while(true) {
			System.out.println("구구단을 출력할 단수를 입력하세요.");
			sc = new Scanner(System.in);
			int gugu = sc.nextInt();
			
			if(gugu == 0) {
				System.out.println("구구단을 종료시킵니다.");
				break;
			} else if(gugu >= 2 && gugu <= 9) {
				for(int i = 2; i <= gugu; i++) {
					System.out.println("---------" + i + "단---------");
					for(int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i*j);
					}
					System.out.println("---------" + i + "단---------");
				}
				continue;
			} else {
				System.out.println("숫자는 2~9까지만 입력이 가능합니다. 다시 입력해 주세요.");
				continue;
			}
			
		}
		sc.close();
		// ③
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("숫자를 입력하세요. 0입력 시 종료");
//			int userNum = sc.nextInt();
//			
//			if(userNum == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			} else if(userNum < 2 || userNum > 9) {
//				System.out.println("2 ~ 9 사이의 숫자를 입력하세요.");
//				continue;
//			}
//			
//			for(int i = 2; i <= userNum; i++) {
//				System.out.println(i + "단");
//				for(int j = 1; j <= 9; j++) {
//					System.out.println(i + " * " + j + " = " + i * j);
//				}
//			}
//		}
//		
//		sc.close();
	}

}
