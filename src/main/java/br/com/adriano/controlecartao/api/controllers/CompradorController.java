package br.com.adriano.controlecartao.api.controllers;

import br.com.adriano.controlecartao.api.dtos.CompradorDTO;
import br.com.adriano.controlecartao.api.dtos.UsuarioDTO;
import br.com.adriano.controlecartao.api.exceptions.SystemException;
import br.com.adriano.controlecartao.api.services.interfaces.CompradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("compradores")
@CrossOrigin(origins = "*")
public class CompradorController {

    @Autowired
    private CompradorService service;

    @GetMapping
    public ResponseEntity<List<CompradorDTO>> buscarTodos() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    // Método será removido após a implementação da autenticação
    @GetMapping("/usuario")
    public ResponseEntity<List<CompradorDTO>> buscarPorUsername(@RequestHeader("username") String username) {
        return ResponseEntity.ok(service.buscarPorUsername(username));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompradorDTO> buscarPorId(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(service.buscarPorId(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping
    public ResponseEntity<CompradorDTO> salvar(@RequestHeader("username") String username, @RequestBody CompradorDTO comprador) {
        try {
            UsuarioDTO usuario = new UsuarioDTO();
            usuario.setUsername(username);
            comprador.setUsuario(usuario);
            return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(comprador));
        } catch (SystemException se) {
            return ResponseEntity.badRequest().build();
        }
    }
}
