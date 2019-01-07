SPOJ submission 15376816 (JAVA) plaintext list. Status: AC, problem STAMPS, contest SPOJ. By lucasmunioz (), 2015-10-15 17:30:52.
import java.io.*;
import java.util.Arrays;
public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(bf.readLine());
		
		int scenario=1;
		
		for(int i=0; i<a; i++){
			
			String[] ent1= bf.readLine().split(" ");
			
			int stamps= Integer.parseInt(ent1[0]);
			
			int friends=Integer.parseInt(ent1[1]);
			
			String[] ent2= bf.readLine().split(" ");
			
			int[] ent2a=new int[friends];
			
			for(int j=0; j<friends; j++){
				ent2a[j]=Integer.parseInt(ent2[j]);
			}
			
			Arrays.sort(ent2a);
			
			int borrow=0;
			
			for(int j=friends-1; j>=0; j--){
				stamps=stamps-ent2a[j];
				borrow++;
				if(stamps<=0) break;
			}
			
			System.out.println("Scenario #"+scenario+":");
			
			if(stamps<=0)System.out.println(borrow);
			else
				System.out.println("impossible");
			
			System.out.println();
			
			scenario++;
		}
		
	}
 
} 