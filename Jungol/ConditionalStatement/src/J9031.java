import java.util.*;
public class J9031 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > b)
				System.out.println("입력받은 수 중 큰 수는 " + a +"이고 작은 수는 " + b + "입니다.");
			else
				System.out.println("입력받은 수 중 큰 수는 " + a +"이고 작은 수는 " + b + "입니다.");
		}
		

	}

}
