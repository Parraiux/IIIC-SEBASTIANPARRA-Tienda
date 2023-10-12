

package Tienda.demo.controller;

//Habla entre las listas y el controlador
import Tienda.demo.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@Slf4j //las arrobas son para conectarse con la base de datos
@RequestMapping("/categoria")  //se le pide que mapee todas las categorias, controlador de datos
public class CategoriaController { //objeto del service
    
    @Autowired
    private CategoriaService categoriaService; //de aqui saca las categorias del objeto, las listas
    @GetMapping("/listado") //mapea un listado de categorias 
    public String inicio(Model model) {
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("categorias", categorias);//aqui le agregamos un atributo de categorias
        model.addAttribute("totalCategorias", categorias.size());//aqui agregamos el tamanno 
        
        return "/categoria/listado"; //devuelve lo agregado
    }
}