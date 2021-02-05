package kr.co.multi.IOCExam;

public class MyBean {
	private String name;
	private int count;
	
	private MyDAO myDao;
	
	public void setMyDao(MyDAO myDao) {
		this.myDao = myDao;
	}
	
	public void checkDao() {
		myDao.print();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
}
