import java.util.*;
public class J534 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			char L = sc.next().charAt(0);
			
			if(L == 'A')
				System.out.println("Excellent");
			else if(L == 'B')
				System.out.println("Good");
			else if(L == 'C')
				System.out.println("Usually");
			else if(L == 'D')
				System.out.println("Effort");
			else if(L == 'F')
				System.out.println("Failure");
			else
				System.out.println("error");
			
		}

	}

}
