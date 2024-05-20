package homework14.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다.
		// intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add((int)(Math.random() * 10) + 1);
		}
		
		intList.stream()
			   .mapToInt(num -> num * 3)
			   .forEach(num -> System.out.println(num));
		
		// 2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
//		List<String> strInputList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + "번째 문자열을 입력해주세요.");
//			strInputList.add(sc.nextLine());
//		}
//		
//		strInputList.stream()
//					.filter(num -> num.length() >= 5)
//					.forEach(num -> System.out.println(num));
		
		// 3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서 문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
		// 정규식 패턴 0~9 피하고 특수문자 피하는 방법이 떠오르지 않음 강사님처럼 하나씩 판별하는 것이 맞았다.
		List<String> strList = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "번째 문자열을 입력해주세요.");
			strList.add(sc.nextLine());
		}
		
		strList.stream()
		.filter(str -> {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ||
				str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					return true;
				}
			}
			return false;
		})
		.forEach(str -> 
			System.out.print(str + ", "));
//		strList.stream()
//			   .filter(inputStr -> !inputStr.matches("^*[0-9]*$"))
//			   .forEach(input -> System.out.println("영문자 포함한 입력값 : " + input));
	
		sc.close();
	}

}
