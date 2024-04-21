import java.util.*;
public class CU1162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		if((year - month + day) % 10 == 0)
			System.out.println("대박");
		else
			System.out.println("그럭저럭");
		
		sc.close();

	}

}
