import java.io.*;
 
 
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a;
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		a= Integer.parseInt(bf.readLine());
		
		String[] sal=  new String[a];
		
		for(int i=0; i<a; i++){
			String b= bf.readLine();
			int x=0;
			
			while(x<(b.length()/2)){
				System.out.print(b.charAt(x));
				x=x+2;
			}
		System.out.println();
		}
	}
 
} 