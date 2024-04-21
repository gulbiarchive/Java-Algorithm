import java.util.*;
public class J9035 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("세 수를 입력하세요. ");
			int[] num = new int[3];
			
			for(int i = 0; i < num.length; i++)
				num[i] = sc.nextInt();
			
			Arrays.sort(num);
			System.out.println("입력받은 수 중 가장 큰 수는 " + num[2] +"입니다.");
			
			
		}

	}

}
