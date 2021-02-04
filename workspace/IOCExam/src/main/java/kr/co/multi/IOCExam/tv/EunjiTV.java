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
			System.out.println("TV�� �������ϴ�.");
		} else {
			System.out.println("TV�� �̹� �����ֽ��ϴ�.");
		}
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		if (tv) {
			tv = false;
			System.out.println("TV�� �������ϴ�.");
		} else {
			System.out.println("TV�� �̹� �����ֽ��ϴ�.");
		}
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if (vol < 1) {
			System.out.println("������ ���̻� ���� �� �����ϴ�.");
		} else {
			System.out.println("������ -1�Ǿ� " + --vol + "�� �Ǿ����ϴ�.");
		}
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("������ +1�Ǿ� " + ++vol + "�� �Ǿ����ϴ�.");
	}

}

