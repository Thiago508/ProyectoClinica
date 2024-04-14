package model;

public class Paciente {

    private String identificacion;
    private String nombre;
    private String telefono;
    private GrupoPoblacional grupoPoblacional;

    public Paciente() {

    }

    public Paciente(String identificacion, String nombre, String telefono, GrupoPoblacional grupoPoblacional) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.grupoPoblacional = grupoPoblacional;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public GrupoPoblacional getGrupoPoblacional(){
        return grupoPoblacional;
    }

    public void setGrupoPoblacional(GrupoPoblacional grupoPoblacional){
        this.grupoPoblacional = grupoPoblacional;
    }
}
