package com.spring.boot.inmuebles.repository;

import com.spring.boot.inmuebles.dto.UsuarioInmuebleDto;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repo extends CrudRepository<UsuarioInmuebleDto, String> {

    @Query(value = "SELECT\n" +
            "  `inmobiliaria`.`usuario`.`nombre`,\n" +
            "  `inmobiliaria`.`usuario`.`apellido`,\n" +
            "  `inmobiliaria`.`usuario`.`email`,\n" +
            "  `inmobiliaria`.`inmueble`.`ciudad`,\n" +
            "  `inmobiliaria`.`inmueble`.`direccion`,\n" +
            "  `inmobiliaria`.`inmueble`.`tipo_inmueble`,\n" +
            "  `inmobiliaria`.`usuario_inmueble`.`due_date`\n" +
            "FROM `inmobiliaria`.`usuario`\n" +
            "JOIN `inmobiliaria`.`usuario_inmueble` ON `inmobiliaria`.`usuario`.`id`=`inmobiliaria`.`usuario_inmueble`.`id_usuario`\n" +
            "JOIN `inmobiliaria`.`inmueble` ON  `inmobiliaria`.`inmueble`.`id`=`inmobiliaria`.`usuario_inmueble`.`id_inmueble`\n" +
            "WHERE `inmobiliaria`.`usuario`.`nombre` LIKE %?1% \n" +
            " OR `inmobiliaria`.`usuario`.`apellido` LIKE %?1%\n" +
            " OR `inmobiliaria`.`usuario`.`email` LIKE %?1%\n" +
            " OR `inmobiliaria`.`inmueble`.`ciudad` LIKE %?1%\n" +
            " OR `inmobiliaria`.`inmueble`.`direccion` LIKE %?1%\n" +
            " OR `inmobiliaria`.`inmueble`.`tipo_inmueble` LIKE %?1%\n" +
            " OR `inmobiliaria`.`usuario_inmueble`.`due_date` LIKE %?1%")
    List<UsuarioInmuebleDto> findByPalabraClave(String palabraClave);
}
