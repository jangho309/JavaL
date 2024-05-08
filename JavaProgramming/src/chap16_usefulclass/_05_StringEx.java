package chap16_usefulclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 문자열 두개 입력하여 str1, str2에 저장
		// str1이 str2를 포함하면 str1에 있는 str2를 빈칸으로 변경해서 출력
		// str1이 str2를 포함하지 않으면 str1에서 str2를 찾을 수 없습니다. 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = "";
		String str2 = "";
		try {
			System.out.println("첫 번째 문자열을 입력해주세요.");
			str1 = br.readLine();
			System.out.println("두 번째 문자열을 입력해주세요.");
			str2 = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(str1.contains(str2)) {
			String str3 = str1.replace(str2, "");
			System.out.println(str3);
		} else {
			System.out.println(str1 + "에서" + str2 +"를 찾을 수 없습니다.");
		}
		
	}

}
