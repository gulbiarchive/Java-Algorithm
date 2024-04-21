import java.util.*;
public class J529 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int o = m + 100 - h;
		if(o > 0) {
			System.out.println(o);
			System.out.println("Obesity");
		}else{
			System.out.println(o);
		}
		sc.close();

	}

}
