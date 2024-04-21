import java.util.*;

public class J9045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* int num;

		do {
		System.out.println("1. 입력하기");
		System.out.println("2. 출력하기");
		System.out.println("3. 삭제하기");
		System.out.println("4. 끝내기");
		
		System.out.print("작업할 번호를 선택하세요. ");
		num = sc.nextInt();
		
		System.out.println();
		if(num == 1) 
			System.out.println("입력하기를 선택하였습니다.");
		else if(num == 2)
			System.out.println("출력하기를 선택하였습니다.");
		else if(num == 3)
			System.out.println("삭제하기를 선택하였습니다.");
		else if(num == 4) {
			System.out.println("끝내기를 선하였습니다.");
			break;
		}
		
		}while(num >= 1 && num <= 4);
		
		System.out.println("잘못 입력하였습니다."); */
		
		while(true) {
			System.out.println("1. 입력하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 끝내기");
			
			System.out.print("작업할 번호를 선택하세요. ");
			int num = sc.nextInt();
			
			System.out.println();
			if(num == 1) 
				System.out.println("입력하기를 선택하였습니다.\n");
			else if(num == 2)
				System.out.println("출력하기를 선택하였습니다.\n");
			else if(num == 3)
				System.out.println("삭제하기를 선택하였습니다.\n");
			else if(num == 4) {
				System.out.println("끝내기를 선하였습니다.\n");
				break;
			} else 
				System.out.println("잘못 입력하였습니다.\n");
		}
		
		sc.close();

	}

}
// 자바에도 do ~ while() 구문이 있다.
// 하지만 이 코드는 do ~ while()을 쓸 필요가 없다. 