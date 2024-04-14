import model.Cita;
import model.LugarAtencion;
import model.Medico;
import model.Paciente;
import utils.priorityQueue.PriorityQueue;

import java.util.List;

public class Clinica {

    private static Clinica instance;

    private String nombre;
    private PriorityQueue<Cita> citaPriorityQueue;
    private List<LugarAtencion> lugarAtencionList;
    private List<Paciente> pacienteList;
    private List<Medico> medicoList;

    private Clinica(String nombre, PriorityQueue<Cita> citaPriorityQueue, List<LugarAtencion> lugarAtencionList, List<Paciente> pacienteList, List<Medico> medicoList) {
        this.nombre = nombre;
        this.citaPriorityQueue = citaPriorityQueue;
        this.lugarAtencionList = lugarAtencionList;
        this.pacienteList = pacienteList;
        this.medicoList = medicoList;
    }

    public static synchronized Clinica getInstance(String nombre, PriorityQueue<Cita> citaPriorityQueue, List<LugarAtencion> lugarAtencionList, List<Paciente> pacienteList, List<Medico> medicoList) {
        if (instance == null) {
            instance = new Clinica(nombre, citaPriorityQueue, lugarAtencionList, pacienteList, medicoList);
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PriorityQueue<Cita> getCitaPriorityQueue() {
        return citaPriorityQueue;
    }

    public void setCitaPriorityQueue(PriorityQueue<Cita> citaPriorityQueue) {
        this.citaPriorityQueue = citaPriorityQueue;
    }

    public List<LugarAtencion> getLugarAtencionList() {
        return lugarAtencionList;
    }

    public void setLugarAtencionList(List<LugarAtencion> lugarAtencionList) {
        this.lugarAtencionList = lugarAtencionList;
    }

    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    public List<Medico> getMedicoList() {
        return medicoList;
    }

    public void setMedicoList(List<Medico> medicoList) {
        this.medicoList = medicoList;
    }
}
