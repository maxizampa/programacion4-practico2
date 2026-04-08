package com.practicos.ejercicio2.controller;
import com.practicos.ejercicio2.model.Paciente;
import com.practicos.ejercicio2.service.PacienteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @PostMapping // POST/pacientes [7,17]
    public void crear(@RequestBody Paciente p) {
        service.registrar(p);
    }

    @GetMapping // GET/pacientes [9,18]
    public List<Paciente> listar() {
        return service.listarTodos();
    }

    @GetMapping("/menores") // GET /pacientes/menores [10, 19]
    public List<Paciente> listarMenores() {
        return service.listarMenores();
    }
}