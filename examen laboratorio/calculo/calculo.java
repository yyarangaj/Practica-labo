package calculo;
import java.util.*;
public class calculo {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("ponga los coeficiente de la primera ecuacion lineal");
		calculo2 obj=new calculo2(o.nextDouble(),o.nextDouble(),o.nextDouble(),o.nextDouble(),o.nextDouble(),o.nextDouble());
		if(obj.devuelboolean()) {
			System.out.println("el valor de x es:"+obj.getx());
			System.out.println("el valor de y es:"+obj.gety());
		}
		else {
			System.out.println("No hay solucion");
		}

	}

}
