import java.util.*;
public class ejer10c {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		int n[]=new int[a];
		int suma=0;
		int cont=0;
		for(int i=0;i<a;i++) {
			if(i<=0) {
				n[i]=1;
			}
			else {
				n[i]=n[i-1]+1;
			}
		}
		for(int i=0;i<a;i++) {
			if(n[i]%2!=0) {
				suma+=n[i];
			}
			
		}
		for(int i=0;i<a;i++) {
			if(n[i]==suma) {
				cont++;
			}
		}
		System.out.println("hay "+cont+" que tiene la suma de impares");

	}

}
