import java.util.*;
public class ejer5b {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int m=objeto.nextInt();
		System.out.println("ponga un numero");
		int n=objeto.nextInt();
		System.out.println("ponga un numero");
		int q=objeto.nextInt();
        if(m%n==0 && m%q==0) {
        	System.out.println(m+"es multiplo de "+ n+"y "+q);
        }
	}

}
