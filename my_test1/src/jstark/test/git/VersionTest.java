package jstark.test.git;

public class VersionTest {

	public static void main(String[] args) {
		Test1 test1 = new Test1(1);
		Test2 test2 = new Test2((byte)2);
		
		System.out.println("test1 version: " + test1.getVersion());
		System.out.println("test2 version: " + test2.getVersion());
	}
}
