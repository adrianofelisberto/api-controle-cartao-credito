package br.com.adriano.controlecartao.api.controllers;

import br.com.adriano.controlecartao.api.dtos.UsuarioCadastroDTO;
import br.com.adriano.controlecartao.api.dtos.UsuarioDTO;
import br.com.adriano.controlecartao.api.exceptions.SystemException;
import br.com.adriano.controlecartao.api.services.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import javax.xml.ws.Response;

@RestController
@RequestMapping("usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl service;

    @PostMapping
    public ResponseEntity<UsuarioDTO> salvarUsuario(@Valid @RequestBody UsuarioCadastroDTO usuario) {
        try {
            return ResponseEntity.ok(service.novoUsuario(usuario));
        } catch (SystemException se) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, se.getMessage(), se
            );
        }

    }

    @GetMapping
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok(new String("Hello World!"));
    }

}
