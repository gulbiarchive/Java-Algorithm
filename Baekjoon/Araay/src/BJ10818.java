import java.util.*;

public class BJ10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.print(Arrays.stream(num).min().getAsInt() + " ");
		System.out.println(Arrays.stream(num).max().getAsInt());
		sc.close();

	}

}
