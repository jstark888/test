package jstark.test.git;

public class Test3 extends Test {

	private short val;
	
	public Test3(short val) {
		this.val = val;
		setVersion("1.3");
	}

	public short getShort() {
		return val;
	}

	public void setShort(short val) {
		this.val = val;
	}
}
