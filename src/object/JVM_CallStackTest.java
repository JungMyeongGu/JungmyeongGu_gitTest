package object;

public class JVM_CallStackTest {
	public static void main(String[] args) {
		firstMethod();
	}
	
	static void firstMethod() {
		secondMethod();
		System.out.println("2��°");
	}
	static void secondMethod() {
		System.out.println("secondMethod()�� �����.");
	}
}
