import java.util.*;
public class J120 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > b)
				System.out.println(a - b);
			else
				System.out.println(b - a);
		}

	}

}
