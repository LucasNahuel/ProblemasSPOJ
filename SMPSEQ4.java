import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(bf.readLine());
		
		String[] b=bf.readLine().split(" ");
	
		int c=Integer.parseInt(bf.readLine());
		
		String[] e=bf.readLine().split(" ");
		
		for(int i=0; i<a; i++){
			boolean repetido= false;
			for(int j=0; j<c; j++){
				if(Integer.parseInt(b[i])==Integer.parseInt(e[j])){
					repetido=true;
				}
			}
			if(repetido==true){
				System.out.print(b[i]+" ");
			}
		}
	}
 
}
 