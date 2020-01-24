import java.util.*;
public class ejer9c {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		int r;
		int suma=0;
		while(a>0) {
			r=a%10;
			a=a/10;
			suma+=r;
		}
		System.out.println("la suma de las cifra es: "+suma);
	}

}
