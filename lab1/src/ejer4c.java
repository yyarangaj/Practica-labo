import java.util.*;
public class ejer4c {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		int n[]=new int[a];
		int cont=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				cont+=i;
			}
		}
	if(a==cont) {
		System.out.println("el numero es perfecto");
		
	}
	else {
		System.out.println("no es un numero perfecto");
	}
	}
	

}
