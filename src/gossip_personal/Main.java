package gossip_personal;
import java.util.Random;

public class Main {

	private static final int nodos = 10;//10nodos para probar si los 10 nodos se infectan
    private static final double contagio = 0.9;//Le damos una probalidad de contagio del 50%
    private static final int intera = 20;

    // Método para propagar la infección
    private static void propagarInfeccion(Nodo[] Nodos) {
        Random rand = new Random();
        int NodoFuente = rand.nextInt(nodos); //el nodo que propaga la infección.
       
      //creamos la condicion para saber si está infectado o no.
        if (Nodos[NodoFuente].getEstado() == 1) { 
            for (int i = 0; i < nodos; ++i) {
                if (rand.nextDouble() < contagio) { // Probabilidad de contagio
                    Nodos[i].setEstado(1); // El nodo se infecta
                    System.out.println("Nodos de la red: " + Nodos[i].getnum_id() + " infectados");
                 
                }
            }
          /*
          }else{
          System.out.println("Iteración " + intera + ": null");
          */
        }
    }

    public static void main(String[] args) {
        // manda crear un nuevo objeto
        Nodo[] Nodos = new Nodo[nodos];
        for (int i = 0; i < nodos; ++i) {
          //se inicializa, sería el caso base
            Nodos[i] = new Nodo(i, (i == 0) ? 1 : 0); // Nodo 0 comienza infectado, el resto sano
        }

        // Simular la propagación de la infección durante varias iteraciones
        for (int iteracion = 0; iteracion < intera; ++iteracion) {
            System.out.println("\nIteración " + (iteracion + 1) + ":");
            propagarInfeccion(Nodos);
        }
    }

}
