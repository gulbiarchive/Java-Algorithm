import java.util.*;

public class CU1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// 10의 자릿수, 1의 자릿 바꾼 후 2 곱하기 
		int r = ((n % 10) * 10 + (n / 10)) * 2;
		
		// 100 초과 시 100의 자릿수 무시하도록 작성
		if(r > 100)
			r %= 100;
		
		System.out.println(r);
		
		if(r > 50)
			System.out.println("OH MY GOD");
		else
			System.out.println("GOOD");
		
		sc.close();

	}

}
