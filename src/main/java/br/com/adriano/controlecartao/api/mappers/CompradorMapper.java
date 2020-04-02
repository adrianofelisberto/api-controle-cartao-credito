package br.com.adriano.controlecartao.api.mappers;

import br.com.adriano.controlecartao.api.dtos.CompraDTO;
import br.com.adriano.controlecartao.api.dtos.CompradorDTO;
import br.com.adriano.controlecartao.api.entities.Comprador;

import java.util.List;
import java.util.stream.Collectors;

public class CompradorMapper {

    public static Comprador convertToEntity(CompradorDTO dto) {
        Comprador entity = new Comprador();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        return entity;
    }

    public static CompradorDTO convertToDto(Comprador entity) {
        CompradorDTO dto = new CompradorDTO();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        return dto;
    }

    public static List<CompradorDTO> convertListToDto(List<Comprador> lista) {
        return lista.stream().map(comprador -> convertToDto(comprador)).collect(Collectors.toList());
    }
}
