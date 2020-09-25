package examen2;

import java.io.Serializable;
import java.util.ArrayList;

public class ChatGrupal extends Chat implements Serializable {
    private String nombreGrupo;
    private ArrayList<Usuario> miembros;
    private Usuario administrador;

    public ChatGrupal(String nombreGrupo, Usuario administrador) {
        this.nombreGrupo = nombreGrupo;
        this.administrador = administrador;
        this.miembros = new ArrayList<>();
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Usuario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return nombreGrupo;
    }
    
}
