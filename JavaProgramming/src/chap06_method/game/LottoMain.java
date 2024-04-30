package chap06_method.game;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto = new Lotto();
		int[] lottoArray = lotto.generateLottoArray();
		for(int lottoNum : lottoArray) {
			System.out.println(lottoNum);
		}
	}

}
