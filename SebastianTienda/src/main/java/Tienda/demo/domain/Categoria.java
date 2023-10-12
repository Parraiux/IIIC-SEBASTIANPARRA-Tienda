

package Tienda.demo.domain;
//Aqui estamos mapeando en codigo la tabla de categoria para que se entiendan entre si 

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
@Data  //con estos arroba empieza a entender de lo que le estamos hablando
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    public Categoria() {
    }
    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }
}
