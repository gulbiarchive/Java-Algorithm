import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ15552 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int T = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < T; i++) {
        	 StringTokenizer st = new StringTokenizer(bf.readLine());
        	int A = Integer.parseInt(st.nextToken());
        	int B = Integer.parseInt(st.nextToken());
        	 // Write the result to the BufferedWriter
            bw.write(A + B + "\n");
        }
        

        // Flush the BufferedWriter and close it
        bw.flush();
        bw.close();
        
	}

}
