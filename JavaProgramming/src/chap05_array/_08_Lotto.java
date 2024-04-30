package chap05_array;

import java.util.Random;

public class _08_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정수 7개를 저장할 수 있는 배열 생성
		int[] lottoArr = new int[7];
		
		Random rand = new Random();
		
		// 2. 1~45까지의 숫자 중 랜덤한 숫자 7개 배열에 저장(중복제거)
		for(int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = rand.nextInt(45) + 1;
			
			// 중복제거
			if(i > 0) {
				for(int j = 0; j < i; j++) {
					if(lottoArr[i] == lottoArr[j]) {
						// 중복된 값이 저장된 인덱스에 다시 값을 저장하기 위해
						// i--를 해준다.
						// 외부 for문의 i++ 증감식을 만나서 다시 현재 인덱스에 값을 저장할 수 있게 된다.
						i--;
						break;
					}
				}
			}
		}
		

//		int indexNum = 1;
//		boolean duplicate = false;
//		lottoArr[0] = (int)(Math.random() * 45 + 1);
//		while(indexNum < 7) {
//			int randomNum = (int)(Math.random() * 45 + 1);
////			System.out.println(randomNum);
//			for(int i = 0; i < indexNum; i++) {
//				if(lottoArr[i] == randomNum) {
//					duplicate = true;
//				}
////				System.out.println("lottoArr[" + i + "] : " + lottoArr[i] + ", randomNum : " + randomNum);
//			}
//			중복된 값이 다시 저장할 수 있기 때문에 사용할 수 없음
//			if(!duplicate) {
//				lottoArr[indexNum] = randomNum;
//				indexNum++;
//			}
//		}
//		// 3. 로또번호 출력
//		// 0~5까지의 인덱스는 실제 당첨번호
//		// 6번 인덱스는 보너스 번호로 출력
//		// 출력양식
//		// 이번주 로또 번호는 1, 2, 3, 4, 5, 6, 보너스 번호: 7
		System.out.print("이번주 로또 번호는 ");
		for(int i = 0; i < lottoArr.length; i++) {
			 if(i == lottoArr.length - 1) {
				 System.out.print("보너스 번호: " + lottoArr[i]);
			 } else {
				 System.out.print(lottoArr[i] + ", ");
			 }
		}
	}

}
