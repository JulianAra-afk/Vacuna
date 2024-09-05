package com.rancho_smart.domain.vacunacion.vacunacion.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.domain.vacunacion.vacunacion.Entity.Vacuna;
import com.rancho_smart.domain.vacunacion.vacunacion.Repository.VacunasRepository;

@Service
public class VacunaService {

    @Autowired
    private VacunasRepository vacunaRepository;

    public List<Vacuna> getAllVacunas() {
        return vacunaRepository.findAll();
    }

    public Optional<Vacuna> getVacunaById(Long id) {
        return vacunaRepository.findById(id);
    }

    public Vacuna createVacuna(Vacuna vacuna) {
        return vacunaRepository.save(vacuna);
    }

    public Optional<Vacuna> updateVacuna(Long id, Vacuna vacunaDetails) {
        return vacunaRepository.findById(id)
                .map(vacuna -> {
                    vacuna.setHistorialMedicoId(vacunaDetails.getHistorialMedicoId());
                    vacuna.setNombre(vacunaDetails.getNombre());
                    vacuna.setCantidadDosis(vacunaDetails.getCantidadDosis());
                    vacuna.setVacunacionCompletada(vacunaDetails.isVacunacionCompletada());
                    vacuna.setFechaAdministracion(vacunaDetails.getFechaAdministracion());
                    vacuna.setFechaProximaDosis(vacunaDetails.getFechaProximaDosis());
                    return vacunaRepository.save(vacuna);
                });
    }

    public boolean deleteVacuna(Long id) {
        return vacunaRepository.findById(id)
                .map(vacuna -> {
                    vacunaRepository.delete(vacuna);
                    return true;
                })
                .orElse(false);
    }
}