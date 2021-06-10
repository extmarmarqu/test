package com.example.EjemploClase7.Controllers;

import com.example.EjemploClase7.Services.CalculadoraServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CalcEdadesController {

    @GetMapping("/calcular/{day}/{month}/{year}")
    public int obtenerEdad(@PathVariable int day,@PathVariable int month,@PathVariable int year){

        return CalculadoraServices.calcularEdad(day,month,year);
    }


}
