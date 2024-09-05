package com.rancho_smart.domain.vacunacion.vacunacion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rancho_smart.domain.vacunacion.vacunacion.Entity.Vacuna;

@Repository
public interface VacunasRepository extends JpaRepository<Vacuna, Long>{

}
