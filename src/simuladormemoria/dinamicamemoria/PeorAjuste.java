package simuladormemoria.dinamicamemoria;

import simuladormemoria.Memoria;

import java.util.Scanner;

public class PeorAjuste {

    public static void peorajuste(){

        Scanner input = new Scanner(System.in);
        Memoria memoria = new Memoria(20);

        System.out.println("------------------------------------------------------");
        System.out.println("Seleccionaste: 3. Peor Ajuste");
        System.out.println("------------------------------------------------------");
        System.out.println("Se ordena la memoria disponible de mayor a menor, ");
        System.out.println("(en otro vector) y se busca solo en la primera posicion,");
        System.out.println("porque si no es lo suficientemente grande para lo solicitado,");
        System.out.println("no se sigue buscando pq no tiene sentido");
        System.out.println("------------------------------------------------------");

        System.out.println("Ingresa el tamanio del proceso: ");
        Integer tamanio = input.nextInt();


    }

}
