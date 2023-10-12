

package Tienda.demo.service;

import Tienda.demo.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos); //crea una lista de categoria y le mete categorias
    
    
}
