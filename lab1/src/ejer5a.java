import java.util.*;
public class ejer5a {

	public static void main(String[] args) {
		 Scanner objeto=new Scanner(System.in);
		 System.out.println("ponga un numero: ");
		 double a=objeto.nextFloat();
		 double b=a*180;
		 int c=(int)b;
		 double d=b-c;
		 double e=d*60;
		 int f=(int)e;
		 double g=e-f;
		 double h=g*60;
		 System.out.println("el numero convertido en sexagesimales es: "+ c+"°"+f+"'"+h+"''");

	}

}
