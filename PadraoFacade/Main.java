package PadraoFacade;
import PadraoFacade.cinema.*;
import PadraoFacade.facade.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Luzes luz = new Luzes();
        Tv tv = new Tv();
        Som som = new Som();
        Programacao programacao = new Programacao();

        SessaoCinema sessaoCinema = new SessaoCinema(luz, tv, som, programacao);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n    * Entrando no modo Sessao Cinema");

        System.out.println("\n    * Escolha um aplicativo para assistir\n");
        String app = scanner.nextLine();

        System.out.println("\n    * Escolha uma Serie/Filme para assistir\n");
        String midia = scanner.nextLine();

        System.out.println("\n    * Escolha o volume do som\n");
        int volumeAtual = scanner.nextInt();

        scanner.nextLine();
        sessaoCinema.escolherProgramacao(app, midia, volumeAtual);
        System.out.println("\n    * Para sair do modo Sessao Cinema pressione a tecla Enter");
        scanner.nextLine();

        sessaoCinema.encerrarSessao();

        scanner.close();
        System.out.println("      Fim da Sessao");

    }
}
