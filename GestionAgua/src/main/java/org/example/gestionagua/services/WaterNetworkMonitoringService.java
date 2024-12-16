package org.example.gestionagua.services;


import org.springframework.stereotype.Service;

@Service
public class WaterNetworkMonitoringService {

    public String detectLeaks() {
        // Simulación de detección de fugas
        return "Fuga detectada en el sector 5. Reparación requerida.";
    }

    public String monitorPressure() {
        // Simulación de monitoreo de presión
        return "Presión en la tubería principal: 3.2 bares. Estable.";
    }
}
