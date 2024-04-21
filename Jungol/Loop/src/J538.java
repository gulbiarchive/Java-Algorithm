import java.util.*;

public class J538 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("number? ");
			int num = sc.nextInt();
			
			if(num == 0)
				break;
			else
				System.out.println(num > 0 ? "positive integer" : "negative number");
		}
		sc.close();

	}

}
