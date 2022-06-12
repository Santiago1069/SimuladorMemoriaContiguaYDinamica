import simuladormemoria.dinamicamemoria.DinamicaMemoria;
import simuladormemoria.memoriacontigua.MemoriaContigua;

import java.util.Scanner;

public class main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("---------------BIENVENIDOS AL SIMULADOR---------------");
        System.out.println("------------------------------------------------------");
        System.out.println("Ingrese la opcion que quisieras hacer:");
        System.out.println("1. Simulador de dinamica de la memoria ");
        System.out.println("2. Simulador de memoria contigua");
        System.out.println("------------------------------------------------------");
        Integer opcion = input.nextInt();

        switch (opcion){
            case 1:
                DinamicaMemoria dinamicamemoria = new DinamicaMemoria();
                dinamicamemoria.dinamicamemoriainicio();
                break;

            case 2:
                MemoriaContigua memoriaContigua = new MemoriaContigua();
                break;

            default:
                break;
        }







    }
}
