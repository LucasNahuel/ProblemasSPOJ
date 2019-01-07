import java.util.Scanner;
public class Main {
 
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		
		int[] a1= new int[a];
		
		for(int i=0;i<a ; i++){
			a1[i]=sc.nextInt();
		}
		
		int b=sc.nextInt();
		
		int[] b1= new int[b];
		
		for(int i=0;i<b ; i++){
			b1[i]=sc.nextInt();
		}
		
		if(promedio(a1, a)>promedio(b1, b)){
			mostrar(a1, a);
		}else{
			mostrar(b1, b);
		}
		
	}
	
	static float promedio(int[] cadena, int aux){
		float aux2=0;
		for(int i=0; i<aux; i++){
			aux2=aux2+cadena[i];
		}
		return aux2/aux;
	}
	
	static void mostrar(int[] cadena, int aux){
		for(int i=0; i<aux; i++){
			System.out.print(cadena[i]+" ");
		}
	}
 
} 