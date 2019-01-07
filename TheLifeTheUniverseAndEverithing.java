import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int ent=sc.nextInt();
		
		while(ent!=42){
			
			System.out.println(ent);
			
			ent=sc.nextInt();
			
		}
	
	}
 
}