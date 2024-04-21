import java.util.*;

public class J540 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			
			if(num % 3 == 0) {
				System.out.print(num / 3);
				
			} 
			
			if(num == -1)
				break;
		}
		sc.close();

	}

}
