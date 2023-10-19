
package Tienda_SebasParra.demo.service;


//imports de la clase
import Tienda_SebasParra.demo.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    public List <Categoria> getCategorias(boolean activos);
    
}// Fin de la clase
