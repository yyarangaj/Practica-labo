package ejercicio_poo_ddr_11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio_poo_ddr_11 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion; 

        Agenda agendaTelefonica = new Agenda(3);
        
        int telefono;

        Contacto c;

        while (!salir) {

            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Escribe un telefono");
                        telefono = sn.nextInt();

                        
                        c = new Contacto(telefono);

                        agendaTelefonica.aniadirContacto(c);

                        break;
                    case 2:

                        agendaTelefonica.listarContactos();

                        break;
                   
                    
                    case 3:

                      
                        System.out.println("Escribe un contacto");
                        telefono = sn.nextInt();

                        
                        c = new Contacto(telefono);

                        agendaTelefonica.eliminarContacto(c);
                        

                        break;
                    
                   
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }

        }

	}

}
