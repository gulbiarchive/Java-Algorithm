import java.util.*;

public class CU1261 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int b = 0;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] % 5 == 0) {
				b = 1;
				System.out.println(a[i]);
				break;
			}
		}
		
		if(b == 0) {
			System.out.println("0");
		}
		
		sc.close();

	}

}
