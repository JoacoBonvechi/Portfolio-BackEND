/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.joaco.Service;

import com.portfolio.joaco.Entity.Habilidad;
import com.portfolio.joaco.Repository.HabilidadRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional//persistencia en base de datos
public class HabilidadService {
    @Autowired
    public HabilidadRepository rHabilidad;
    
    
    public List<Habilidad> list(){
        return rHabilidad.findAll();
    }
    
    public Habilidad getOne(int id){
        return rHabilidad.findById(id).orElse(null);
    }
        
    
    public void save(Habilidad habi){
        rHabilidad.save(habi);
    }
    
     public void delete(int id){
        rHabilidad.deleteById(id);
    }
    
     public void edit(Habilidad habi){
        rHabilidad.save(habi);
    }
    
     //busca lista de relojes por la id de la persona
    public List<Habilidad> findByPersonaId(Long personaId) {
        return rHabilidad.findByPersonaId(personaId);
    }
}
