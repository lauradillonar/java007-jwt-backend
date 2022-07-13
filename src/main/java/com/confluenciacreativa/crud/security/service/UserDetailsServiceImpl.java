package com.confluenciacreativa.crud.security.service;

import com.confluenciacreativa.crud.security.entity.Usuario;
import com.confluenciacreativa.crud.security.entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl {

    @Autowired
    UsuarioService usuarioService;

    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException{
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.buil(usuario);
    }
}
