package chap12_interface.multiflex;

// MultiflexStadium이 Stadium과 ConcertHall의 형태도 가지기 때문에
// SeoulMultiflexStadium 클래스는
// Stadium 타입의 변수에도 사용할 수 있고 ConcertHall 타입의 변수에도 사용할 수 있고
// MultiflexStadium 타입 변수에도 사용할 수 있으며 SeoulMultiflexStadium 타입 변수로도 사용할 수 있다.
// 한 클래스에서 클래스 사옥도 받고 인터페이스도 상속받을 수 있다.
public class SeoulMultiflexStadium extends Theater implements MultiflexStadium {

	@Override
	public void getSportSchedule(int month) {
		// TODO Auto-generated method stub
		System.out.println(month + "월에 예정된 경기는 총 5경기입니다.");
	}

	@Override
	public int getSportsTicketPrice(int people) {
		// TODO Auto-generated method stub
		return 7000 * people;
	}

	@Override
	public void getSupporterItem(int peopler) {
		// TODO Auto-generated method stub
		System.out.println(peopler + "명의 아이템 구매 가격은" + peopler * 15000 + "원입니다.");
	}

	@Override
	public void printSchedule(int month) {
		// TODO Auto-generated method stub
		System.out.println(month + "월에 예정된 콘서틑 총 2건입니다.");
	}
	
	@Override
	public int getTicketPrice(int people) {
		// TODO Auto-generated method stub
		return people * 96000;
	}
	
	@Override
	public void getRemainSeat() {
		// TODO Auto-generated method stub
		System.out.println("남아이는 총 좌석은 125석입니다.");
	}
	
	@Override
	public void playSportgameOrConcert() {
		// TODO Auto-generated method stub
		System.out.println("토요일에는 수원대 서울 경기가 진행되고 일요일에는 싸이 콘서트가 진행될 예정입니다.");
	}

	@Override
	public void playMovie() {
		// TODO Auto-generated method stub
		System.out.println("영화를 상영한다.");
	}
}
