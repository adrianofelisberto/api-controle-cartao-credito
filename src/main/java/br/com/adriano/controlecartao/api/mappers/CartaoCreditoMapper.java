package br.com.adriano.controlecartao.api.mappers;

import br.com.adriano.controlecartao.api.dtos.CartaoCreditoDTO;
import br.com.adriano.controlecartao.api.entities.CartaoCredito;

import java.util.List;
import java.util.stream.Collectors;

public class CartaoCreditoMapper {

    public static CartaoCredito convertToEntity(CartaoCreditoDTO dto) {
        CartaoCredito entity = new CartaoCredito();
        entity.setId(dto.getId());
        entity.setDiaFechamento(dto.getDiaFechamento());
        entity.setDiaVencimento(dto.getDiaVencimento());
        entity.setLogo(dto.getLogo());
        entity.setBandeira(dto.getBandeira());
        entity.setDescricao(dto.getDescricao());
        return entity;
    }

    public static CartaoCreditoDTO convertToDto(CartaoCredito entity) {
        CartaoCreditoDTO dto = new CartaoCreditoDTO();
        dto.setId(entity.getId());
        dto.setDiaFechamento(entity.getDiaFechamento());
        dto.setDiaVencimento(entity.getDiaVencimento());
        dto.setLogo(entity.getLogo());
        dto.setBandeira(entity.getBandeira());
        dto.setDescricao(entity.getDescricao());
        return dto;
    }

    public static List<CartaoCreditoDTO> convertListToDto(List<CartaoCredito> lista) {
        return lista.stream().map(cartaoCredito -> convertToDto(cartaoCredito)).collect(Collectors.toList());
    }
    
}
