package jstark.test.git;

public class Test1 extends Test {
	private int val;
	
	public Test1(int val) {
		this.val = val;
		setVersion("1.0");
	}
	
	public int getInt() {
		return val;
	}
	
	public void setInt(int val) {
		this.val = val;
	}
}
