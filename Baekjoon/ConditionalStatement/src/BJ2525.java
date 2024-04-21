import java.util.*;

public class BJ2525 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int r = (a * 60 + b) + c;
		
			
			int h = (r / 60) % 24;
			int m = r % 60;
			
			System.out.println(h + " " + m);
		}

	}

}
