package simuladormemoria;

import java.util.ArrayList;
import java.util.Random;

public class Memoria {

    private ArrayList<Integer> memoria = new ArrayList<>();

    public Memoria(int longitud) {
        Random random = new Random();
        for(int i=0; i< longitud; i++){
            this.memoria.add(random.nextInt(50));
        }
    }

    public void imprimirValores() {
        System.out.println(this.memoria);
    }


    public void guardarProceso(int tamanioProceso)  {
       if(obtenerSumaTodaLaMemoria() > tamanioProceso){
           // insertar valor en la memoria
       } else {
           System.out.println("El tamanio del proceso es muy grande para la memoria actual");
       }
    }

    private int obtenerSumaTodaLaMemoria() {

        int suma = 0;
        for(int i=0; i >= suma; i++){
            suma = suma + i;
        }
    }


}
