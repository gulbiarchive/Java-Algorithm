import java.util.*;

public class CU1201 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			
			if(a == 0)
				System.out.println("0");
			else
				System.out.println(a > 0 ? "양수" : "음수");
		}

	}

}
