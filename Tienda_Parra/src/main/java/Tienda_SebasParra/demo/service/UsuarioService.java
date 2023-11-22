

package Tienda_SebasParra.demo.service;


import org.springframework.security.core.userdetails.*;

public interface UsuarioService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
