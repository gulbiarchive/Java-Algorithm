import java.util.*;
public class CU1206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > b && a % b == 0)
				System.out.println(b + "*" + (a / b) + "=" + a);
			else if(b > a && b % a == 0)
				System.out.println(a + "*" + (b / a) + "=" + b);
			else
				System.out.println("none");
		
		sc.close();
	}

}
