import java.util.*;

public class J632 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int[] a = new int[3];
			
			for(int i = 0; i <a.length; i++) {
				a[i] = sc.nextInt();
			}
			
			Arrays.sort(a);
			System.out.println(a[0]);
		}
	}

}
