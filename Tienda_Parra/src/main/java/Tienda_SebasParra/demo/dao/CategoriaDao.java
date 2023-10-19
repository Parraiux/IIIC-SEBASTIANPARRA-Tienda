

package Tienda_SebasParra.demo.dao;

//Imports de la clase
import Tienda_SebasParra.demo.domain.Categoria; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
    
    
}// Fin de la clase
