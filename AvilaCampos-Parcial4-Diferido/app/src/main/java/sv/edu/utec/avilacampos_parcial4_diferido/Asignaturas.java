package sv.edu.utec.avilacampos_parcial4_diferido;

public class Asignaturas {
    private String nombreAsig, acronAsig;

    public Asignaturas(String nombreAsig, String acronAsig){
        this.nombreAsig = nombreAsig;
        this.acronAsig = acronAsig;
    }

    public String getNombreAsig() { return nombreAsig; }

    public String getAcronAsig() { return acronAsig; }
}
