package methodChaning;

public class A {
	public static A a() {
		System.out.println("a");
		return new A();
	}
	public static A b() {
		System.out.println("b");
		return new A();
	}
	public static B c() {
		System.out.println("c");
		return new B();
	}
}
