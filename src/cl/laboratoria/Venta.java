package cl.laboratoria;

import java.util.ArrayList;
import java.util.Scanner;

public class Venta {
    public static void main(String[] args) {

        ArrayList<Asientos>asientosList = new ArrayList<Asientos>();
        int ingresar;
        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=100; i++){
            if (i<=30){
                asientosList.add(new Asientos("galeria",i,5000,false,false,80));
            }
            else if (i>30 && i<=60){
                asientosList.add(new Asientos("platea",i,10000,false,false,90));
            }
            else{
                asientosList.add(new Asientos("palco",i,15000,false,false,100));
            }
        }

        do {
            System.out.println("Bienvenido a sistema de reserva de asientos");
            System.out.println("[1] = Ver asientos ");
            System.out.println("[2] = Ver el dinero recaudado ");
            System.out.println("[0] = Salir ");
            ingresar = scan.nextInt();
            switch (ingresar){
                case 1:
                    System.out.println("[1] = Desea reservar palco  ");
                    System.out.println("[2] = Desea reservar galeria ");
                    System.out.println("[3] = Desea reservar platea  ");
                    System.out.println("[10] = Salir ");
                    ingresar = scan.nextInt();
                    if (ingresar==1){
                        for (int i=60; i<100; i++){
                            System.out.println(asientosList.get(i));
                        }
                        System.out.println("escriba el numero del asiento que desea comprar");
                        ingresar = scan.nextInt();
                        if( asientosList.get(ingresar-1).isReservado()){
                            System.out.println("Lo Sentimos el asiento seleccionado ya se encuentra reservado");
                        }else if (asientosList.get(ingresar-1).isReservado()){
                            System.out.println(" reservado su asiento");
                        }
                        else{
                            asientosList.get(ingresar-1).setReservado(true);
                            System.out.println("Solo tenemos 30 asientos en palco");
                        }
                    }else if (ingresar == 2){
                        for (int i=1; i<30; i++) {
                            System.out.println(asientosList.get(i));
                        }
                        System.out.println("escriba el numero del asiento que desea comprar");
                        ingresar = scan.nextInt();
                        if( asientosList.get(ingresar-1).isReservado()){
                            System.out.println("Lo Sentimos el asiento seleccionado ya se encuentra reservado");
                        }else if (asientosList.get(ingresar-1).isReservado()){
                            System.out.println(" reservado su asiento");
                        }
                        else{
                            asientosList.get(ingresar-1).setReservado(true);
                            System.out.println("Solo tenemos 30 asientos en galeria");
                        }

                    }else if (ingresar == 3){
                        for (int i=31; i<60; i++){
                            System.out.println(asientosList.get(i));
                        }
                        System.out.println("escriba el numero del asiento que desea comprar");
                        ingresar = scan.nextInt();
                        if( asientosList.get(ingresar-1).isReservado()){
                            System.out.println("Lo Sentimos el asiento seleccionado ya se encuentra reservado");
                        }else if (asientosList.get(ingresar-1).isReservado()){
                            System.out.println(" reservado su asiento");
                        }
                        else{
                            asientosList.get(ingresar-1).setReservado(true);
                            System.out.println("Solo tenemos 30 asientos en platea");
                        }
                    }else {
                        System.out.println("opcion no valida");
                    }
                    break;
                case 2:
                    int valor = 0;
                    for (int i=1; i<100;  i++){
                        if (asientosList.get(i).isReservado()){
                            valor = asientosList.get(i).getValorAsiento()+valor;
                        }
                    }System.out.println(valor);
                    break;
            }

        }while (ingresar!=0);
    }

}
