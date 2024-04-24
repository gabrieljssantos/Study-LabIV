package br.gov.sp.fatec.sprintboot03lab4.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tra_trabalho")
public class Trabalho {
    
    public Long getTra_id() {
        return tra_id;
    }

    public void setTra_id(Long tra_id) {
        this.tra_id = tra_id;
    }

    public String getTra_titulo() {
        return tra_titulo;
    }

    public void setTra_titulo(String tra_titulo) {
        this.tra_titulo = tra_titulo;
    }

    public LocalDateTime getTra_entrega() {
        return tra_entrega;
    }

    public void setTra_entrega(LocalDateTime tra_entrega) {
        this.tra_entrega = tra_entrega;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Long getTra_nota() {
        return tra_nota;
    }

    public void setTra_nota(Long tra_nota) {
        this.tra_nota = tra_nota;
    }

    public String getJustify() {
        return justify;
    }

    public void setJustify(String justify) {
        this.justify = justify;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tra_id")
    private Long tra_id;

    @Column(name = "tra_titulo")
    private String tra_titulo;

    @Column(name = "tra_data_hora_entrega")
    private LocalDateTime tra_entrega;

    @Column(name = "tra_descricao")
    private String desc;

    @Column(name = "tra_grupo")
    private String group;

    @Column(name = "tra_nota")
    private Long tra_nota;

    @Column(name = "tra_justificativa")
    private String justify;
}
