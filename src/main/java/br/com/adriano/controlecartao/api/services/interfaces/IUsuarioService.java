package br.com.adriano.controlecartao.api.services.interfaces;

import br.com.adriano.controlecartao.api.dtos.UsuarioDTO;

public interface IUsuarioService extends IBaseService<UsuarioDTO> {

    /**
     * Retorna um usuário, buncando atráves do username
     * @param username
     * @return Usuario
     */
    UsuarioDTO buscarUsuarioPorUsername(String username);

}
