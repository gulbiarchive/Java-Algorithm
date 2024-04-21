import java.util.*;

public class CU1255 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		for(double i = a; i <= b; i+=0.01)
			System.out.printf("%.2f ", i);
		
		sc.close();
	
	}

}
/*
- 증가 잘 보기 1씩 증가하는 게 아니라 0.01씩 증가
- 소수 둘 째자리까지이기 때문에 자릿수 지정 */
