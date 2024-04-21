import java.util.*;

public class CU1205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = a + b;
		int y = a - b;
		int z = b - a;
		
		int w = a * b;
		
		int k = a / b;
		int m = b / a;
		
		int n7 = (int) Math.pow(a, b);
		int n8 = (int) Math.pow(b, a);
		
		int r1 = Math.max(x, y);
		int r2 = Math.max(r1, z);
		int r3 = Math.max(r2, w);
		int r4 = Math.max(r3, k);
		int r5 = Math.max(r4, m);
		int r6 = Math.max(r5, n7);
		int r7 = Math.max(r6, n8);
		
		System.out.printf("%.6f", (double)r7);
		
		sc.close();
	}

}
