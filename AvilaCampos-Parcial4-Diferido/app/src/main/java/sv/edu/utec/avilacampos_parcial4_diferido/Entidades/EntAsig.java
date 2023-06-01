package sv.edu.utec.avilacampos_parcial4_diferido.Entidades;

public class EntAsig {
    private int IdAsignatura;

    private String Nombre;
    private String Acronimo;
    private String Descripcion;
    private String Edificio;
    private String Clase;
    private String GrupoHorario;

    public int getIdAsignatura() {
        return IdAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        IdAsignatura = idAsignatura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAcronimo() {
        return Acronimo;
    }

    public void setAcronimo(String acronimo) {
        Acronimo = acronimo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEdificio() {
        return Edificio;
    }

    public void setEdificio(String edificio) {
        Edificio = edificio;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String clase) {
        Clase = clase;
    }

    public String getGrupoHorario() {
        return GrupoHorario;
    }

    public void setGrupoHorario(String grupoHorario) {
        GrupoHorario = grupoHorario;
    }
}
