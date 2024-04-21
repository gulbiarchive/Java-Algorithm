import java.util.*;
public class J9033 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("점수를 입력하세요. ");
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
