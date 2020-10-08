package com.company;

import java.util.Scanner;

public class MenuJuegos {
    public static Scanner scanner;

    public MenuJuegos() {
    }

    public static int menu() {
        System.out.println("3- Juego del parchis");
        System.out.println("2- Juego tres en raya");
        System.out.println("1- Lanzar los dados");
        System.out.println("0- Salir");
        System.out.println("Elige un juego:> ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int lanzamientos = 0;
        int victorias = 0;
        Juego juego = new Juego();

        for(int op = menu(); op != 0; op = menu()) {
            ++lanzamientos;
            boolean b = juego.jugar();
            System.out.println(juego);
            if (b) {
                System.out.println("Has ganado!");
                ++victorias;
            }
            System.out.println("Has ganado " + victorias + " partidas");
        }

    }

    static {
        scanner = new Scanner(System.in);
    }
}
