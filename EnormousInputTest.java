import java.io.*;
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	
		String[] a=bf.readLine().split(" ");
		
		int n=Integer.parseInt(a[0]);
		int k=Integer.parseInt(a[1]);
		
		int suma=0;
		
		for(int i=0; i<n; i++){
			int e=Integer.parseInt(bf.readLine());
			if(e%k==0) suma++;
		}
		
		System.out.println(suma);
	}
 
}
 