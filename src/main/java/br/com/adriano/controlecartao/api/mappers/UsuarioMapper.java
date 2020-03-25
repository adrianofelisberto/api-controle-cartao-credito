package br.com.adriano.controlecartao.api.mappers;

import br.com.adriano.controlecartao.api.dtos.UsuarioCadastroDTO;
import br.com.adriano.controlecartao.api.dtos.UsuarioDTO;
import br.com.adriano.controlecartao.api.entities.Usuario;

public class UsuarioMapper {

    public static Usuario convertToEntity(UsuarioDTO dto) {
        Usuario entity = new Usuario();
        entity.setUsername(dto.getUsername());
        entity.setEmail(dto.getEmail());
        entity.setNome(dto.getNome());
        return entity;
    }

    public static Usuario convertDTOCadastroToEntity(UsuarioCadastroDTO dto) {
        Usuario entity = new Usuario();
        entity.setUsername(dto.getUsername());
        entity.setEmail(dto.getEmail());
        entity.setNome(dto.getNome());
        entity.setPassword(dto.getPassword());
        return entity;
    }

    public static UsuarioDTO convertToDTO(Usuario entity) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setNome(entity.getNome());
        dto.setUsername(entity.getUsername());
        dto.setEmail(entity.getEmail());
        return null;
    }
}
