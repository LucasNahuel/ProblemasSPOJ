import java.io.*;
 
public class Main {
 public static void main(String[] args) throws IOException{
 BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
 
 String[] ent=bf.readLine().split(" ");
 
 while(Integer.parseInt(ent[0])!=0 || Integer.parseInt(ent[1])!=0 || Integer.parseInt(ent[2])!=0){
 
 if(Integer.parseInt(ent[1])-Integer.parseInt(ent[0])==Integer.parseInt(ent[2])-Integer.parseInt(ent[1]) && Integer.parseInt(ent[0])!= Integer.parseInt(ent[2])){
 int aux=(Integer.parseInt(ent[1])-Integer.parseInt(ent[0]))+Integer.parseInt(ent[2]);
 System.out.println("AP " +aux );
 }else{
 System.out.println("GP " + Integer.parseInt(ent[2])*multiplo(ent));
 }
 
 ent=bf.readLine().split(" ");
 }
 
 
 
 
 }
 
 
 public static int multiplo(String[] cadena){
 int i;
 for(i=-1000 ; i<1000; i++){
 if(Integer.parseInt(cadena[0])*i==Integer.parseInt(cadena[1]) && Integer.parseInt(cadena[1])*i==Integer.parseInt(cadena[2])){
 break;
 }
 }
 return i;
 }
} 