import java.util.*;
public class ejer2b {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		System.out.println("ponga un numero");
		int b=objeto.nextInt();
		if(a>0 && b>0) {
			int c=a*b;
			System.out.println("el resultado es:"+ c);
		}
		else {
			if(a==0 || b==0) {
				System.out.println("el numero debe ser mayor o menor a cero");
			}
			else if(a<0 && b<0){
				int d=a+b;
				System.out.println("el resultado es:"+ d);
			}
			else {
				System.out.println("no se acepta numero de diferente signos");
			}
		}
	}

}
