package model;

import java.time.LocalDateTime;

public class Cita {

    private Paciente paciente;
    private Medico medico;
    private LocalDateTime fechaCita;
    private LugarAtencion lugarAtencion;
    private Estado estado;

    public Cita() {
    }

    public Cita(Paciente paciente, Medico medico, LocalDateTime fechaCita, LugarAtencion lugarAtencion, Estado estado) {
        this.paciente = paciente;
        this.medico = medico;
        this.fechaCita = fechaCita;
        this.lugarAtencion = lugarAtencion;
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }

    public LugarAtencion getLugarAtencion(){
        return lugarAtencion;
    }

    public void setLugarAtencion(LugarAtencion lugarAtencion){
        this.lugarAtencion = lugarAtencion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String toString() {
        return paciente.getNombre() + " - " + medico.getNombre() + " - " + fechaCita.toString() + " - " + lugarAtencion.getNombre() + " - " + estado.toString();
    }
}
