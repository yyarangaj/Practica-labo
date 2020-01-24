import java.util.*;
public class ejer6a {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga dia y mes de nacimiento: ");
		int a=objeto.nextInt();
		System.out.println("ponga su edad: ");
		int b=objeto.nextInt();
		int resultado;
		resultado=(a*2+5)*50+b+365-615;
		System.out.println("el resultado es: "+ resultado);

	}

}
