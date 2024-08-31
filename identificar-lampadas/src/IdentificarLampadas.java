public class IdentificarLampadas {

    public static void main(String[] args) {

        boolean interruptor1 = true;
        boolean interruptor2 = false;
        boolean interruptor3 = false;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        interruptor1 = false;
        interruptor2 = true;

        Lampada lampada1 = new Lampada(false, true);  // Apagada, mas quente
        Lampada lampada2 = new Lampada(true, false);  // Acesa e fria
        Lampada lampada3 = new Lampada(false, false); // Apagada e fria

        if (lampada1.estaQuente()) {
            System.out.println("O interruptor 1 controla a lâmpada 1.");
        } else if (lampada2.estaLigada()) {
            System.out.println("O interruptor 2 controla a lâmpada 2.");
        } else {
            System.out.println("O interruptor 3 controla a lâmpada 3.");
        }
    }
}

class Lampada {
    private boolean ligada;
    private boolean quente;

    public Lampada(boolean ligada, boolean quente) {
        this.ligada = ligada;
        this.quente = quente;
    }

    public boolean estaLigada() {
        return ligada;
    }

    public boolean estaQuente() {
        return quente;
    }
}