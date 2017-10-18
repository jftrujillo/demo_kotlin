package com.example.jhonfredytrujilloortega.demomoneda.models;

/**
 * Created by jhonfredytrujilloortega on 10/17/17.
 */

public class Moneda {

    private String nombre;
    private int valor;
    private String pais;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
