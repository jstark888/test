package jstark.test.git;

public class Test3 extends Test {

	private char val;
	
	public Test3(char val) {
		this.val = val;
		setVersion("1.4");
	}

	public char getChar() {
		return val;
	}

	public void setChar(char val) {
		this.val = val;
	}
}
