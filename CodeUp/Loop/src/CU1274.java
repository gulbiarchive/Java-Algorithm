import java.util.*;

public class CU1274 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i;
		
		for(i = 2; i<= n; i++) {
			if(n % i == 0)
				break;
			
			
		}
		
		if(n == i)
			System.out.println("prime");
		else
			System.out.println("not prime");
		
		sc.close();

	}

}
