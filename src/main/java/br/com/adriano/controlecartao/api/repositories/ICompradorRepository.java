package br.com.adriano.controlecartao.api.repositories;

import br.com.adriano.controlecartao.api.entities.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICompradorRepository extends JpaRepository<Comprador, Long> {
    List<Comprador> findByUsuarioUsername(String username);
}
