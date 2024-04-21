import java.util.*;

public class CU1254 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c1 = sc.next().charAt(0);
		char c2 = sc.next().charAt(0);
		
		for(char i = c1; i <= c2; i++)
			System.out.print(i + " ");
		
		sc.close();
	}

}
