package cl.ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros[] = new int[10];
        int numeroMayor;
        int numeroMenor;
        for (int i=0; i<numeros.length; i+=1){
            System.out.println("ingrese un numero");
            numeros[i] = scan.nextInt();
        }
        numeroMenor = numeros[0];
        numeroMayor = numeros[0];
        for (int i=1; i<numeros.length; i+=1) {
        if (numeros[i]<numeroMenor){
            numeroMenor = numeros[i];
        }if (numeros[i]>numeroMayor){
            numeroMayor = numeros[i];
            }
        }
        System.out.println("el numero mayor es "+numeroMayor+" y el numero menor "+numeroMenor);




    }
}
