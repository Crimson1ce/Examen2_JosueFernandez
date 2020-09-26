package examen2;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mensaje implements Serializable{
    private String contenido;
    private String hora;
    private Date fecha;
    private boolean leido;
    
    private static final SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm:ss");

    public Mensaje(String contenido, Date fecha) {
        this.contenido = contenido;
        this.hora = formatoHora.format(fecha);
        this.fecha = fecha;
        this.leido = false;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return  formatoFecha.format(fecha) + " a las " + formatoHora.format(fecha) + " - " + ( leido ? "Leído" : "No leído" ) + "\n" + contenido + "\n\n";
    }
    
}
