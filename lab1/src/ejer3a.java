import java.util.*;
public class ejer3a {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ingrese un valor: ");
		int a=objeto.nextInt();
		System.out.println("ingrese un valor: ");
		int b=objeto.nextInt();
		int aux;
		aux=a;
		a=b;
		b=aux;
		System.out.println("el nuevo valor del primero es: "+ a);
		System.out.println("el nuevo valor del segundo es: "+ b);
		

	}

}
