import java.util.*;
public class J9044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, count = 0;
		
		while(true) {
			int num = sc.nextInt();
			
			// 홀수의 합과 평균 출력 
			if(num % 2 != 0) {
			sum += num;
			count++;
			}
			
			if(num == 0)
				break;
		}
		
		System.out.println("홀수의 합 = " + sum);
		System.out.println("홀수의 평균 = " + sum / count);
		
		sc.close();
	}

}
