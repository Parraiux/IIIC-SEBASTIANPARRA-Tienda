/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda_SebasParra.demo.service;

//imports de la clase
import Tienda_SebasParra.demo.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    public List <Producto> getProductos(boolean activos);
     // Se obtiene un listado de productos en un List
    
   // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo categoria si el id del producto esta vacío
    // Se actualiza un categoria si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
}
// Fin de la clase
