import java.util.*;
import java.lang.*;
 
class Main
{
 public static void main (String[] args) throws java.lang.Exception
 {
 Scanner sc= new Scanner(System.in);
 
 int a= sc.nextInt();
 int b= sc.nextInt();
 int suma=0; int aux=a;
 for(int i=a;i<=b;i++)
 {
 suma+=aux*aux;
 aux++;
 }
 System.out.println(suma);
 }
}