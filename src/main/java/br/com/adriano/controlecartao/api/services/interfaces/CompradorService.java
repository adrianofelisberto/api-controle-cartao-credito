package br.com.adriano.controlecartao.api.services.interfaces;

import br.com.adriano.controlecartao.api.dtos.CompradorDTO;

import java.util.List;

public interface CompradorService extends BaseService<CompradorDTO> {

    List<CompradorDTO> buscarPorUsername(String username);

}
