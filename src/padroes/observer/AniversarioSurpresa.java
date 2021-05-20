package padroes.observer;

import javax.sound.sampled.Port;

public class AniversarioSurpresa {

    public static void main(String[] args) {

        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registrarObservador(namorada);

        porteiro.registrarObservador(evento -> {
            System.out.println("Surpresaaaaa via Lambda!!!!");
        });

        porteiro.monitorar();
    }
}
