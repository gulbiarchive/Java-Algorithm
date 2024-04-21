import java.util.*;

public class CU1202 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int s = sc.nextInt();
			
			if(s >= 90)
				System.out.println("A");
			else if(s >= 80)
				System.out.println("B");
			else if(s >= 70)
				System.out.println("C");
			else if(s >= 60)
				System.out.println("D");
			else
				System.out.println("F");
		}

	}

}
