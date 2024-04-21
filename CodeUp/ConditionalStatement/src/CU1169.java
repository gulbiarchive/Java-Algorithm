import java.util.*;

public class CU1169 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int age = sc.nextInt();
			
			if(age >= 14 && age <= 113)
				System.out.println((2012 - age + 1) % 100 + " " + 1);
			else
				System.out.println((2012 - age + 1) % 100 + " " + 3);
			
		}
		

	}

}
