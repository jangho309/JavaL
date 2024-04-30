package chap06_method.score;

public class Score {
	// 1. int형 배열(정수배열)을 매개변수로 받아서 점수의 총합을 int형으로 리턴하는 메소드 getTotalScore를 구현하세요.
	public int getTotalScore(int[] scores) {
		int total = 0;
		for(int score : scores) {
			total += score;
		}
		return total;
	}
	
	
	// 2. int형 배열(정수배열)을 매개변수로 받아서 점수의 평균을 double형으로 리턴하는 메소드 getAvgScore를 구현하세요.
	public double getAvgScore(int[] scores) {
		return (double) getTotalScore(scores) / scores.length;
	}
}
