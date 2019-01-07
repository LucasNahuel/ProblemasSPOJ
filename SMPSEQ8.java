import java.util.Scanner;
public class Main {
 
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		
		int a = sc.nextInt();
		
		int[] a1= new int[a];
		
		for(int i=0; i<a; i++){
			a1[i]=sc.nextInt();
		}
		
		int b=sc.nextInt();
		
		int[] b1= new int[b];
		
		for(int i=0; i<b; i++){
			b1[i]=sc.nextInt();
		}
		
		
		if(suma(a1, a)> suma (b1, b)){
			mostrar(a1, a);
		}else{
			mostrar(b1, b);
		}
	}
	
	static int suma(int[] cadena, int a){
		int aux=0;
		for(int i=0; i<a; i++){
			aux=aux+cadena[i];
		}
		return aux;
	}
	
	static void mostrar(int[] cadena, int a){
		for(int i=0; i<a; i++){
			System.out.print(cadena[i]+" ");
		}
		System.out.println();
	}
	
	
 
}