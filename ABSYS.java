import java.io.*;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int a= Integer.parseInt(bf.readLine());
		
		for(int i=0; i<a; i++){
			bf.readLine();
			String[] ent=bf.readLine().split(" ");
			
			if(ent[0].contains("machula")){
				ent[0]=ecuacion(Integer.parseInt(ent[2]), Integer.parseInt(ent[4]));
			}else
				
			if(ent[2].contains("machula")){
				ent[2]=ecuacion(Integer.parseInt(ent[0]), Integer.parseInt(ent[4]));
			}else
					
			if(ent[4].contains("machula")){
				ent[4]=String.valueOf(Integer.parseInt(ent[0])+Integer.parseInt(ent[2]));
			}
			
			for(int j=0; j<5; j++){
				System.out.print(ent[j]+" ");
			}
			System.out.println();
			
			
			
		}
	}
	
	
	static String ecuacion(int a, int b){
		int res=b-a;
		return String.valueOf(res);
	}
	
 
} 