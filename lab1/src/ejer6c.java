import java.util.*;
public class ejer6c {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		int cont=0;
		int b;
		while(a>0) {
			b=a%10;
			a=a/10;
			
			if(b%2==0) {
				cont++;
			}
			
		}
		System.out.println("el numero tiene: "+cont+" pares");

	


	}

}
