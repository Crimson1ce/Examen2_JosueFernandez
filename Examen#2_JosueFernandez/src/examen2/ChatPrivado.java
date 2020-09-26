package examen2;

import java.io.Serializable;

public class ChatPrivado extends Chat implements Serializable {
    private Usuario primero;
    private Usuario segundo;

    public ChatPrivado(Usuario primero, Usuario segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public Usuario getPrimero() {
        return primero;
    }

    public void setPrimero(Usuario primero) {
        this.primero = primero;
    }

    public Usuario getSegundo() {
        return segundo;
    }

    public void setSegundo(Usuario segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Chat " + primero.getUsuario() + " - " + segundo.getUsuario();
    }
    
}
