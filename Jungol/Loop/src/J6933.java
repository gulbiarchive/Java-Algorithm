import java.util.*;

public class J6933 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			
			int num = sc.nextInt();
			System.out.println();
			
			if(num == 1)
				System.out.println("Seoul\n");
			else if(num == 2)
				System.out.println("Washington\n");
			else if(num == 3)
				System.out.println("Tokyo\n");
			else if(num == 4)
				System.out.println("Beijing\n");
			else {
				System.out.println("none\n");
				break;
			}
			
		}
		sc.close();

	}

}
