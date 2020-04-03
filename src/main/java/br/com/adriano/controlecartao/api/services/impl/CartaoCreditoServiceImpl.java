package br.com.adriano.controlecartao.api.services.impl;

import br.com.adriano.controlecartao.api.dtos.CartaoCreditoDTO;
import br.com.adriano.controlecartao.api.entities.CartaoCredito;
import br.com.adriano.controlecartao.api.entities.Usuario;
import br.com.adriano.controlecartao.api.exceptions.SystemException;
import br.com.adriano.controlecartao.api.mappers.CartaoCreditoMapper;
import br.com.adriano.controlecartao.api.repositories.CartaoCreditoRepository;
import br.com.adriano.controlecartao.api.services.interfaces.CartaoCreditoService;
import br.com.adriano.controlecartao.api.services.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CartaoCreditoServiceImpl implements CartaoCreditoService {

    @Autowired
    private CartaoCreditoRepository repository;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public List<CartaoCreditoDTO> buscarTodos() {
        return CartaoCreditoMapper.convertListToDto(repository.findAll());
    }

    @Override
    public CartaoCreditoDTO buscarPorId(Long id) throws Exception {
        Optional<CartaoCredito> cartao = repository.findById(id);

        if (!cartao.isPresent()) {
            throw new Exception("Cartão de Crédito não encontrado.");
        }

        return CartaoCreditoMapper.convertToDto(cartao.get());
    }

    @Override
    public List<CartaoCreditoDTO> buscarPorUsername(String username) throws SystemException {

        if (Objects.isNull(username)) {
            throw new SystemException("Usuário deve ser informado!");
        }

        List<CartaoCredito> compradores = repository.findByUsuarioUsername(username);
        return CartaoCreditoMapper.convertListToDto(compradores);

    }

    @Override
    public CartaoCreditoDTO salvar(CartaoCreditoDTO objeto) {
        Optional<Usuario> usuario = usuarioService.buscarUsuarioPorUsername(objeto.getUsuario().getUsername());

        if (!usuario.isPresent()) {
            throw new SystemException("Usuário não existe!");
        }
        CartaoCredito cartao = CartaoCreditoMapper.convertToEntity(objeto);
        cartao.setUsuario(usuario.get());
        return CartaoCreditoMapper.convertToDto(repository.save(cartao));
    }

    @Override
    public CartaoCreditoDTO editar(CartaoCreditoDTO objeto) {
        return null;
    }

    @Override
    public CartaoCreditoDTO remover(Long id) {
        return null;
    }
}
