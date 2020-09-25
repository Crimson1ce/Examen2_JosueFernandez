package examen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Usuario extends Persona implements Serializable {

    private String usuario;
    private String contraseña;
    private ArrayList<Chat> chats;
    private ArrayList<Usuario> amigos;
    private int calidadConexion;

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, int calidadConexion, String nombre, String apellido, int numeroTelefonico) {
        super(nombre, apellido, numeroTelefonico);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.chats = new ArrayList<>();
        this.amigos = new ArrayList<>();
        this.calidadConexion = calidadConexion;
    }

    public int getCalidadConexion() {
        return calidadConexion;
    }

    public void setCalidadConexion(int calidadConexion) {
        this.calidadConexion = calidadConexion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + usuario;
    }

    @Override
    public double ENVIAR(Usuario receptor) {
        return (
                ( (double) receptor.getCalidadConexion() * 0.6)
                + ( (double) calidadConexion * 0.85)
                );
    }

}
