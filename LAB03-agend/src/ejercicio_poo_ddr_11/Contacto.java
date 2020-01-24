package ejercicio_poo_ddr_11;

public class Contacto {
	
    private int telefono;

    public Contacto( int telefono) {
        
        this.telefono = telefono;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    
    @Override
    public String toString() {
        return " telefono=" + telefono;
    }
    
}
