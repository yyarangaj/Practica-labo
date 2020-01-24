import java.util.*;
public class ejer8c {

	public static void main(String[] args) {
		/*Ingresado el numero de terminos de la serie,
		   mostrar la suma de la serie. 1, 2, 2, 4, 3, 6, 4, 8, 5, 10, ...*/
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		int m[]=new int[a];
		int suma=0;
		for(int i=0;i<a;i+=2) {
			if(i<=0) {
				m[i]=1;
			}
			else {
				m[i]=m[i-2]+1;
			}
				
			}
		for(int j=1;j<a;j+=2) {
			if(j<=1) {
				m[j]=2;
			}
			else {
				m[j]=m[j-2]+2;
			}
				
			}
		for(int i=0;i<a;i++) {
			suma+=m[i];
		}
		System.out.println("la suma es: "+suma);

	}

}
