package br.com.tech4me.filmes.telas;

import java.util.Scanner;

import org.springframework.data.repository.Repository;

import br.com.tech4me.filmes.model.Ator;
import br.com.tech4me.filmes.repositorios.AtorRepository;

public class TelaCadastrarAtor implements Tela<Ator, Integer> {

    @Override
    public void executar(Scanner entrada, Repository<Ator, Integer> repositorio) {
        Ator ator = new Ator();
        
        System.out.println("\n*****************");
        System.out.println("Cadastro de Ator");
        System.out.println("*****************");
    
        System.out.print("Informe o id do Ator: ");
        ator
        
        .setId(entrada.nextInt());
        entrada.nextLine();
        System.out.print("Nome: ");
        ator.setNome(entrada.nextLine());
        System.out.print("Sobrenome: ");
        ator.setSobrenome(entrada.nextLine());
        System.out.print("Sexo: ");
        ator.setSexo(entrada.next().charAt(0));
        entrada.nextLine();// Tira o ENTER

        ((AtorRepository)repositorio).save(ator);
        System.out.println("\nAtor cadastrado com sucesso.");

    }
    
}
