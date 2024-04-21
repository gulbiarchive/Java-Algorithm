import java.util.*;
// util에 Arrays, Scanner 둘 다 있음 

public class CU1167 {

	public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
		
		int[] x = new int[3];
		
		for(int y = 0; y < 3; y++) {
			x[y] = sc.nextInt();
		}
		
		Arrays.sort(x); // 오름차순 정렬 
		System.out.println(x[1]);
		
		
		}
	}

}
