package refactor.ref4;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        // imprimir título
        titulo();

        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...

        // imprimir conclusión
        conclusion();
    }

    private static void conclusion() {
        System.out.println("Conclusión del Reporte");
    }

    private static void titulo() {
        System.out.println("Título del Reporte");
    }
}
