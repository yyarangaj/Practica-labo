import java.util.*;
public class ejer1c {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("ponga un numero");
		int a=objeto.nextInt();
		System.out.println("ponga un numero");
		int b=objeto.nextInt();
		
		int []n=new int [100];
		int []n1=new int[100];
		int j=0;
		for(int i=1;i<100;i++) {
			
			if(i<=a&&i<=b) {
				
					if(a%i==0 &&b%i==0) {
					
						n1[j]=i;
						j++;
					}
					
				
				
			}
			
			
		}
		System.out.println("los divisores son: ");
		for(int p=0;p<j;p++) {
			System.out.println(n1[p]+",");
		}
		

	}

}
