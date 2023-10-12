

package Tienda.demo.dao;

import Tienda.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao extends JpaRepository <Categoria,Long>{ //Los <> se usan por asi decirlo para definir 
                                                                      //lo que se va a "traducir"
    
    
}
