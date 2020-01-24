import java.util.*;
public class ejer2c {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		int []n=new int[100];
		
		for(int i=2;i<100;i++) {
			while(a%i==0&&i<=a) {
				a=a/i;
				System.out.println("factores del numero "+i);
			}
		}
		
		
	}

}
