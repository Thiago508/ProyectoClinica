package model;

public class LugarAtencion {

    private String nombre;
    private Medico medico;

    public LugarAtencion() {

    }

    public LugarAtencion(String nombre, Medico medico) {
        this.nombre = nombre;
        this.medico = medico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
