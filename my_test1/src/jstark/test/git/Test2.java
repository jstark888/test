package jstark.test.git;

public class Test2 extends Test {

	private byte val;
	
	public Test2(byte val) {
		this.val = val;
		setVersion("1.0");
	}
	
	public byte getByte() {
		return val;
	}
	
	public void setByte(byte val) {
		this.val = val;
	}
}
