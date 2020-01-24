package ejercicio_poo_ddr_11;

public class Agenda {
	private Contacto[] contactos;

    
    public Agenda() {
        this.contactos = new Contacto[10];
    }

    public Agenda(int tamanio) {
        this.contactos = new Contacto[tamanio]; 
    }

    public void aniadirContacto(Contacto c) {

       

            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) { 
                    contactos[i] = c; 
                    encontrado = true; 
                }
            }

            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
        

    }

    
    
    public void listarContactos() {

         for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) { 
                    System.out.println(contactos[i]);
                }
            }
        

    }

    
   public void eliminarContacto(Contacto c) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i]==c) {
                 
                while(i<contactos.length) {
					contactos[i]=contactos[i+1];
					i++;
				}
				
             
            }
            encontrado = true; 
        }
      
        
        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
        } else {
            System.out.println("No se ha eliminado el contacto");

        }

    }



}
