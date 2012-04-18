package jstark.test.git;

public class Test1 extends Test {
	private int val;
	private long lval;
	
	public Test1(int val) {
		this.val = val;
		setVersion("1.1");
	}
	
	public int getInt() {
		return val;
	}
	
	public void setInt(int val) {
		this.val = val;
	}

	public long getLongVal() {
		return lval;
	}

	public void setLongVal(long lval) {
		this.lval = lval;
	}
	
}
