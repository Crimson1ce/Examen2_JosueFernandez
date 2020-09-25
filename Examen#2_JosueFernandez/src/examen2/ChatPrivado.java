package examen2;

import java.io.Serializable;

public class ChatPrivado extends Chat implements Serializable {
    private Usuario receptor;

    public ChatPrivado(Usuario receptor) {
        this.receptor = receptor;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "ChatPrivado con " + receptor.getUsuario();
    }
    
}
