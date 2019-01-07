import java.io.*;
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		String[] ent=bf.readLine().split(" ");
		
		long temporadas=Integer.parseInt(ent[0]);
		
		long minutos=Integer.parseInt(ent[1]);
		
		while (temporadas!=-1 && minutos!=-1){
			String[] caps=bf.readLine().split(" ");
			
			long totalMin=0;
			
			int i=0;
			
			while(temporadas>0){
				
				totalMin=totalMin+(Long.parseLong(caps[i])*temporadas*minutos);
				temporadas--;
				i++;
			}
			
			System.out.println(totalMin);
			
			ent=bf.readLine().split(" ");
			
			temporadas=Integer.parseInt(ent[0]);
			
			minutos=Integer.parseInt(ent[1]);
		}
	}
 
}