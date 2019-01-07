import java.io.*;
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(bf.readLine());
		
		for(int i=0; i<a;i++){
			String[] ent= bf.readLine().split(" ");
			
			int b=Integer.parseInt(ent[0]);
			int c=Integer.parseInt(ent[1]);
			
			
			for(int j=0; j<b; j++){
				for(int k=0; k<c; k++){
					if(j==0 || j==b-1 || k==0 || k==c-1){
						System.out.print("*");
					}else{
						System.out.print(".");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
 
	}
 
}
 