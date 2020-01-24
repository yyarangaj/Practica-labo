import java.util.*;
public class ejer7c {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		int b=a;
		int r;
		int p=0;
		while(b>0) {
			r=b%10;
			b=b/10;
			p=p*10+r;
		}
		if(p==a) {
			System.out.println("es capicua");
		}
		else {
			System.out.println("no es capicua");
		}
	}

}
