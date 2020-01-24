import java.util.*;
public class ejer6b {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		System.out.println("ponga un numero");
		int b=objeto.nextInt();
		System.out.println("ponga un numero");
		int c=objeto.nextInt();
		if(a>0&&b>0&&c>0) {
			if((c>(a-b) && c<(a+b))||(a>(b-c) && a<(b+c))||(b>(a-c) && b<(a+c))) {
				if(a==b&&b==c) {
					System.out.println("el triangulo es equilatero");
				}
				else if(a==b||b==c||a==c) {
					System.out.println("el triangulo es isoceles");
				}
				else {
					System.out.println("el triangulo es escaleno");
				}
			}
			
		}
		else {
			System.out.println("no se puede formar un triangulo");
		}
		
	}

}
