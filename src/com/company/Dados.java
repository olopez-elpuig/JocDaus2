package com.company;

public class Dados {
    private int valor;

    public Dados() {
    }

    public int getValor() {

        return this.valor;
    }

    public int lanzar() {
        this.valor = (int)(Math.random() * 6.0D) + 1;
        return this.valor;
    }

    public int dados() { return this.valor; }
}

