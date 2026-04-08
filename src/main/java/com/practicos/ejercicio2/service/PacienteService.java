package com.practicos.ejercicio2.service;
import com.practicos.ejercicio2.model.Paciente;
import com.practicos.ejercicio2.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {
    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public void registrar(Paciente p) {
        // ver validacion dni
        repository.guardar(p);
    }

    public List<Paciente> listarTodos() {
        return repository.obtenerTodos();
    }

    // Filtro de Menores de Edad []
    public List<Paciente> listarMenores() {
        List<Paciente> menores = new ArrayList<>();
        LocalDate hoy = LocalDate.now(); // la fecha de hoy

        for (Paciente p : repository.obtenerTodos()) {
            //  la edad en años 
            // solo los años 
            int edad = Period.between(p.getFechaNacimiento(), hoy).getYears();
            
            // si es 17 o menos lo agrega a la lista
            if (edad < 18) {
                menores.add(p);
            }
        }
        return menores;
    }
}