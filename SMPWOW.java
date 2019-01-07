import java.io.*;
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
 
		int a=Integer.parseInt(bf.readLine());
		System.out.print("W");
		for(int i=0; i<a; i++){
			System.out.print("o");
		}
		System.out.print("w");
	}
 
}