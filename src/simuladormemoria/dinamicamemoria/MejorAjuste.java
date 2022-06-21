package simuladormemoria.dinamicamemoria;

import simuladormemoria.Memoria;
import simuladormemoria.excepciones.MemoriaInsuficienteException;

import java.util.Scanner;

public class MejorAjuste {

    public static void mejorajuste(){

        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("Seleccionaste: 2. Mejor ajuste");
        System.out.println("------------------------------------------------------");
        System.out.println("Se recorre toda la memoria disponible en busca del tamaño ");
        System.out.println("del bloque que este mas cerca por encima, es decir, ");
        System.out.println("donde halla menos fragmentacion interna (menor sobra), ");
        System.out.println("Sin ordenarlo ");

        System.out.println("------------------------------------------------------");
        System.out.println("creando memoria ...");
        System.out.println("-----------------------------------------------------------------------------");

        Memoria memoria = new Memoria(20);

        System.out.println("Valores actuales de la memoria");

        memoria.imprimirValores();

        System.out.println("-----------------------------------------------------------------------------");

        guardarProceso(input, memoria);

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Valores de la memoria despues de asignar proceso");

        memoria.imprimirValores();

    }

    private static void guardarProceso(Scanner input, Memoria memoria) {
        System.out.println("Ingresa el tamanio del proceso: ");
        Integer tamanio = input.nextInt();
        System.out.println("-----------------------------------------------------------------------------");

        try {
            memoria.guardarProcesoMejorAjuste(tamanio);
        } catch (MemoriaInsuficienteException e) {
            System.out.println("La memoria actual no tiene la capacidad de almacenar el proceso");
            System.out.println("-----------------------------------------------------------------------------");
            guardarProceso(input, memoria);
        }

    }

}
