import java.io.*;
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		String[] ent=bf.readLine().split(" ");
		
		int a=Integer.parseInt(ent[0]);
		int b=Integer.parseInt(ent[1]);
		
		
		System.out.println(a^b);
	}
 
}