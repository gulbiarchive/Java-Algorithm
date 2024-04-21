import java.util.*;
public class CU1069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c1 = sc.next().charAt(0);
		
		if(c1 == 'A')
			System.out.println("best!!!");
		else if(c1 == 'B')
			System.out.println("good!!");
		else if(c1 == 'C')
			System.out.println("run!");
		else if(c1 == 'D')
			System.out.println("slowly~");
		else
			System.out.println("what?");
		
		
		sc.close();
	}

}
