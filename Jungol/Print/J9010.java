package Print;

public class J9010 {

	public static void main(String[] args) {
		int a = 10, b = 20;

		int temp = a;
		a = b;
		b = temp;

		System.out.println(a + " " + b);
	}

}
