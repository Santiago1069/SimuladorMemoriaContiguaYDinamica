package simuladormemoria.dinamicamemoria;

import simuladormemoria.Memoria;

import java.util.Scanner;

public class MejorAjuste {

    public static void mejorajuste(){

        Scanner input = new Scanner(System.in);
        Memoria memoria = new Memoria(20);

        System.out.println("------------------------------------------------------");
        System.out.println("Seleccionaste: 2. Mejor Ajuste");
        System.out.println("------------------------------------------------------");
        System.out.println("Se recorre toda la memoria disponible en busca del tamanio ");
        System.out.println("del bloque que este mas cerca por encima, es decir, donde ");
        System.out.println("halla menos fragmentacion interna, Sin ordenarlo ");
        System.out.println("------------------------------------------------------");
        System.out.println("Ingresa el tamanio del proceso: ");
        Integer tamanio = input.nextInt();

    }
}
