
package Tienda_SebasParra.demo.dao;

//Imports de la clase
import Tienda_SebasParra.demo.domain.Producto; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long> {
    
    
    
}// Fin de la clase
