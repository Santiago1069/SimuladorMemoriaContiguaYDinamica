package simuladormemoria.dinamicamemoria;

import java.util.ArrayList;
import java.util.Scanner;

public class DinamicaMemoria {

    public static void dinamicamemoriainicio(){

        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("Seleccionaste: 1. Simulador de dinamica de la memoria ");
        System.out.println("------------------------------------------------------");

        System.out.println("La asignacion dinamica de la memoria puede darse de ");
        System.out.println("tres formas, las cuales son, ingrese una opcion: ");
        System.out.println("1. Primer ajuste");
        System.out.println("2. Mejor ajuste");
        System.out.println("3. Peor ajuste");
        System.out.println("------------------------------------------------------");
        Integer opcion = input.nextInt();

        switch (opcion){
            case 1:
                PrimerAjuste primerAjuste = new PrimerAjuste();
                primerAjuste.primerajuste();
                break;

            case 2:
                MejorAjuste mejorAjuste = new MejorAjuste();
                mejorAjuste.mejorajuste();
                break;

            case 3:
                PeorAjuste peorAjuste = new PeorAjuste();
                peorAjuste.peorajuste();
                break;
        }



    }



}
