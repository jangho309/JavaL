package chap12_interface.device;

public interface Tv extends ElectronicDevice, Speaker {
	void changeChannel(int channel);
}
