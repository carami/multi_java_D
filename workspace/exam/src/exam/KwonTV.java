package exam;

public class KwonTV implements TV{
	
	@Override
	public void powerOn() {
		System.out.println("티비 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("티비 꺼짐");
	}

	@Override
	public void volumeUp() {
		System.out.println("티비 소리를 높임");

	}

	@Override
	public void volumeDown() {
		System.out.println("티비 소리를 낮춤");

	}
}
