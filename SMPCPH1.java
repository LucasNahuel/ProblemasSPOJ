import java.io.*;
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(bf.readLine());
		
		StringBuilder dos=new StringBuilder(bf.readLine());
		
		int b=Integer.parseInt(bf.readLine());
		
		for(int k=0; k<b; k++){
			StringBuilder aux=new StringBuilder(bf.readLine());
			
			StringBuilder uno=aux;
			
			for(int i=0; i<uno.length(); i++){
				for(int j=0; j<dos.length(); j++){
					if(uno.charAt(i)==dos.charAt(j) && j<dos.length()-1){
						uno.setCharAt(i, dos.charAt(j+1));
						break;
					}else{
						if(uno.charAt(i)==dos.charAt(j)){
							uno.setCharAt(i, dos.charAt(0));
							break;
						}
					}
				}
			}
			
			System.out.println(uno);
			
		}
	
	}
 
}