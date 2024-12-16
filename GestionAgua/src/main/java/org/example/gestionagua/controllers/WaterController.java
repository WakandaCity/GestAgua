package org.example.gestionagua.controllers;


import org.example.gestionagua.services.SmartIrrigationService;
import org.example.gestionagua.services.WaterNetworkMonitoringService;
import org.example.gestionagua.services.WaterTreatmentPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaterController {

    @Autowired
    private WaterNetworkMonitoringService waterNetworkMonitoringService;

    @Autowired
    private SmartIrrigationService smartIrrigationService;

    @Autowired
    private WaterTreatmentPlantService waterTreatmentPlantService;

    // Endpoints para Monitoreo de Redes de Agua
    @GetMapping("/detect-leaks")
    public String detectLeaks() {
        return waterNetworkMonitoringService.detectLeaks();
    }

    @GetMapping("/monitor-pressure")
    public String monitorPressure() {
        return waterNetworkMonitoringService.monitorPressure();
    }

    // Endpoints para Sistemas de Riego Inteligente
    @GetMapping("/adjust-irrigation")
    public String adjustIrrigation(@RequestParam double humidity, @RequestParam double temperature) {
        return smartIrrigationService.adjustIrrigation(humidity, temperature);
    }

    @GetMapping("/schedule-irrigation")
    public String scheduleIrrigation() {
        return smartIrrigationService.scheduleIrrigation();
    }

    // Endpoints para Plantas de Tratamiento de Agua
    @GetMapping("/purify-water")
    public String purifyWater() {
        return waterTreatmentPlantService.purifyWater();
    }

    @GetMapping("/treat-wastewater")
    public String treatWasteWater() {
        return waterTreatmentPlantService.treatWasteWater();
    }
}
