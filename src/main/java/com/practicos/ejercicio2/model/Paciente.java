package com.practicos.ejercicio2.model;

import lombok.*;
import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    private Integer id;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento; 
}