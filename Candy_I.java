import java.io.*;
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int pockets=Integer.parseInt(bf.readLine());
		
		while(pockets!=-1){
			int[] bolsas= new int[pockets];
			for(int i=0; i<pockets; i++){
				bolsas[i]=Integer.parseInt(bf.readLine());
			}
			
			float promedio=promedio(bolsas);
			
			if(promedio%pockets==0.00){
				int movimientos=0;
				for(int i=0; i<pockets;i++){
					while(bolsas[i]<promedio/pockets){
						bolsas[i]=bolsas[i]+1;
						movimientos++;
					}
				}
				
				System.out.println(movimientos);
			}else
				System.out.println(-1);
			
			
			pockets=Integer.parseInt(bf.readLine());
		}
	}
	
	public static float promedio(int[] bolsas){
		float promedio=0;
		for(int i=0; i<bolsas.length; i++){
			promedio=promedio+bolsas[i];
		}
		return promedio;
	}
 
} 