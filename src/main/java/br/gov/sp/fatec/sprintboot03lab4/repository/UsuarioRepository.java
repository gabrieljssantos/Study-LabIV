package br.gov.sp.fatec.sprintboot03lab4.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import br.gov.sp.fatec.sprintboot03lab4.entity.Usuario;

public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {
       
}

