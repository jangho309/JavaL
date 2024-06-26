package chap18_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _10_HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> intList2 = 
				new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
		}
		
		List<Integer> sumList = new ArrayList<>();
		
		Map<String, Integer> intMap = new HashMap<String, Integer>();
		
		for(int i = 0; i < intList2.size(); i++) {
			for(int j = i + 1; j < intList2.size(); j++) {
				if(j != i) {
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		}
		
		
		
		System.out.println(sumList);
		
		for(int i = 0; i < sumList.size(); i++) {
			String castNum = "";
			castNum = sumList.get(i).toString();
			
			if(!intMap.containsKey(castNum)) {
				intMap.put(castNum, 1);
			} else {
				intMap.put(castNum, intMap.get(castNum) + 1);
			}
			
		}
		
		System.out.println(intMap);
		
		Set<Entry<String, Integer>> entrySet = intMap.entrySet();
		
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		int cnt = 0;
//		System.out.println("{");
		System.out.println("합이 유일한 합의 값 : ");
		while(entryIterator.hasNext()) {
			Entry<String, Integer> tmpEntry = entryIterator.next();
			
			if(tmpEntry.getValue() == 1) {
				System.out.print(tmpEntry.getKey() + ", ");
				cnt++;
			}
//			if(cnt < intMap.size() - 1) {
//				System.out.println( "	\"" + tmpEntry.getKey() + "\"" + " : " + tmpEntry.getValue() + ","); 
//				cnt++;
//			} else {
//				System.out.println( "	\"" + tmpEntry.getKey() + "\"" + " : " + tmpEntry.getValue());
//			}
		}
//		System.out.println("}");
		System.out.println("유일한 합의 개수 : " + cnt);
		
		/*
		 * {
		 * 		"3" : 1,
		 * 		"4" : 2,
		 * 		"5" : 2,
		 * 		"6" : 2,
		 * 		...
		 * 		"11" : 1
		 * }
		 */
		
		sc.close();
	}

}
