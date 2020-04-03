package br.com.adriano.controlecartao.api.repositories;

import br.com.adriano.controlecartao.api.entities.CartaoCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartaoCreditoRepository extends JpaRepository<CartaoCredito, Long> {
    List<CartaoCredito> findByUsuarioUsername(String username);
}
