package br.gov.sp.fatec.sprintboot03lab4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.sprintboot03lab4.entity.Racao;
import br.gov.sp.fatec.sprintboot03lab4.service.RacaoService;

@RestController
@RequestMapping(value = "/racao")
@CrossOrigin
public class RacaoController {
    
    @Autowired
    private RacaoService service;
    
    @GetMapping
    public List<Racao> getAll() {
        return service.getAllRacaos();
    }

    @GetMapping(value = "/{id}")
    public Racao findById(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @GetMapping(value = "/note/{note}")
    public List<Racao> getByNote(@PathVariable("note") Long note) {
        return service.findByNote(note);
    } 
    
    @PostMapping
    public Racao novo(@RequestBody Racao racao) {
        return service.newRacao(racao);
    }
    
}
