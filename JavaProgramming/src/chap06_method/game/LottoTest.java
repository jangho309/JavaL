package chap06_method.game;

public class LottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottoArray = new int[7];
		//중복없는 로또
		//{43, X, X, X, X, X, X} i, j
		int randomNum = (int)(Math.random() * 45) + 1;
		lottoArray[0] = randomNum;
		
		for(int i = 1; i < lottoArray.length; i++) {
			randomNum = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(lottoArray[j] == randomNum) {
					randomNum = (int)(Math.random() * 45) + 1;
					j = 0;
				}
			}
			lottoArray[i] = randomNum;
		}
		
		for(int k = 0; k < lottoArray.length; k++) {
			System.out.println(lottoArray[k]);
		}
	}

}
