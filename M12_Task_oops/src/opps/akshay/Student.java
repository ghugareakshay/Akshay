package opps.akshay;

public class Student {
	private int sId;
	private String sName;
	private String batch;
	private int age;
	public Student(int sId, String sName, String batch, int age) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.batch = batch;
		this.age = age;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
