import java.util.*;

public class J539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		
		while(true) {
			int num = sc.nextInt();
			
			sum += num;
			count++;
			
			if(num == 100) {
				break;
			}
			
			
		}
		System.out.println(sum);
		System.out.printf("%.1f", (float)sum / count);
		
		sc.close();

	}

}
