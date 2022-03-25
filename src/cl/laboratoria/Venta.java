package cl.laboratoria;

import java.util.ArrayList;
import java.util.Scanner;

public class Venta {
    public static void main(String[] args) {

        ArrayList<Asientos>asientosList = new ArrayList<>();
        int ingresar;
        Scanner scan = new Scanner(System.in);
        //creacion de asientos por un for desde el 1 al 100 y con un if para que los primeros 30 sean galeria->30platea
        //y el resto palco
        for (int i=1; i<=100; i++){
            if (i<=30){
                asientosList.add(new Asientos("galeria",i,5000,false,false,80));
            }
            else if (i<=60){
                asientosList.add(new Asientos("platea",i,10000,false,false,90));
            }
            else{
                asientosList.add(new Asientos("palco",i,15000,false,false,100));
            }
        }
        //creacion del ciclo recurrente para el menú presiona 0 para salir
        do {
            System.out.println("Bienvenido a sistema de reserva de asientos");
            System.out.println("[1] = Ver asientos ");
            System.out.println("[2] = Ver el dinero recaudado ");
            System.out.println("[0] = Salir ");
            ingresar = scan.nextInt();
            //menú en switch
            switch (ingresar) {
                case 1 -> {
                    System.out.println("[1] = Desea reservar palco  ");
                    System.out.println("[2] = Desea reservar galeria ");
                    System.out.println("[3] = Desea reservar platea  ");
                    System.out.println("[10] = Salir ");
                    ingresar = scan.nextInt();
                    if (ingresar == 1) {
                        //al ingresar a palco el for corre del 60 al 100 para mostrar desde el 61 al 100 (60 seria 0)
                        for (int i = 60; i < 100; i++) {
                            System.out.println(asientosList.get(i));
                        }
                        System.out.println("escriba el numero del asiento que desea comprar");
                        ingresar = scan.nextInt();
                        //si numero numero mayor a 60 (recuerda 60 es 0 y menor o igual a 100
                        if (ingresar > 60 && ingresar <= 100) {
                            //entra a otro if donde ve si está reservado -1 porque al ingresar parte la cuenta desde 0
                            if (asientosList.get(ingresar - 1).isReservado()) {
                                //si esta reservado mensaje
                                System.out.println("Lo Sentimos el asiento seleccionado ya se encuentra reservado");
                            } else {
                                //sino cambia reservado a verdadero
                                asientosList.get(ingresar - 1).setReservado(true);
                                System.out.println(" reservado su asiento");
                            }
                        } else {
                            //si el numero ingresado no esta entre 61 y 100
                            System.out.println("En palco solo puede seleccionar asientos entre 60 y 100");
                        }
                    } else if (ingresar == 2) {
                        for (int i = 0; i < 30; i++) {
                            System.out.println(asientosList.get(i));
                        }
                        System.out.println("escriba el numero del asiento que desea comprar");
                        ingresar = scan.nextInt();
                        if (ingresar >= 1 && ingresar <= 30) {
                            if (asientosList.get(ingresar - 1).isReservado()) {
                                System.out.println("Lo Sentimos el asiento seleccionado ya se encuentra reservado");
                            } else {
                                asientosList.get(ingresar - 1).setReservado(true);
                                System.out.println(" reservado su asiento");
                            }
                        } else {
                            System.out.println("En galeria solo puede seleccionar asientos entre el 1 y 30");
                        }
                    } else if (ingresar == 3) {
                        for (int i = 30; i < 60; i++) {
                            System.out.println(asientosList.get(i));
                        }
                        System.out.println("escriba el numero del asiento que desea comprar");
                        ingresar = scan.nextInt();
                        if (ingresar >= 31 && ingresar <= 60) {
                            if (asientosList.get(ingresar - 1).isReservado()) {
                                System.out.println("Lo Sentimos el asiento seleccionado ya se encuentra reservado");
                            } else {
                                asientosList.get(ingresar - 1).setReservado(true);
                                System.out.println(" reservado su asiento");
                            }
                        } else {
                            System.out.println("En platea solo puede seleccionar asientos entre el 31 y 60");
                        }
                    } else {
                        System.out.println("opcion no valida");
                    }
                }
                case 2 -> {
                    //almacenador de numero iniciado en 0 e inicia ciclo, si está reservado valor suma el valor de cada
                    //asiento del reservado dentro del ciclo usando valor = valor asiendo + valor
                    int valor = 0;
                    for (int i = 1; i < 100; i++) {
                        if (asientosList.get(i).isReservado()) {
                            valor = asientosList.get(i).getValorAsiento() + valor;
                        }
                    }
                    System.out.println(valor);
                }
            }
        }while (ingresar!=0);
    }

}
