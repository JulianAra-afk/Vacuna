package com.rancho_smart.domain.vacunacion.vacunacion.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vacunas")
public class Vacuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "historial_medico_id", nullable = false)
    private Long historialMedicoId;

    @Column(nullable = false)
    private String nombre;

    @Column(name = "cantidad_dosis", nullable = false)
    private int cantidadDosis;

    @Column(name = "vacunacion_completada", nullable = false)
    private boolean vacunacionCompletada;

    @Column(name = "fecha_administracion")
    private LocalDate fechaAdministracion;

    @Column(name = "fecha_proxima_dosis")
    private LocalDate fechaProximaDosis;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHistorialMedicoId() {
        return historialMedicoId;
    }

    public void setHistorialMedicoId(Long historialMedicoId) {
        this.historialMedicoId = historialMedicoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDosis() {
        return cantidadDosis;
    }

    public void setCantidadDosis(int cantidadDosis) {
        this.cantidadDosis = cantidadDosis;
    }

    public boolean isVacunacionCompletada() {
        return vacunacionCompletada;
    }

    public void setVacunacionCompletada(boolean vacunacionCompletada) {
        this.vacunacionCompletada = vacunacionCompletada;
    }

    public LocalDate getFechaAdministracion() {
        return fechaAdministracion;
    }

    public void setFechaAdministracion(LocalDate fechaAdministracion) {
        this.fechaAdministracion = fechaAdministracion;
    }

    public LocalDate getFechaProximaDosis() {
        return fechaProximaDosis;
    }

    public void setFechaProximaDosis(LocalDate fechaProximaDosis) {
        this.fechaProximaDosis = fechaProximaDosis;
    }

    public Vacuna(Long historialMedicoId, String nombre, int cantidadDosis, boolean vacunacionCompletada,
            LocalDate fechaAdministracion, LocalDate fechaProximaDosis) {
        this.historialMedicoId = historialMedicoId;
        this.nombre = nombre;
        this.cantidadDosis = cantidadDosis;
        this.vacunacionCompletada = vacunacionCompletada;
        this.fechaAdministracion = fechaAdministracion;
        this.fechaProximaDosis = fechaProximaDosis;
    }
    
}