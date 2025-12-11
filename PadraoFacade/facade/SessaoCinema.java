package PadraoFacade.facade;
import PadraoFacade.cinema.*;

public class SessaoCinema {
    private Luzes luz;
    private Tv tv;
    private Som som;
    private Programacao programacao;

    public SessaoCinema(Luzes luz, Tv tv, Som som, Programacao programacao) {
        this.luz = luz;
        this.tv = tv;
        this.som = som;
        this.programacao = programacao;
    }

    public void escolherProgramacao(String app, String midia, int volumeAtual) {
        System.out.println("\n    * Ativando o modo Sessao Cinema...");
        luz.apagar();
        tv.ligar();
        tv.aplicativo(app);
        som.ligar();
        som.definirVolume(volumeAtual);
        programacao.reproduzir(midia);
    }

    public void encerrarSessao() {
        System.out.println("\n    * Desligando o modo Sessao Cinema...");
        luz.acender();
        som.desligar();
        tv.desligar();
    }
}