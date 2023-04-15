/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.joaco.Repository;

import com.portfolio.joaco.Entity.Habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad, Integer> {
    List<Habilidad> findByPersonaId(Long personaId);
}


