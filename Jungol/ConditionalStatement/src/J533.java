import java.util.*;
public class J533 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			char s = sc.next().charAt(0);
			int a = sc.nextInt();
			
			if(a >= 18) {
				if(s == 'M')
					System.out.println("MAN");
				else
					System.out.println("WOMAN");
				
			} else {
				if(s == 'M')
					System.out.println("BOY");
				else
					System.out.println("GIRL");
			}
		}

	}

}
