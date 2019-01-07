import java.io.*;
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(bf.readLine());
		
		for(int i=0; i<a; i++){
			String[] ent= bf.readLine().split(" ");
			
			int b=Integer.parseInt(ent[0]);
			int c=Integer.parseInt(ent[1]);
			
			if(b==1){
				b=b*4;
			}else{
				b=b*3+1;
			}
			
			if(c==1){
				c=c*4;
			}else{
				c=c*3+1;
			}
			
			
		
					for(int l=0; l<b;l++){
						for(int m=0; m<c; m++){
							if(m%3==0 || l%3==0){
								System.out.print("*");
							}else {
								System.out.print(".");
							}
						}
						System.out.println();
					}
					System.out.println();
					
				
			}
		}
	}
 
 