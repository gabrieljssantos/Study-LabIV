package br.gov.sp.fatec.sprintboot03lab4.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rac_racao")
public class Racao {
    

    
    public Long getRac_id() {
        return rac_id;
    }

    public void setRac_id(Long rac_id) {
        this.rac_id = rac_id;
    }

    public String getRac_marca() {
        return rac_marca;
    }

    public void setRac_marca(String rac_marca) {
        this.rac_marca = rac_marca;
    }

    public LocalDateTime getRac_data_hora_ultima_compra() {
        return rac_data_hora_ultima_compra;
    }

    public void setRac_data_hora_ultima_compra(LocalDateTime rac_data_hora_ultima_compra) {
        this.rac_data_hora_ultima_compra = rac_data_hora_ultima_compra;
    }

    public Double getRac_quantidade() {
        return rac_quantidade_estoque;
    }

    public void setRac_quantidade(Double rac_quantidade) {
        this.rac_quantidade_estoque = rac_quantidade;
    }

    public Integer getRac_nota() {
        return rac_nota;
    }

    public void setRac_nota(Integer rac_nota) {
        this.rac_nota = rac_nota;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rac_id")
    private Long rac_id;

    @Column(name = "rac_marca")
    private String rac_marca;

    @Column(name = "rac_data_hora_ultima_compra")
    private LocalDateTime rac_data_hora_ultima_compra;

    @Column(name = "rac_quantidade_estoque")
    private Double rac_quantidade_estoque;

    @Column(name = "rac_nota")
    private Integer rac_nota;
}