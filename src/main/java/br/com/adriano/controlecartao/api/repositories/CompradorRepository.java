package br.com.adriano.controlecartao.api.repositories;

import br.com.adriano.controlecartao.api.entities.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompradorRepository extends JpaRepository<Comprador, Long> {
    List<Comprador> findByUsuarioUsername(String username);
}
