package chap11_abstraction.board;

// Board 클래스를 추상화
// post 메소드도 추상메소드로 변경
// modify 메소드와 delete 메소드를 추상메소드로 선언하고 FreeBoard와 NoticeBoard에서 구현
public abstract class Board {
	long id;
	String title;
	String content;
	String writer;
	String creDate;

	
	public abstract void post();
	
	public abstract void modify();
	
	public abstract void delete();
}
