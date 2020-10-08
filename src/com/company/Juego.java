package com.company;

import java.util.Arrays;

public class Juego {
    Dados[] dado = new Dados[3];

    public Juego() {
        this.dado[0] = new Dados();
        this.dado[1] = new Dados();
        this.dado[2] = new Dados();
    }

    public boolean jugar() {
        int a = this.dado[0].lanzar();
        int b = this.dado[1].lanzar();
        int c = this.dado[2].lanzar();
        return a == b && b == c;
    }
    @Override
    public String toString() {
        return "JuegoDeDados{" + " dado 1={" +dado[0].getValor() + "} dado 2={" + dado[1].getValor() + "} dado 3={" + dado[2].getValor() + "}";
    }
}

