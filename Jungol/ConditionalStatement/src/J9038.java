import java.util.*;

public class J9038 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > b)
				System.out.println(a);
			else
				System.out.println(b);
		}

	}

}
