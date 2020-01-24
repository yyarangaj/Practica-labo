import java.util.*;

public class ejer2a {

	public static void main(String[] args) {
		Scanner objeto = new Scanner(System.in);
		System.out.println("ponga un numero: ");
		double n= objeto.nextFloat();
		double resul;
		resul=Math.pow(n*(n+1)/2,2);
		System.out.println("el resultado es "+resul);

	}

}
