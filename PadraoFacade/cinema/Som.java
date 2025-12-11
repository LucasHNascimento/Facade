package PadraoFacade.cinema;

public class Som {
    public void ligar() {
        System.out.println("\nVolume ativado");
    }
    public void desligar() {
        System.out.println("\nVolume desativado");
    }
    public void definirVolume(int volumeAtual) {
        System.out.println("\nVolume atual: " + volumeAtual);
    }
}
