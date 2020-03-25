package br.com.adriano.controlecartao.api.services.impl;

import br.com.adriano.controlecartao.api.dtos.UsuarioCadastroDTO;
import br.com.adriano.controlecartao.api.dtos.UsuarioDTO;
import br.com.adriano.controlecartao.api.entities.Usuario;
import br.com.adriano.controlecartao.api.mappers.UsuarioMapper;
import br.com.adriano.controlecartao.api.repositories.IUsuarioRepository;
import br.com.adriano.controlecartao.api.services.interfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository repository;

    @Override
    public UsuarioDTO buscarUsuarioPorUsername(String username) { return null; }

    @Override
    public List<UsuarioDTO> buscarTodos() {
        return null;
    }

    @Override
    public UsuarioDTO buscarPorId(Long id) {
        return null;
    }

    @Override
    public UsuarioDTO salvar(UsuarioDTO objeto) {
        return null;
    }

    @Override
    public UsuarioDTO editar(UsuarioDTO objeto) {
        return null;
    }

    @Override
    public UsuarioDTO remover(Long id) {
        return null;
    }

    public UsuarioDTO novoUsuario(UsuarioCadastroDTO dto) {
        Usuario entity = repository.save(UsuarioMapper.convertDTOCadastroToEntity(dto));

        return UsuarioMapper.convertToDTO(entity);
    }
}
