import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(bf.readLine());
		
		for(int i=0; i<a; i++){
			String[] ent=bf.readLine().split(" ");
			
			int b=Integer.parseInt(ent[0]);
			int c=Integer.parseInt(ent[1]);
			int d=Integer.parseInt(ent[2]);
			
			for(int j=0; j<b; j++){
				if(j%c==0){
					if(j%d!=0){
						System.out.print(j+" ");
					}
				}
			}
			
			System.out.println();
			
		}
 
	}
 
}