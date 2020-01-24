import java.util.*;
public class ejer5c {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		int cont=1;
		while(a>=10) {
			
			a=a/10;
			cont++;
		}
		System.out.println("el numero tiene: "+cont+" digitos");

	}

}
