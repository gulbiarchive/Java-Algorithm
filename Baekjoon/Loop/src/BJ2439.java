import java.util.Scanner;

public class BJ2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			// 각 줄마다 공백의 개수는 전체 줄 수에서 현재 줄 번호를 뺀 값이다.
			for (int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			// 별을 출력
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		sc.close();

	}

}
