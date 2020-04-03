package br.com.adriano.controlecartao.api.services.impl;

import br.com.adriano.controlecartao.api.dtos.UsuarioCadastroDTO;
import br.com.adriano.controlecartao.api.dtos.UsuarioDTO;
import br.com.adriano.controlecartao.api.entities.Usuario;
import br.com.adriano.controlecartao.api.exceptions.SystemException;
import br.com.adriano.controlecartao.api.mappers.UsuarioMapper;
import br.com.adriano.controlecartao.api.repositories.UsuarioRepository;
import br.com.adriano.controlecartao.api.services.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;


    @Override
    public Optional<Usuario> buscarUsuarioPorUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public UsuarioDTO novoUsuario(UsuarioCadastroDTO dto) throws SystemException {


        if (Objects.isNull(dto.getPassword())) {
            throw new SystemException("Senha obrigatória.");
        }

        Usuario entity = repository.save(UsuarioMapper.convertDTOCadastroToEntity(dto));
        return UsuarioMapper.convertToDTO(entity);
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public Usuario buscarUsuarioPorId(Long id) throws SystemException {
        Optional<Usuario> usuario = repository.findById(id);

        if (!usuario.isPresent()) {
            throw new SystemException("Usuário não encontrado!");
        }

        return usuario.get();
    }
}
