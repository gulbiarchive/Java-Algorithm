import java.util.*;

public class J9042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0; // 자료 개수 
		int sum = 0; // 합계 
		
		while(true) {
			int a = sc.nextInt(); // 자료 입력
			
			if(a == 0) {
				break;
			}
			
			count++;
			sum += a;
			a++;
			
		}
		
		System.out.println("입력된 자료의 개수 = " + count);
		System.out.println("입력된 자료의 합계 = " + sum);
		System.out.printf("입력된 자료의 평균 = %.2f", (double)(sum / count));
		sc.close();
	}

}
