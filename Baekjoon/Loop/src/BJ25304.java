import java.util.*;

public class BJ25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); // 영수증에 적힌 총 금액 
		int N = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류 수 
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			X -= a * b;
		}
		
		if(X == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		sc.close();

	}

}
