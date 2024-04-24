package br.gov.sp.fatec.sprintboot03lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.sprintboot03lab4.entity.Autorizacao;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long>{
    
}
