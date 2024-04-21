import java.util.*;
public class CU1168 {

	public static void main(String[] args) {
//		try( Scanner sc = new Scanner(System.in)){
//			
//			String birth = sc.next();
//			int g = sc.nextInt();
//			
//			int birthYear = Integer.parseInt(birth.substring(0, 2));
//			
//			if(g == 3 || g == 4) {
//				birthYear += 2000;
//			} else {
//				birthYear += 1900;
//			}
//			
//			int age = 2012 - birthYear + 1;
//			System.out.println(age);
//			
//		}
	
		for(int i = 2; i < 10; i++){
			if(i == 3){
				continue;
			}
			for(int j = 1; j < 10; j++){
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
	
	}
}

//if(gender == 1) {
//String birth1 = 19 + "" +birth[0] + birth[1];
//int result = Integer.parseInt(birth1);
//System.out.println(2012 - result + 1);
//} else if(gender == 2) {
//String birth1 = 19 + "" +birth[0] + birth[1];
//int result = Integer.parseInt(birth1);
//System.out.println(2012 - result + 1);
//} else if(gender == 3) {
//String birth1 = 20 + "" +birth[0] + birth[1];
//int result = Integer.parseInt(birth1);
//System.out.println(2012 - result + 1);
//} else if(gender == 4) {
//String birth1 = 20 + "" +birth[0] + birth[1];
//int result = Integer.parseInt(birth1);
//System.out.println(2012 - result + 1);
//} 