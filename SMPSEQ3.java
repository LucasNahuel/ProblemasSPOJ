import java.io.*;
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(bf.readLine());
		
		String[] b=bf.readLine().split(" ");
		
		int e=Integer.parseInt(bf.readLine());
		
		String[] c=bf.readLine().split(" ");
		
		
		for(int i=0; i<a; i++){
			
			boolean repetido=false;
			
			for(int j=0; j<e; j++){
				if(Integer.parseInt(b[i])==Integer.parseInt(c[j])){
					repetido=true;
				}
			}
			if (repetido==false){
				System.out.print(b[i]+" ");
			}
		}
	}
	
 
}
 