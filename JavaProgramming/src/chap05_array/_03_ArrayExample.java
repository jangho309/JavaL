package chap05_array;

public class _03_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. chArr의 요소 중 소문자는 대문자로, 대문자는 소문자로 변환하여 convertArr에 저장하세요.
		char[] chArr = {'b', 'I', 't', 'C'};
		// {'B', 'i', 'T', 'c'}
		char[] convertArr = new char[4];
		
//		System.out.println(chArr[0] >= 65);
		// 대문자 65 ~ 90, 소문자 97 ~ 122
//		for(int i = 0; i < chArr.length; i++) {
//			if(chArr[i] >= 65 && chArr[i] <= 90) {
//				convertArr[i] = (char)(chArr[i] + 32);
//			} else if(chArr[i] >= 97 && chArr[i] <= 122) {
//				convertArr[i] = (char)(chArr[i] - 32);
//			}
//		}
//		for(int j = 0; j < convertArr.length; j++) {
//			System.out.println(convertArr[j]);
//		}
		
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
				convertArr[i] = Character.toLowerCase(chArr[i]);
			} else {
				convertArr[i] = Character.toUpperCase(chArr[i]);
			}
			
			System.out.println(convertArr[i]);
		}
	}

}
