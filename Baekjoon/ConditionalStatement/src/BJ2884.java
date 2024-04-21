import java.util.*;
public class BJ2884 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int h = sc.nextInt();
			int m = sc.nextInt();
			
			if(m >= 45) {
				m -= 45;
			} else {
				h--;
				m += 15;
				if(h < 0)
					h = 23;
			}
			
			System.out.println(h + " " + m);
		}

	}

}

/*시간 문제 푸는 형식!
 * if(m >= 기준 되는 분){
 * 		m -= 기준 되는 분;
 * } else{
 * 		h--;
 * 		m += (60 - 기준 되는분);
 * 		if(h < 0)
 * 			h = 23;
 * }
 * 
 * System.out.println(h + " " + m);
 * */
 