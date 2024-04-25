package br.gov.sp.fatec.sprintboot03lab4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.sprintboot03lab4.entity.Racao;
import br.gov.sp.fatec.sprintboot03lab4.repository.RacaoRepository;

@Service
public class RacaoService {
    
    @Autowired
    private RacaoRepository repository;

    public Racao newRacao(Racao racao) {
        if(racao == null || racao.getRac_marca().isBlank())
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Dados de usuário inválidos!");
        return repository.save(racao);
    }

    public List<Racao> getAllRacaos() {
        return repository.findAll();
    }

    public Racao findById(Long id) {
        Optional<Racao> racaoOp = repository.findById(id);
        if(racaoOp.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "racao not found");
        } return racaoOp.get();

    }

    public List<Racao> findByNote(Long nota) {
        return repository.findRacaoByNota(nota);
    }
    
    
}
