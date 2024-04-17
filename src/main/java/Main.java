import model.*;
import view.LlamadoPaciente;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args){


        Clinica clinica = Clinica.getInstance("JHST");
        initValues(clinica);
        LlamadoPaciente llamadoPaciente = new LlamadoPaciente(clinica);
        llamadoPaciente.show();

    }

    public static void initValues(Clinica clinica){

        GrupoPoblacional ninguno = new GrupoPoblacional("Ninguno", Prioridad.BAJA);
        GrupoPoblacional embarazada = new GrupoPoblacional("Embarazada", Prioridad.ALTA);
        GrupoPoblacional discapacitado = new GrupoPoblacional("Discapacitado", Prioridad.ALTA);
        GrupoPoblacional adultoMayor = new GrupoPoblacional("Adulto Mayor", Prioridad.ALTA);

        clinica.addGrupoPoblacional(ninguno);
        clinica.addGrupoPoblacional(embarazada);
        clinica.addGrupoPoblacional(discapacitado);
        clinica.addGrupoPoblacional(adultoMayor);

        Paciente paciente = new Paciente("987654321","Santiago","987654321",ninguno);
        Paciente paciente1 = new Paciente("123456789","Jose Alejandro","123456789",ninguno);
        Paciente paciente2 = new Paciente("123546","Pepito","123456",adultoMayor);
        Paciente paciente3 = new Paciente("654321","Monica","654321",embarazada);
        Paciente paciente4 = new Paciente("987654","Nestor","987654",ninguno);

        clinica.addPaciente(paciente);
        clinica.addPaciente(paciente1);
        clinica.addPaciente(paciente2);
        clinica.addPaciente(paciente3);
        clinica.addPaciente(paciente4);

        Medico medico = new Medico("456789","Dr. Miguel Torres","45679");

        clinica.addMedico(medico);

        LugarAtencion lugarAtencion = new LugarAtencion("Consultorio 101");

        clinica.addLugarAtencion(lugarAtencion);

        Cita cita = new Cita(paciente,medico, LocalDateTime.of(2024,6,16, 0, 0),lugarAtencion,Estado.ACTIVO);
        Cita cita1 = new Cita(paciente1,medico, LocalDateTime.of(2024,6,16, 0, 0),lugarAtencion,Estado.ACTIVO);
        Cita cita2 = new Cita(paciente2,medico, LocalDateTime.of(2024,6,16, 0, 0),lugarAtencion,Estado.ACTIVO);
        Cita cita3 = new Cita(paciente3,medico, LocalDateTime.of(2024,6,16, 0, 0),lugarAtencion,Estado.ACTIVO);
        Cita cita4 = new Cita(paciente4,medico, LocalDateTime.of(2024,6,16, 0, 0),lugarAtencion,Estado.ACTIVO);

        clinica.addCita(cita);
        System.out.println(clinica.getCita().toString());
        clinica.addCita(cita1);
        System.out.println(clinica.getCita().toString());
        clinica.addCita(cita2);
        System.out.println(clinica.getCita().toString());
        clinica.addCita(cita3);
        System.out.println(clinica.getCita().toString());
        clinica.addCita(cita4);
        System.out.println(clinica.getCita().toString());

    }
}
