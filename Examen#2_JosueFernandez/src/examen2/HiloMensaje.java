package examen2;

import javax.swing.JProgressBar;

public class HiloMensaje extends Thread {

    private double tiempo;
    private JProgressBar barra;

    public HiloMensaje(double tiempo, JProgressBar barra) {
        this.tiempo = tiempo;
        this.barra = barra;
        this.barra.setMaximum((int) (tiempo * 100.0));
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        while (true) {

            barra.setValue(barra.getValue() + 10);
            System.out.println(barra.getValue());
            if (barra.getValue() == barra.getMaximum()) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
    }

}
