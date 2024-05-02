package chap11_abstraction.tv;

public class LgTv extends Tv {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("QLED TV 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("QLED TV 전원을 끕니다.");
	}

	@Override
	public void operate(int channel) {
		// TODO Auto-generated method stub
		this.lastChannel = channel;
		System.out.println("QLED TV " + this.lastChannel + "로 이동합니다.");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("QLED TV " + ++this.lastChannel + "로 이동합니다.");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("QLED TV " + --this.lastChannel + "로 이동합니다.");
	}
	
}
