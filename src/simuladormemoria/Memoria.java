package simuladormemoria;

import simuladormemoria.excepciones.MemoriaInsuficienteException;

import java.util.*;

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


    public void guardarProcesoPrimerAjuste(int tamanioProceso) throws MemoriaInsuficienteException {

        verificarCapacidadMemoria(tamanioProceso);
        if(segmentoDisponible(tamanioProceso)) {
            for (int i = 0; i < memoria.size(); i++) {
                if(memoria.get(i) >= tamanioProceso) {
                    System.out.println("memoria asignada: " + tamanioProceso );
                    System.out.println("posicion: " + i );
                    System.out.println("fragmentacion interna: " + (memoria.get(i) - tamanioProceso) );
                    System.out.println("valor encontrado: " + memoria.get(i));
                    memoria.set(i, 0);
                    break;
                }
            }
        }
    }

    public void guardarProcesoMejorAjuste(int tamanioProceso) throws MemoriaInsuficienteException {

        verificarCapacidadMemoria(tamanioProceso);
        if(segmentoDisponible(tamanioProceso)) {
            for (int i = 0; i < memoria.size(); i++) {
                int fragmentacion = memoria.get(i) - tamanioProceso;

                if(fragmentacion >= 0 && fragmentacion <= 1 && fragmentacion <= 2 && fragmentacion <= 3)  {
                    System.out.println("memoria asignada: " + tamanioProceso );
                    System.out.println("posicion: " + i );
                    System.out.println("fragmentacion interna: " + (memoria.get(i) - tamanioProceso) );
                    System.out.println("valor encontrado: " + memoria.get(i));
                    memoria.set(i, 0);
                    break;
                }
            }
        }
    }

    public void guardarProcesoPeorAjuste(int tamanioProceso) throws MemoriaInsuficienteException {
        verificarCapacidadMemoria(tamanioProceso);
        if(segmentoDisponible(tamanioProceso)) {
            for (int i = 0; i < memoria.size(); i++) {
                if(memoria.get(i) >= tamanioProceso)  {
                    System.out.println("memoria asignada: " + tamanioProceso );
                    System.out.println("posicion: " + i );
                    System.out.println("fragmentacion interna: " + (memoria.get(i) - tamanioProceso) );
                    System.out.println("valor encontrado: " + memoria.get(i));
                    memoria.set(i, 0);
                    break;
                }
            }
        }
    }

    public void arrayOrdenado() {
        Collections.sort(memoria, Collections.reverseOrder());
        System.out.println(memoria);
    }

    private boolean segmentoDisponible(int tamanioProceso) {
        boolean esSegmentoDisponible = false;
        for (Integer segmento : memoria) {
            if(segmento >= tamanioProceso) {
                 esSegmentoDisponible = true;
            }
        }

        return esSegmentoDisponible;
    }

    private void verificarCapacidadMemoria(int tamanioProceso) throws MemoriaInsuficienteException {
        if(obtenerSumaTodaLaMemoria() < tamanioProceso) {
            throw new MemoriaInsuficienteException("La memoria no tiene suficiente espacio para este proceso" +
                    "-----------------------------------------------------------------------------");

        }
    }


    public int obtenerSumaTodaLaMemoria() {
        int suma = 0;
        for(Integer tamanio : memoria){
            suma = suma + tamanio;
        }
        return suma;
    }
}
