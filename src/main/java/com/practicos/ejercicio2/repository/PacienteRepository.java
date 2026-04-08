package com.practicos.ejercicio2.repository;
import com.practicos.ejercicio2.model.Paciente;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PacienteRepository {
    private List<Paciente> pacientes = new ArrayList<>();

    public void guardar(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> obtenerTodos() {
        return pacientes;
    }
}