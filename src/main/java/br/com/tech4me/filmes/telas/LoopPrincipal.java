package br.com.tech4me.filmes.telas;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import br.com.tech4me.filmes.repository.FilmeRepositorio;

@Component
public class LoopPrincipal {
    @Autowired
    private ApplicationContext context;

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void loop() {
        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            Tela tela = null;
            Repository repositorio = null;
            limparTela();
            
            System.out.println("**************");
            System.out.println("MENU PRINCIPAL");
            System.out.println("**************");
            System.out.println("1 - Buscar filme");
            System.out.println("2 - Incluir filme");
            System.out.println("3 - Listar filmes");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();// Limpa o ENTER

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                    case 3:
                    tela = new TelaListarFilmes();
                    repositorio = context.getBean(FilmeRepositorio.class);
                    break;

                case 0:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    voltarMenu(entrada);
                    break;
            }

            if (tela != null) {
                tela.executar(entrada, repositorio);
                voltarMenu(entrada);
            }
         } while(opcao != 0);
    }

    public static void limparTela() {
    }

    private void voltarMenu(Scanner entrada) {
    }
  
}