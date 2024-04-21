import java.util.*;

public class J9032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. ");
		int s = sc.nextInt();
		
		if(s >= 80)
			System.out.println("축하합니다. 합격입니다.");
		else
			System.out.println("불합격");
		sc.close();
	}

}
