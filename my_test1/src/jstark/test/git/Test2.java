package jstark.test.git;

public class Test2 extends Test {

	private byte val;
	private String sval;
	private boolean bval;
	
	public Test2(byte val) {
		this.val = val;
		setVersion("1.2");
	}
	
	public byte getByte() {
		return val;
	}
	
	public void setByte(byte val) {
		this.val = val;
	}

	public String getString() {
		return sval;
	}

	public void setString(String sval) {
		this.sval = sval;
	}
	
	public boolean getBoolean() {
		return bval;
	}
	
	public void setBoolean(boolean bval) {
		this.bval = bval;
	}
}
