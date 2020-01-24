import java.util.*;
public class ejer4b {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		if(a%4==0 && a%400==0) {
			System.out.println("es bisiesto");
		}
		else {
			System.out.println("no es bisiesto");
		}

	}

}
