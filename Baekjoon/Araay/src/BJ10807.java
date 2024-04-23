import java.util.*;

public class BJ10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
			
		}
		
		int v = sc.nextInt();
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == v) {
				count++;
			}	
		}
		
		System.out.println(count);
		sc.close();

	}

}
