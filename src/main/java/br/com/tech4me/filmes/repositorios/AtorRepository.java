package br.com.tech4me.filmes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tech4me.filmes.model.Ator;


public interface AtorRepository extends JpaRepository<Ator, Integer> {

}
