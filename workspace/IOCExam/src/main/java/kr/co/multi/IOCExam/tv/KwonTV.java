package kr.co.multi.IOCExam.tv;

public class KwonTV implements TV{
	
	@Override
	public void powerOn() {
		System.out.println("Ƽ�� ����");
	}

	@Override
	public void powerOff() {
		System.out.println("Ƽ�� ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("Ƽ�� �Ҹ��� ����");

	}

	@Override
	public void volumeDown() {
		System.out.println("Ƽ�� �Ҹ��� ����");

	}
}
