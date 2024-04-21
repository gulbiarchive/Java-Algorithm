import java.util.*;

public class CU1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a / 10 == 1) {
			switch(a % 10) {
			case 1:
			case 2:
			case 3:
				System.out.print(a + "th");
				break;
			default:
			    System.out.println(a + "th");
			    break;
				
			}
		}
		else {
			
			switch(a % 10) {
			case 0:
				System.out.println(a + "th");
				break;
			case 1:
				System.out.println(a + "st");
				break;
			case 2:
				System.out.println(a + "nd");
				break;
			case 3:
				System.out.println(a + "rd");
				break;
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println(a + "th");
				break;
			}
			
		}
		
		
		
		
		
		
		
		sc.close();

	}

}

/*
 * 1, 2, 3 -> st, nd, rd
 * 11, 12, 13 -> 이것들 3개만 th
 * */