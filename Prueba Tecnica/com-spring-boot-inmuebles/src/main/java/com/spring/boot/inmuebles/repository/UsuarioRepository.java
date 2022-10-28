package com.spring.boot.inmuebles.repository;

import com.spring.boot.inmuebles.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository
        extends JpaSpecificationExecutor<Usuario>, PagingAndSortingRepository<Usuario, Long> {
    List<Usuario> findAll();

}
