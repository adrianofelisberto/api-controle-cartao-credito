package br.com.adriano.controlecartao.api.services.interfaces;

import br.com.adriano.controlecartao.api.dtos.BaseDTO;

import java.util.List;

public interface BuscaPorUsuarioService<T extends BaseDTO> extends BaseService<T> {
    List<T> buscarPorUsername(String username);
}
