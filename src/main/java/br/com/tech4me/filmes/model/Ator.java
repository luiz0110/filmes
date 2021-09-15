//ls//
package br.com.tech4me.filmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "actor")
public class Ator {
    @Id
        @Column(name = "act_id")   
    private Integer id;
    @Column(name = "act_fname")
    private String nome;
    @Column(name = "act_lname")
    private String sobrenome;
    @Column(name = "act_gender")
    private Character sexo;

public String getNomeCompleto(){
    return String.format("%s %s", nome.trim(), sobrenome.trim());
}

@Override
public String toString(){
    return getNomeCompleto();
}

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character character) {
        this.sexo = character;
    }
   
   

}
