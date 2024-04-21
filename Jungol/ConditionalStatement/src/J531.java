import java.util.*;

public class J531 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			double w = sc.nextDouble();
			
			
			if(w <= 50.80)
				System.out.println("Flyweight");
			else if(w <= 61.23)
				System.out.println("Lightweight");
			else if(w <= 72.57)
				System.out.println("Middleweight");
			else if(w <= 88.45)
				System.out.println("Cruiserweight");
			else
				System.out.println("Heavyweight");
			
		}

	}

}
