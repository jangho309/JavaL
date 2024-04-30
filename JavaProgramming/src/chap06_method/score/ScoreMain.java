package chap06_method.score;

public class ScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score sc = new Score();
		System.out.println("Total : " + sc.getTotalScore(new int[] {62, 71, 85, 97, 90}));
		System.out.println("Average : " + sc.getAvgScore(new int[] {62, 71, 85, 97, 90}));
	}

}
