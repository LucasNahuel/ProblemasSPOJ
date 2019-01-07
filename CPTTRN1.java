import java.io.*;
 
 
public class Main{
	public static void main(String[]args) throws NumberFormatException, IOException{
		
	
	BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
	
	int a=Integer.parseInt(bf.readLine());
	
	for(int i=0; i<a; i++){
		boolean asterisco=true;
		
		String[] entrada= bf.readLine().split(" ");
		
		for(int j=0; j<Integer.parseInt(entrada[0]); j++){
			if(j%2==0){
				asterisco=true;
			}else{
				asterisco=false;
			}
			for(int x=0; x<Integer.parseInt(entrada[1]); x++){
				if(asterisco==true){
					System.out.print("*");
					asterisco=false;
				}else{
					System.out.print(".");
					asterisco=true;
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	}
} 