 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.joaco.Service;

import com.portfolio.joaco.Entity.Estudio;
import com.portfolio.joaco.Repository.EstudioRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional//persistencia en base de datos
public class EstudioService {
    
    @Autowired
    public EstudioRepository rEstudio;
    
    public List<Estudio> list(){
        return rEstudio.findAll();
    }
    
    public Estudio getOne(int id){
        Estudio expe = rEstudio.findById(id).orElse(null);
        return expe;
    }
    
    public void save(Estudio estu){
        rEstudio.save(estu);
    }
    
     public void delete(int id){
        rEstudio.deleteById(id);
    }
    
    public void edit(Estudio estu){
        rEstudio.save(estu);
    }
    
    public boolean existById(int id){
        return rEstudio.existsById(id);
    }
    
    public boolean existByNombreE(String estu){
        return rEstudio.existByNombreE(estu);
    }
    
    public Optional<Estudio> getByNombre(String nombre){
        return rEstudio.findByNombreE(nombre);
    }
     //busca lista de relojes por la id de la persona
    public List<Estudio> findByPersonaId(Long personaId) {
        return rEstudio.findByPersonaId(personaId);
    }
    
}
