package exam;

public class TVFactory {
	public static TV getTV(String tvName) {
		TV tv = null;
		if("k".equalsIgnoreCase(tvName))
			tv = new KwonTV();
		else if("e".equalsIgnoreCase(tvName))
			tv = new EunjiTV();
		
		return tv;
	}
}
