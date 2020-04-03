package br.com.adriano.controlecartao.api.services.impl;

import br.com.adriano.controlecartao.api.dtos.CompradorDTO;
import br.com.adriano.controlecartao.api.entities.Comprador;
import br.com.adriano.controlecartao.api.entities.Usuario;
import br.com.adriano.controlecartao.api.exceptions.SystemException;
import br.com.adriano.controlecartao.api.mappers.CompradorMapper;
import br.com.adriano.controlecartao.api.repositories.CompradorRepository;
import br.com.adriano.controlecartao.api.services.interfaces.CompradorService;
import br.com.adriano.controlecartao.api.services.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CompradorServiceImpl implements CompradorService {

    @Autowired
    private CompradorRepository repository;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public List<CompradorDTO> buscarTodos() {
        List<Comprador> listaDTO = repository.findAll();
        return CompradorMapper.convertListToDto(listaDTO);
    }

    @Override
    public CompradorDTO buscarPorId(Long id) throws Exception {
        Optional<Comprador> comprador = repository.findById(id);

        if (!comprador.isPresent()) {
            throw new Exception("Comprador não encontrado.");
        }

        return CompradorMapper.convertToDto(comprador.get());

    }

    @Override
    public CompradorDTO salvar(CompradorDTO objeto) throws SystemException {
        Optional<Usuario> usuario = usuarioService.buscarUsuarioPorUsername(objeto.getUsuario().getUsername());

        if (!usuario.isPresent()) {
            throw new SystemException("Usuário não existe!");
        }
        Comprador comprador = CompradorMapper.convertToEntity(objeto);
        comprador.setUsuario(usuario.get());
        return CompradorMapper.convertToDto(repository.save(comprador));
    }

    @Override
    public List<CompradorDTO> buscarPorUsername(String username) throws SystemException {

        if (Objects.isNull(username)) {
            throw new SystemException("Usuário deve ser informado!");
        }

        List<Comprador> compradores = repository.findByUsuarioUsername(username);
        return CompradorMapper.convertListToDto(compradores);

    }

    @Override
    public CompradorDTO editar(CompradorDTO objeto) {
        return null;
    }

    @Override
    public CompradorDTO remover(Long id) {
        return null;
    }
}
