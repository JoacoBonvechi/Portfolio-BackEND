
package com.portfolio.joaco.Security.Repository;


import com.portfolio.joaco.Security.Enums.RolNombre;
import com.portfolio.joaco.Security.Enums.entity.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
