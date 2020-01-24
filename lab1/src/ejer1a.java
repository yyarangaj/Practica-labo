import java.util.*;
import java.lang.*;
public class ejer1a {

	public static void main(String[] args) {
		Scanner objeto=new Scanner(System.in);
		System.out.println("pongan el radio del cilindro");
		double r=objeto.nextFloat();
		System.out.println("pongan la altura del cilindro");
		double h=objeto.nextFloat();
		
		
		double area_total=2*Math.PI*r*h+2*Math.PI*r*r;
		
	System.out.println("el area total del cilindro es:"+area_total);
		

	}

}
