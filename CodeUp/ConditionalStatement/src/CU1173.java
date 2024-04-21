import java.util.*;

public class CU1173 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int h = sc.nextInt();
			int m = sc.nextInt();
			
			if(m >= 30) {
				m -= 30;
			}else {
				m += 30;
				h--;
				if(h < 0) {
					h = 23;
				}
			}
			
			System.out.println(h + " " + m);
			
		}

	}

}
