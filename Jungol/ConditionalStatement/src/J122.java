import java.util.*;

public class J122 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int y = sc.nextInt();
			
			if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
				System.out.println("leap year");
			else
				System.out.println("common year");
		}

	}

}
