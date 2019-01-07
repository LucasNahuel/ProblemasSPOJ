import java.io.*;
public class Main {
 
 public static void main(String[]args) throws NumberFormatException, IOException{
 
 BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
 
 
 BufferedWriter bw=new BufferedWriter (new OutputStreamWriter(System.out));
 StringBuilder sal= new StringBuilder();
 
 
 int a=Integer.parseInt(bf.readLine());
 
 for(int i=0; i<a; i++){
 
 
String[] ent = bf.readLine().split(" ");
 
 
 
 int n=Integer.parseInt(ent[0]);
 
 int m=Integer.parseInt(ent[1]);
 
 while(n<=m){
 
 if(primo(n)){
 sal.append(Integer.toString(n));
 sal.append('\n');
 }
 n++;
 
 }
 
 sal.append('\n');
 ent[0]="";
 ent[1]="";
 }
 bw.write(sal.toString());
 bw.close();
 } 
 
 
private static boolean primo (int a){
 
 if(a<2) return false;
 
 if(a==2) return true;
 
 boolean ban=true;
 
 int aux=2;
 
 int raiz=(int)Math.ceil(Math.sqrt(a));
 
 while(ban && aux<=raiz){
 
 if(a%aux==0){
 ban=false;
 }
 
 
 aux++;
 
 
 }
 
 return ban;
}
 
