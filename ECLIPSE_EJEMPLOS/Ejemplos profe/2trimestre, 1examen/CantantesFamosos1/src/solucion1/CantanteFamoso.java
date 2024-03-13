package solucion1;
public class CantanteFamoso {

    private String nombre;
    private String discoMasVendido;

    public CantanteFamoso() {
        nombre = "";
        discoMasVendido = "";
    }

    public CantanteFamoso(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
    }

    public String getDiscoConMasVentas() {
        return discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setDiscoConMasVentas(String disco) {
        discoMasVendido = disco;
    }

    public void setNombre(String _nombre) {
        nombre = _nombre;
    }
    
    public String toString()
    {
    	return "Nombre: " + nombre   + "\n" + "Disco: " + discoMasVendido + "\n";
    }
}