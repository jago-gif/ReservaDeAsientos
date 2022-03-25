package cl.Juegos;

import java.util.Scanner;

public class PiedraPapelOTijera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juego=0;
        int jugada;
        for (int i = 0; i < 10; i++) {
            int maquina = (int) (Math.random() * 3 + 1);
            System.out.println("piedra=[1] palel=[2] o tijeras=[3]");
            jugada = scan.nextInt();
            if (jugada == 1) {
                if (maquina == 1){
                    System.out.println("Piedra con piedra empatan");
                }else if (maquina==2){
                    System.out.println("Perdiste-- piedra pierde contra papel");
                    juego -= 1;
                }else {
                    System.out.println("Ganaste--Piedra rompe tijeras");
                    juego += 1;
                }
            }else if (jugada==2){
                if (maquina == 1){
                    System.out.println("Ganaste--papel gana contra piedra");
                    juego += 1;
                }else if (maquina==2){
                    System.out.println("Papel con papel empatan");
                }else {
                    System.out.println("Perdiste--tijeras corta papel");
                    juego -= 1;
                }
            }else {
                if (maquina == 1){
                    System.out.println("Perdiste--Tijera pierde contra piedra");
                    juego -= 1;
                }else if (maquina==2){
                    System.out.println("Ganaste--tijera corta papel");
                    juego += 1;
                }else {
                    System.out.println("tijera empata con tijera");
                }
                }
            System.out.println("Mi puntaje es "+juego);
            }
        if (juego < 0){
            System.out.println(" Perdiste... te falta practica");
        }else if (juego >0) {
            System.out.println("Felicidades ganaste");
        }else {
            System.out.println("que pelea, quedaron empatados");
        }
    }
}

