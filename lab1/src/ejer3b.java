import java.util.*;
public class ejer3b {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		double a=objeto.nextFloat();
		System.out.println("ponga un numero");
		double b=objeto.nextFloat();
		System.out.println("ponga un numero");
		double c=objeto.nextFloat();
          double resultado=(a+b+c)/3;
          System.out.println("el valor intermedio es:"+ resultado);
	}

}
