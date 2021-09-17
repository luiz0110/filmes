package br.com.tech4me.filmes.model;
//ls//

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class Diretor {
    @Id
    @Column(name = "dir_id")
    private Integer Id;
    @Column(name = "dir_fname")
    private String nome;
    @Column(name = "dir_lname")
    private String sobrenome;

    //#region Getter/Setter
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
     //#endregion
     
    public String getNomeCompleto(){
    return String.format("%s %s", nome.trim(), sobrenome.trim());
    }
  

    @Override
    public String toString(){
    return getNomeCompleto();
    }   
}

