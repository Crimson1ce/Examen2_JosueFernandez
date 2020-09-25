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

    public Usuario(String usuario, String contraseña, ArrayList<Chat> chats, ArrayList<Usuario> amigos, int calidadConexion, String nombre, String apellido, int numeroTelefonico) {
        super(nombre, apellido, numeroTelefonico);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.chats = chats;
        this.amigos = amigos;
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

    public void escribirChats() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            File file = new File("./Usuarios/" + usuario + ".leogram");
            fos = new FileOutputStream(file, false);
            oos = new ObjectOutputStream(fos);

            for (Chat chat : chats) {
                oos.writeObject(chat);
            }

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error con archivo de " + usuario + " al escribir");
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
            }
        }
    }

    public void cargarChats() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File file = new File("./Usuarios/" + usuario + ".leogram");
        if (file.exists()) {
            try {
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                Chat chat;
                chats = new ArrayList<>();

                while ((chat = (Chat) ois.readObject()) != null) {
                    chats.add(chat);
                }

            } catch (EOFException | ClassNotFoundException ex) {
            } catch (IOException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Error con archivo de " + usuario + " al cargar");
            } finally {
                try {
                    ois.close();
                    fis.close();
                } catch (IOException ex) {
                }
            }
        }
    }

    @Override
    public double ENVIAR(Usuario receptor) {
        return (
                ( (double) receptor.getCalidadConexion() * 0.6)
                + ( (double) calidadConexion * 0.85)
                );
    }

}
