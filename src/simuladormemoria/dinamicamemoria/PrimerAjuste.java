package simuladormemoria.dinamicamemoria;

import simuladormemoria.Memoria;
import simuladormemoria.excepciones.MemoriaInsuficienteException;

import java.util.Scanner;

public class PrimerAjuste {

    public void primerajuste(){

        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("Seleccionaste: 1. Primer ajuste");
        System.out.println("------------------------------------------------------");
        System.out.println("El tamanio del primer bloque que se encuentre igual o ");
        System.out.println("mayor a lo solicitado");
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

    private void guardarProceso(Scanner input, Memoria memoria) {
        System.out.println("Ingresa el tamanio del proceso: ");
        Integer tamanio = input.nextInt();
        System.out.println("-----------------------------------------------------------------------------");

        try {
            memoria.guardarProceso(tamanio);
        } catch (MemoriaInsuficienteException e) {
            System.out.println("La memoria actual no tiene la capacidad de almacenar el proceso");
            System.out.println("-----------------------------------------------------------------------------");
            guardarProceso(input, memoria);
        }

    }
}
