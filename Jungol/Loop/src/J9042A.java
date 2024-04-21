import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class J9042A {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int n =0;
		double avg = (double)sum/n;
		
		while(true) {
			
			int a =Integer.parseInt(br.readLine());
			
				if(a==0) 
					break;
			
					sum+=a;
					n++;
					avg = (double)sum/n;
				}
	
					System.out.println("입력된 자료의 갯수 = "+n);
					System.out.println("입력된 자료의 합계 = "+sum);
					System.out.println("입력된 자료의 평균 = "+avg);
		
		}
		

	}


