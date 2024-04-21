import java.util.*;

public class CU1164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		
		if((t1 > 170) && (t2 > 170) && (t3 > 170))
			System.out.println("PASS");
		else
			System.out.println("CRASH");
		
		sc.close();

	}

}
