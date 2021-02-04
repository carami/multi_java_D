package tv.user;

import exam.EunbinTV;
import exam.EunjiTV;
import exam.HJTV;
import exam.KwonTV;
import exam.TV;
import exam.TVFactory;

public class TVUser {

	public static void main(String[] args) {
	//	EunbinTV tv = new EunbinTV();
//		HJTV tv = new HJTV();
//		tv.tvOn();
//		
//		tv.soundOn();
//		tv.soundOff();
//		
//		tv.tvOff();
		
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		
//		TV tv = new EunjiTV();
//		TV tv = new KwonTV();
		
		TV tv = TVFactory.getTV(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	
		
		
	}

}
