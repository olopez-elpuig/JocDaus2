package com.company;

import java.util.Scanner;

public class MenuJuegos {
    public static Scanner scanner;

    public MenuJuegos() {
    }

    public void menu() {
        System.out.println("3- Juego del parchis");
        System.out.println("2- Juego tres en raya");
        System.out.println("1- Lanzar los dados");
        System.out.println("0- Salir");
        System.out.println("Elige un juego:> ");
    }

    public static void main(String[] args) {
        MenuJuegos menu = new MenuJuegos();
        int lanzamientos = 0;
        int victorias = 0;
        int in;
        Juego juego = new Juego();

        do {
            menu.menu();
            in = scanner.nextInt();
        switch (in){
            case 1: juego.jugar();
                System.out.println(juego);
                break;
            case 2:
                System.out.println("No puedes jugar");
                break;
            case 3:
                System.out.println("No puedes jugar");
                break;
            case 0:
                System.out.println("Gracias por jugar!");
                break;
            }
        }while (in != 0);
    }

    static {
        scanner = new Scanner(System.in);
    }
}
