import java.io.*;
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(bf.readLine());
		
		for(int i=0; i<a; i++){
			String[] ent=bf.readLine().split(" ");
			
			StringBuilder sum1=new StringBuilder(ent[0]);
			
			StringBuilder sum2=new StringBuilder(ent[1]);
			
			sum1.reverse();sum2.reverse();
			
			ent[0]=quitaCeros(sum1);
			ent[1]=quitaCeros(sum2);
			
			int aux=Integer.parseInt(ent[0])+Integer.parseInt(ent[1]);
			
			StringBuilder res= new StringBuilder(String.valueOf(aux));
			
			res.reverse();
			
			int[] caca=new int[3];
			
			
			quitaCeros(res);
			
			System.out.println(res);
		}
		
		
	}
	
	static String quitaCeros(StringBuilder cadena){
		int i=0;
		while(cadena.charAt(i)=='0'){
			cadena.deleteCharAt(i);
		}
		String aux=new String(cadena.substring(0, cadena.length()));
		return aux;
	}
			
}