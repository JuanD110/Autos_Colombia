package com.autos_colombia.v1.service;

import com.autos_colombia.v1.model.Usuario;
import com.autos_colombia.v1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario guardarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    
    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }

    
    public void eliminarUsuario(Long id) {
        repository.deleteById(id);
    }

    
    public Usuario obtenerUsuarioPorId(Long id) {
        Optional<Usuario> optionalUsuario = repository.findById(id);
        return optionalUsuario.orElse(null);
    }
}
