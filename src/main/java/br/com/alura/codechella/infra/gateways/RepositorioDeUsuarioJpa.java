package br.com.alura.codechella.infra.gateways;

import java.util.List;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioRepository;

public class RepositorioDeUsuarioJpa implements RepositorioDeUsuario{

    private final UsuarioRepository repositorio;

    public RepositorioDeUsuarioJpa(UsuarioRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.save(usuario);
    }

    @Override
    public List<Usuario> listarTodos() {
        // TODO Auto-generated method stub
        return repositorio.findAll();
    }
 
}
