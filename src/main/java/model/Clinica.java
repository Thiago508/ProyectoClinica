package model;

import utils.priorityQueue.CitaPriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Clinica {

    private static Clinica instance;

    private String nombre;
    private CitaPriorityQueue citaPriorityQueue;
    private List<LugarAtencion> lugarAtencionList;
    private List<Paciente> pacienteList;
    private List<Medico> medicoList;
    private List<GrupoPoblacional> grupoPoblacionalList;

    private Clinica(String nombre) {
        this.nombre = nombre;
        this.citaPriorityQueue = new CitaPriorityQueue();
        this.lugarAtencionList = new ArrayList<>();
        this.pacienteList = new ArrayList<>();
        this.medicoList = new ArrayList<>();
        this.grupoPoblacionalList = new ArrayList<>();
    }

    public static synchronized Clinica getInstance(String nombre) {
        if (instance == null) {
            instance = new Clinica(nombre);
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // CRUD Medico

    public void addMedico(Medico medico){
        medicoList.add(medico);
    }

    public Medico getMedico(String identificacion){
        Optional<Medico> optionalMedico = medicoList
                .stream()
                .filter(medico -> medico.getIdentificacion().equals(identificacion))
                .findFirst();

        return optionalMedico.orElse(null);
    }

    public List<Medico> getAllMedicos(){
        return new ArrayList<>(medicoList);
    }

    public void removeMedico(Medico medico){
        medicoList.remove(medico);
    }
    public void updateMedico(Medico medico, Medico updateMedico){
        medicoList.set(medicoList.indexOf(medico), updateMedico);
    }

    // CRUD Paciente

    public void addPaciente(Paciente paciente){
        pacienteList.add(paciente);
    }

    public Paciente getPaciente(String identificacion){
        Optional<Paciente> optionalPaciente = pacienteList
                .stream()
                .filter(paciente -> paciente.getIdentificacion().equals(identificacion))
                .findFirst();

        return optionalPaciente.orElse(null);
    }

    public List<Paciente> getAllPacientes(){
        return new ArrayList<>(pacienteList);
    }

    public void removePaciente(Paciente paciente){
        pacienteList.remove(paciente);
    }
    public void updatePaciente(Paciente paciente, Paciente updatePaciente){
        pacienteList.set(pacienteList.indexOf(paciente), updatePaciente);
    }

    // CRUD Lugar atencion

    public void addLugarAtencion(LugarAtencion lugarAtencion){
        lugarAtencionList.add(lugarAtencion);
    }

    public LugarAtencion getLugarAtencion(String nombre){
        Optional<LugarAtencion> optionalLugarAtencion = lugarAtencionList
                .stream()
                .filter(lugarAtencion -> lugarAtencion.getNombre().equals(nombre))
                .findFirst();

        return optionalLugarAtencion.orElse(null);
    }

    public List<LugarAtencion> getAllLugaresAtencion(){
        return new ArrayList<>(lugarAtencionList);
    }

    public void removeLugarAtencion(LugarAtencion lugarAtencion){
        lugarAtencionList.remove(lugarAtencion);
    }
    public void updateLugarAtencion(LugarAtencion lugarAtencion, LugarAtencion updateLugarAtencion){
        lugarAtencionList.set(lugarAtencionList.indexOf(lugarAtencion), updateLugarAtencion);
    }

    // CRUD Grupo poblacional

    public void addGrupoPoblacional(GrupoPoblacional grupoPoblacional){
        grupoPoblacionalList.add(grupoPoblacional);
    }

    public GrupoPoblacional getGrupoPoblacional(String nombre){
        Optional<GrupoPoblacional> optionalGrupoPoblacional = grupoPoblacionalList
                .stream()
                .filter(grupoPoblacional -> grupoPoblacional.getNombre().equals(nombre))
                .findFirst();

        return optionalGrupoPoblacional.orElse(null);
    }

    public List<GrupoPoblacional> getAllGruposPoblacionales(){
        return new ArrayList<>(grupoPoblacionalList);
    }

    public void removeGrupoPoblacional(GrupoPoblacional grupoPoblacional){
        grupoPoblacionalList.remove(grupoPoblacional);
    }
    public void updateGrupoPoblacional(GrupoPoblacional grupoPoblacional, GrupoPoblacional updateGrupoPoblacional){
        grupoPoblacionalList.set(grupoPoblacionalList.indexOf(grupoPoblacional), updateGrupoPoblacional);
    }

    // CRUD Cita

    public void addCita(Cita cita){
        citaPriorityQueue.enqueue(cita);
    }

    public Cita getCita(){
        return citaPriorityQueue.front();
    }

    public Cita attendCita(){
        return citaPriorityQueue.unqueue();
    }

}
