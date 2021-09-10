package br.com.tech4me.filmes.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "movie")

public class Filme {
@OneToMany(mappedBy = "id.filme")
private List<Atuacao> atuacoes;

@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(
    name = "movie_direction",
    joinColumns = @JoinColumn(name = "mov_id", referencedColumnName = "mov_id"),
    inverseJoinColumns = @JoinColumn(name = "dir_id", referencedColumnName = "dir_id")
    )

private List<Diretor> diretores = new ArrayList<>();

public List<Diretor> getDiretores(){
    return diretores;
}
    public Map<String, Ator> getElenco(){
        Map<String, Ator> saida = new HashMap<>();
        
        atuacoes.forEach(at -> saida.put(at.getPapel().trim(),at.getId().getAtor()));
        return saida;
    }
    //ls//



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
    List<Diretor> dirs = getDiretores();
    return String.format("Titulo: %s (%d)\n\tDiretores: %s\n\ntElenco: %s\n",
    titulo.trim(), ano, dirs, getElenco());
}

}
//ls//
