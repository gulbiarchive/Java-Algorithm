import java.util.*;

public class J535 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			double s = sc.nextDouble();
			
			switch((int)s) {
			case 4:
				System.out.println("scholarship");
				break;
			case 3:
				System.out.println("next semester");
				break;
			case 2:
				System.out.println("seasonal semester");
				break;
			default:
				System.out.println("retake");
			}
		}

	}

}
