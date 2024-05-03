package chap99_homework.homework04;

public class ArrayUtility2 {
	public static int[] concat(int[] s1, int[] s2) {
		int[] returnArr = new int[s1.length + s2.length];
		
		int index = 0;
		
		for(int i = 0; i < s1.length; i++) {
			returnArr[index++] = s1[i];
		}
		
		for(int i = 0; i < s2.length; i++) {
			returnArr[index++] = s2[i];
		}
		
		return returnArr;
	}
	//s1 = {1, 2, 3}
	//s2 = {2, 4, 5}
	//s3 = {1, 3} new int[s1.length - 중복개수]
	public static int[] remove(int[] s1, int[] s2) {
		
		int[] indexArr = new int[s1.length];
		
		int index = 0;

		for(int i = 0; i < s1.length; i++) {
			for(int j = 0; j < s2.length; j++) {
				if(s1[i] == s2[j]) {
					indexArr[index++] = i;
					break;
				}
			}
		}
		
		int[] returnArr = new int[s1.length - index];
		
		int idx = 0;
		
		for(int i = 0; i < s1.length; i++) {
			boolean isDup = false;
			
			for(int j =0 ; j < index; j++) {
				if(i == indexArr[j]) {
					isDup = true;
					break;
				}
			}
			
			if(isDup) {
				continue;
			}
			
			returnArr[idx++] = s1[i];
		}
		
		return returnArr;
	}
	
	static int[] remove2(int[] s1, int[] s2) {
		int[] dest = new int[s1.length];
		int index = 0;
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				// {1, 2, 3}
				// {3, 4, 5}
				if(s1[i]!=s2[j]) {
					dest[index] = s1[i];
					index++;
				}
			}
		}
		for(int i=0;i<dest.length;i++) System.out.println(dest[i]+" ");
		return dest;
	}
	
	public static remove3(int[] s1, int[] s2) {
		// {false, false, false, false, .... false}
		boolean[] isPresent = new boolean[1001];
		
		// s2 = {1, 2, 3}
		for(int num : s2) {
			// {false, true, true, true, false, ......}
			isPresent[num] = true;
		}
		
		// s1에서 s2에 없는 요소만 새로운 배열에 복사
		int[] temp = new int[s1.length];
		
		int index = 0;
		
		// s1 = {1, 2, 3, 4, 5}
		for(int num : s1) {
			// 1, 2, 3: true
			// 4, 5: false
			if(!isPresent[num]) {
				temp[index++] = num;
			}
		}
		
		int[] returnArr = new int[index];
		
		System.arraycopy(temp, 0, returnArr, 0, index);
		return returnArr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
