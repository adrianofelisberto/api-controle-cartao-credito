package br.com.adriano.controlecartao.api.services.interfaces;

import br.com.adriano.controlecartao.api.dtos.BaseDTO;

import java.util.List;

public interface BaseService<T extends BaseDTO> {

    List<T> buscarTodos();

    T buscarPorId(Long id) throws Exception;

    T salvar(T objeto);

    T editar(T objeto);

    T remover(Long id);

}
