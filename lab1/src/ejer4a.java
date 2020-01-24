import java.util.*;
public class ejer4a {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("escribe el primer numero de la 1er cordenada: ");
		double a=objeto.nextInt();
		System.out.println("escribe el segundo numero de la 1er cordenada: ");
		double b=objeto.nextInt();
		System.out.println("escribe el primer numero de la 2do cordenada: ");
		double c=objeto.nextInt();
		System.out.println("escribe el segundo numero de la 2do cordenada: ");
		double d=objeto.nextInt();
		double r=Math.sqrt((Math.pow(a-c, 2))+(Math.pow(b-d, 2)));
		System.out.println("la distancia de las cordenadas es:  "+r);
	}

}
