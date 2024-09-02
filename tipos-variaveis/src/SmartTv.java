
public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void ligar() {
        ligada = true;

    }

    public void desligar() {
        ligada = false;

    }

    public void diminuirCanal() {
        canal--;

    }

    public void aumentarCanal() {
        canal++;

    }
}
