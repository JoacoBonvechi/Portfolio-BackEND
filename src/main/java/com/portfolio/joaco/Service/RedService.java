
package com.portfolio.joaco.Service;


import com.portfolio.joaco.Entity.Red;
import com.portfolio.joaco.Repository.RedRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
@Transactional//persistencia en base de datos
public class RedService {
    @Autowired
    RedRepository rRed;
      
    
    public List<Red> list(){
        return rRed.findAll();
    }
    
    public Red getOne(int id){
        Red re= rRed.findById(id).orElse(null);
        return re;
    }
    
       
    public void save(Red re){
        rRed.save(re);
    }
    
     public void delete(int id){
        rRed.deleteById(id);
    }
     
    public void edit(Red re){
        rRed.save(re);
    }
    
    
     
    //busca lista de relojes por la id de la persona
    public List<Red> findByPersonaId(Long personaId) {
        return rRed.findByPersonaId(personaId);
    }
}
