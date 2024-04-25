package br.gov.sp.fatec.sprintboot03lab4.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import br.gov.sp.fatec.sprintboot03lab4.entity.Racao;

public interface RacaoRepository extends JpaRepository<Racao, Long>{
    
    @Query("SELECT r FROM Racao r WHERE r.rac_nota > :nota")
    public List<Racao> findRacaoByNota(@Param("nota") Long nota);
}
