package simuladormemoria.dinamicamemoria;

import simuladormemoria.Memoria;
import simuladormemoria.excepciones.MemoriaInsuficienteException;

import java.util.Collections;
import java.util.Scanner;

public class PeorAjuste {

    public static void peorajuste(){

        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("Seleccionaste: 3. Peor Ajuste");
        System.out.println("------------------------------------------------------");
        System.out.println("Se ordena la memoria disponible de mayor a menor, ");
        System.out.println("(en otro vector) y se busca solo en la primera posicion,");
        System.out.println("porque si no es lo suficientemente grande para lo solicitado,");
        System.out.println("no se sigue buscando por que no tiene sentido");
        System.out.println("------------------------------------------------------");


        System.out.println("creando memoria ...");
        System.out.println("-----------------------------------------------------------------------------");

        Memoria memoria = new Memoria(20);

        System.out.println("Valores actuales de la memoria");
        memoria.arrayOrdenado();
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
            memoria.guardarProcesoPeorAjuste(tamanio);
        } catch (MemoriaInsuficienteException e) {
            System.out.println("La memoria actual no tiene la capacidad de almacenar el proceso");
            System.out.println("-----------------------------------------------------------------------------");
            guardarProceso(input, memoria);
        }

    }

}
