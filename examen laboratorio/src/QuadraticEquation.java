import java.util.*;
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("digite los coeficientes de la ecuacion ");
		Double j=o.nextDouble();
		Double k=o.nextDouble();
		Double l=o.nextDouble();
		QuadraticEquation1 obj=new QuadraticEquation1(j,k,l);
		if(obj.getDiscriminant()>0) {
			System.out.println("la primera raiz es: "+obj.getRoot1());
			System.out.println("la segunda raiz es: "+obj.getRoot2());
			
		}
		else if(obj.getDiscriminant()==0) {
			System.out.println("la primera raiz es: "+obj.getRoot1());
			System.out.println("la segunda raiz es: "+obj.getRoot2());
		}
		else {
			System.out.println("No hay raiz porque el discriminante es menor a 0");
		}
		
		
	
	
		
			
		}

}

