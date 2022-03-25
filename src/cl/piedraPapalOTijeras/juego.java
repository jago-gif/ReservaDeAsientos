package cl.piedraPapalOTijeras;

import java.util.Scanner;

public class juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juego=0;
        int jugada;
        for (int i = 0; i < 10; i++) {
            int maquina = (int) (Math.random() * 3 + 1);
            System.out.println("piedra=[1] palel=[2] o tijeras=[3]");
            jugada = scan.nextInt();
            if (jugada > maquina) {
                System.out.println("ganaste 1 punto");
                juego += 1;
                System.out.println(juego);
            }else{
                System.out.println("perdiste 1 punto");
                juego -= 1;
                System.out.println(juego);
            }
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

