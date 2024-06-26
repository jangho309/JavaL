package chap16_usefulclass;

import java.util.Arrays;
import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 5개의 정수를 입력하고 배열에 저장
		// 배열에 저장된 정수 5개 중 최대값과 최소값을 구하세요.
		// Math.max와 Math.min 메소드를 이용하세요.
		Scanner sc = new Scanner(System.in); 
		int[] inputNumArr = new int[5];
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < inputNumArr.length; i++) {
			System.out.println((i + 1) + "번째 숫자값을 입력해 주세요.");
			inputNumArr[i] = sc.nextInt();
			sc.nextLine();
		}
		
//		try {
//			for(int i = 0; i < inputNumArr.length; i++) {
//				System.out.println((i + 1) + "번째 숫자값을 입력해 주세요.");
//				inputNumArr[i] = br.read();
//				br.readLine();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		int minNum = inputNumArr[0];
		int maxNum = inputNumArr[0];
		// { 1, 4, 5, 3, 2}
		
		System.out.println("배열 모양 : " + Arrays.toString(inputNumArr));
		
		for(int j = 1; j < inputNumArr.length; j++) {
			minNum = Math.min(minNum, inputNumArr[j]);	// 1   1   1
			maxNum = Math.max(maxNum, inputNumArr[j]);	// 63  79  79
//			System.out.println( j + "번째 실행 minNum : " + minNum + ", maxNum : " + maxNum);
		}
		
		System.out.println("최소값 : " + minNum + ", 최대값 : " + maxNum);
		sc.close();
	}

}
