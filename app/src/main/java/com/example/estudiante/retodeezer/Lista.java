package com.example.estudiante.retodeezer;

public class Lista {

    private String nombreCanciones;
    private String user;
    private String canciones;

    public Lista(String nombreCanciones, String user, String canciones) {
        this.nombreCanciones = nombreCanciones;
        this.user = user;
        this.canciones = canciones;
    }



    public String getUser() { return user;}
    public void setUsuario(String user) { this.user = user; }

    public String getCanciones() { return canciones; }
    public void setCanciones(String canciones) { this.canciones = canciones; }

    public String getNombre() {
        return nombreCanciones;
    }
    public void setNombre(String nombreCanciones) {
        this.nombreCanciones = nombreCanciones;
    }

}
