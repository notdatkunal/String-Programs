package MyPackage;

public class Test {
	public static void main(String[] args) {
		Object ref = "Kunal"; // up casting
		String str = (String)ref;// down casting
		System.out.println(ref);
		System.out.println(str);
	}
}
