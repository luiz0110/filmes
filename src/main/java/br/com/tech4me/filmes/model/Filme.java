package br.com.tech4me.filmes.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")

public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mov_id")
    private Integer id;
    @Column(name = "mov_title")
    private String titulo;
    @Column(name = "mov_year")
    public Integer ano;
    @Column(name = "mov_time")
    public Integer duracao;
    @Column(name = "mov_lang")
    private String idioma;
    @Column(name = "mov_dt_rel")
    private LocalDate dataLancametno;
    @Column(name = "mov_rel_country")
    private String paisLancamento;
    
        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public LocalDate getDataLancametno() {
        return dataLancametno;
    }

    public void setDataLancametno(LocalDate dataLancametno) {
        this.dataLancametno = dataLancametno;
    }

    public String getPaisLancamento() {
        return paisLancamento;
    }

    public void setPaisLancamento(String paisLancamento) {
        this.paisLancamento = paisLancamento;
    }

    @Override
    public String toString(){
        return String.format("Titulo: %s (%d)", titulo.trim(), ano);
    }
    
}
