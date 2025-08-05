package br.com.alura.codechella.infra.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CriarUsuario criarUsuario;

    public UsuarioController(CriarUsuario criarUsuario) {
        this.criarUsuario = criarUsuario;
    }

    @PostMapping
    public UsuarioDto cadastrarUsuario(@RequestBody UsuarioDto dto) {
      Usuario salvo = criarUsuario.cadastrarUsuario(new Usuario(dto.cpf(), dto.nome(), dto.nascimento(), dto.email()));
        
        return new UsuarioDto(salvo.getCpf(), salvo.getNome(), salvo.getNascimento(), salvo.getEmail());
         
    }
}