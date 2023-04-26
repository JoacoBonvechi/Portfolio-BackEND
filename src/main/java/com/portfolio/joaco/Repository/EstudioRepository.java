package com.portfolio.joaco.Repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.portfolio.joaco.Entity.Estudio;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Integer> {
    
    List<Estudio> findByPersonaId(Long personaId);
    
    public boolean existByNombreE(String nombreE);
    public Optional<Estudio> findByNombreE(String nombreE);
}

