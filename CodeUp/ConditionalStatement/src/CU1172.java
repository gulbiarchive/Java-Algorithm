import java.util.*;

public class CU1172 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int[] a = new int[3];
			
			for(int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			
			Arrays.sort(a);
			System.out.println(a[0] + " " + a[1] + " " + a[2]);
		}

	}

}
