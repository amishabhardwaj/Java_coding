package oops;

public class StringDemo {
	public static void main(String args[]) {
		String s1 = new String("HSBC");
		String s2 = "HSBC";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
		sum(1,2);

		// Stringpool in action
//		String s1 = "HSBC"; //string literal
//		String s2 = "HSBC";
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s1 == s2);
	}

	static int sum(int a, int b) {
		return a + b;
	}
}