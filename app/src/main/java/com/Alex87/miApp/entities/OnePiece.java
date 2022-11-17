package com.Alex87.miApp.entities;

public class OnePiece {
    private String name;
    private String descripcion;
    private int imagen;

    public OnePiece(String name, String descripcion, int imagen){
        this.name = name;
        this.descripcion=descripcion;
        this.imagen=imagen;
    }
    public String getName(){
        return this.name;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public int getImagen(){
        return this.imagen;
    }
}
