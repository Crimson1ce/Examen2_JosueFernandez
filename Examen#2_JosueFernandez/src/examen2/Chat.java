package examen2;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Chat implements Serializable {
    private ArrayList<Mensaje> mensajes;

    public Chat() {
        this.mensajes = new ArrayList<>();
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return mensajes.toString();
    }
    
}
