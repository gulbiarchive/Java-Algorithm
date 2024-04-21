import java.util.*;

public class J121 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			
			if(a == 0)
				System.out.println("zero");
			else
				System.out.println(a > 0 ? "plus" : "minus");
		}

	}

}
