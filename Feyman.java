import java.io.*;
public class Main {
	public static void main(String [] args) throws NumberFormatException, IOException{
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(bf.readLine());
		
		while(t!=0){
			
			int aux=0;
			
			for(int i=t; i>0; i--){
				aux= aux+(int)Math.pow(i, 2);
			}
			System.out.println(aux);
			
			t=Integer.parseInt(bf.readLine());
		}
	}
}