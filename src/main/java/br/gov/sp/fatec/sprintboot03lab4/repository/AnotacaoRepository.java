package br.gov.sp.fatec.sprintboot03lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.sprintboot03lab4.entity.Anotacao;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long>{
    
}

