package br.com.adriano.controlecartao.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBaseRepository<T extends BaseEntity> extends JpaRepository<T, Long> { }
