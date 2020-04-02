package br.com.adriano.controlecartao.api.services.interfaces;

import br.com.adriano.controlecartao.api.dtos.UsuarioCadastroDTO;
import br.com.adriano.controlecartao.api.dtos.UsuarioDTO;
import br.com.adriano.controlecartao.api.entities.Usuario;
import br.com.adriano.controlecartao.api.exceptions.SystemException;

import java.util.Optional;

public interface UsuarioService {

    /**
     * Retorna um usuário, buncando atráves do username
     * @param username
     * @return UsuarioDTO
     */
    Optional<Usuario> buscarUsuarioPorUsername(String username);

    /**
     * Novo usuário cadastrado no sistema
     * @param dto
     * @return UsuarioDTO
     */
    UsuarioDTO novoUsuario(UsuarioCadastroDTO dto) throws SystemException;

    Usuario buscarUsuarioPorId(Long id) throws SystemException;
}
