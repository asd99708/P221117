package CellPhone;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("channel " + channel + "번 DMB 방송 수신 시작");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel "+ channel + "번으로 변셩");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신 종료");
	}
}
