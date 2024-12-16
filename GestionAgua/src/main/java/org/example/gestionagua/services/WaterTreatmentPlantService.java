package org.example.gestionagua.services;


import org.springframework.stereotype.Service;

@Service
public class WaterTreatmentPlantService {

    public String purifyWater() {
        // Simulación de purificación de agua
        return "Proceso de purificación de agua completado. Calidad: Óptima.";
    }

    public String treatWasteWater() {
        // Simulación de tratamiento de aguas residuales
        return "Tratamiento de aguas residuales completado. Efluentes cumplen con las normativas.";
    }
}
