package refactor.ref2;

/*
Tarea: Reemplazar el número mágico 86400 con una constante descriptiva.
 */
public class Timer {
    private final int tiempoEspera = 86400;
    void startTimer() {
        // Espera 86400 segundos (24 horas)
        Thread.sleep(tiempoEspera);
    }
}