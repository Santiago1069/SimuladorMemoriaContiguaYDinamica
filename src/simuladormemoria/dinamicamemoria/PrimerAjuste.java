package simuladormemoria.dinamicamemoria;

import simuladormemoria.Memoria;

import java.util.Scanner;

public class PrimerAjuste {

    public static void primerajuste(){

        Scanner input = new Scanner(System.in);
        Memoria memoria = new Memoria(20);

        System.out.println("------------------------------------------------------");
        System.out.println("Seleccionaste: 1. Primer ajuste");
        System.out.println("------------------------------------------------------");
        System.out.println("El tamanio del primer bloque que se encuentre igual o ");
        System.out.println("mayor a lo solicitado");
        System.out.println("------------------------------------------------------");
        System.out.println("Ingresa el tamanio del proceso: ");
        Integer tamanio = input.nextInt();

        System.out.println("------------------------------------------------------");
        System.out.println("Valores actuales de la memoria");
        memoria.imprimirValores();
        System.out.println("------------------------------------------------------");
        memoria.guardarProceso(tamanio);
        System.out.println("Valores modificados despues del proceso");
        memoria.imprimirValores();
        System.out.println("------------------------------------------------------");


    }
}
