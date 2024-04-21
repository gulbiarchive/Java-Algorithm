import java.util.*;
public class CU1207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int r = a + b + c + d;
		
		if(r == 1)
			System.out.println("도");
		else if(r == 2)
			System.out.println("개");
		else if(r == 3)
			System.out.println("걸");
		else if(r == 4)
			System.out.println("윷");
		else
			System.out.println("모");
		
		
		sc.close();
	}

}
