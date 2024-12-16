package org.example.gestionagua.services;


import org.springframework.stereotype.Service;

@Service
public class SmartIrrigationService {

    public String adjustIrrigation(double humidity, double temperature) {
        if (humidity < 30) {
            return "Activando riego debido a baja humedad: " + humidity + "%.";
        } else if (temperature > 35) {
            return "Activando riego por alta temperatura: " + temperature + "°C.";
        }
        return "Riego desactivado. Condiciones óptimas: humedad " + humidity + "%, temperatura " + temperature + "°C.";
    }

    public String scheduleIrrigation() {
        // Simulación de programación de riego
        return "Riego programado para las 06:00 y 18:00 horas.";
    }
}
