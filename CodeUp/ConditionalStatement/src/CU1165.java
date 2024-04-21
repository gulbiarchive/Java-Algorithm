import java.util.*;
public class CU1165 {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
		
		int hour = sc.nextInt();
		int score = sc.nextInt();
		
		for(; hour <90; hour += 5) {
			score += 1;
		}
		System.out.println(score);
		
		}
	}

}

/*
 * java에서 'for'루프에서 초기값(intialization expresiion)을 생략할 수 있다
 * 단, 루프 바깥에서 이미 변수가 선언되어 있고 초기화되어 있어야 한다.
 * 지금 나의 코드는 'int hour = sc.nextInt();'를 통해 'hour'변수가 
 * 초기화 되어있으므로 초기값을 생략할 수 있다.
 * 
 * [다른 방법 코드]
 * int score = sc.nextInt();
 * for(int hour = sc.nextInt(); for < 90; hour += 5){
 * score += 1;
 * }
 * 이렇게 사용 가능 
 * */

/*
 * Scanner 클래스에서 경고가 발생한 이유 
 * AutoCloseable 인터페이스를 구현하고 있기 때문이다. 
 * Java7부터 도입된 try-with-resources문을 사용하면 리소스를 명시적으로 닫을 필요가 없다.
 * 
 *  추가 설명 
 *  AutoCloseable은 Java 7에서 도입된 인터페이스로, close() 메소드를 가지고 있습니다. 
 *  이 인터페이스를 구현한 클래스들은 try-with-resources 문을 사용하여 자동으로 자원을 닫을 수 있습니다. 
 *  try-with-resources를 사용하면 명시적으로 close()를 호출하지 않아도 자동으로 자원이 해제됩니다. 
 *  Scanner 클래스도 AutoCloseable을 구현하고 있으므로,
 *  try-with-resources 문을 사용하여 자동으로 close()가 호출되도록 할 수 있습니다.
 * */



// 조건문 문제라 생각해서 처음 생각한 코드 
//		if(hour < 90) {
//hour += 5;
//score += 1;
// System.out.println(score);
//}
//else {
//System.out.println(score);
//}
