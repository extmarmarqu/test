package com.example.EjemploClase7.Services;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraServices {

    public static int calcularEdad(Integer day, Integer month, Integer year) {

        LocalDate date = LocalDate.of(year, month, day);
        Period periodo = Period.between(date,LocalDate.now());
        return periodo.getYears();
    }
}
