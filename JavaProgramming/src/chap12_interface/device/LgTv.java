package chap12_interface.device;

public class LgTv implements Tv{
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 화면을 보여줍니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 전원 끔");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 노래 틈");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 채널 이동 : " + channel);
	}

	// default 메소드도 오버라이드 할 수 있다.
	@Override
	public void reset() {
		System.out.println("엘지티비 재부팅합니다.");
	}
	
	// static 메소드는 오버라이드 할 수 없다.
//	@Override
//	public void warn() {
//		
//	}

}
