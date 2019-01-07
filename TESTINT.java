import java.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws NumberFormatException, IOException{
		int a,b;
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		a= Integer.parseInt(bf.readLine());
		b= Integer.parseInt(bf.readLine());
		
		System.out.println(a+b);
	}
} 