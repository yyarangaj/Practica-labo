import java.util.*;
public class ejer3c {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		int n[]=new int[a];
		int cont=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				cont++;
			}
		}
		if(cont>1) {
			System.out.println("es primo");
		}
		else {
			System.out.println("no es primo");
		}
		

	}

}
