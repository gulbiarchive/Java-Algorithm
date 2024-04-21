import java.util.*;
public class CU1169A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		int b = (2012 + 1 - age) % 100;
		
		if(age >= 14 && age <= 113)
			System.out.println(b + " " + 1);
		else
			System.out.println(b + " " + 3);
		
		sc.close();
		

	}

}
