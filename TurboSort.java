import java.io.*;
import java.util.Arrays;
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb=new StringBuilder();
		
		
		int t=Integer.parseInt(bf.readLine());
		
		int[] n=new int[t];
		
		for(int i=0; i<t; i++){
			n[i]=Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(n, 0, t);
		
		for(int i=0; i<t; i++){
			sb.append(n[i]);
			sb.append('\n');
		}
		
		bw.write(sb.toString());
		bw.close();
		
	}
} 