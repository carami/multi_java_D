package kr.co.multi.IOCExam.tv;

public class EunjiTV implements TV{
	boolean tv = false;
	int vol = 0;
	
	public EunjiTV() {
		super();
	}
	
	public EunjiTV(boolean tv, int vol) {
		super();
		this.tv = tv;
		this.vol = vol;
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		if (tv) {
			tv = true;
			System.out.println("TV가 켜졌습니다.");
		} else {
			System.out.println("TV가 이미 켜져있습니다.");
		}
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		if (tv) {
			tv = false;
			System.out.println("TV가 꺼졌습니다.");
		} else {
			System.out.println("TV가 이미 꺼져있습니다.");
		}
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if (vol < 1) {
			System.out.println("볼륨을 더이상 낮출 수 없습니다.");
		} else {
			System.out.println("볼륨이 -1되어 " + --vol + "가 되었습니다.");
		}
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("볼륨이 +1되어 " + ++vol + "가 되었습니다.");
	}
}

