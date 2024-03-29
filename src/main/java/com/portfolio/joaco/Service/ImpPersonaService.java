package com.portfolio.joaco.Service;


import com.portfolio.joaco.Entity.Persona;
import com.portfolio.joaco.Repository.PersonaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService  {
    @Autowired PersonaRepository rPersona;
    
    
    
   public List<Persona> list(){
        return rPersona.findAll();
    }
    
    public Persona getOne(Long id){
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }    
   
    
    public void save(Persona pers){
        rPersona.save(pers);
    }      
    

     public void delete(Long id){
        rPersona.deleteById(id);
    }    
     

     public void edit(Persona pers){
        rPersona.save(pers);
    }  
       
}