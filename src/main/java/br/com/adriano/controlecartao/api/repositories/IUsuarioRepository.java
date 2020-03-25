package br.com.adriano.controlecartao.api.repositories;

import br.com.adriano.controlecartao.api.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
