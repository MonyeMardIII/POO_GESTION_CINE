import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        FuncionEstreno estreno = new FuncionEstreno();
        System.out.println("===== REGISTRO DE FUNCION DE ESTRENO =====");
        estreno.setTituloPelicula(leerTextoNoVacio(teclado, "Nombre de la pelicula: "));
        estreno.setSala(leerTextoNoVacio(teclado, "Sala asignada: "));
        estreno.setAsientosDisponibles(leerEnteroPositivo(teclado, "Cantidad de asientos disponibles: "));
        estreno.setPorcentajeRecargo(leerDecimalNoNegativo(teclado, "Porcentaje de recargo por estreno: "));
        venderEntradas(teclado, estreno);

        FuncionNormal normal = new FuncionNormal();
        System.out.println("===== REGISTRO DE FUNCION NORMAL =====");
        normal.setTituloPelicula(leerTextoNoVacio(teclado, "Nombre de la pelicula: "));
        normal.setSala(leerTextoNoVacio(teclado, "Sala asignada: "));
        normal.setAsientosDisponibles(leerEnteroPositivo(teclado, "Cantidad de asientos disponibles: "));
        venderEntradas(teclado, normal);

        System.out.println("===== RESUMEN DE FUNCIONES =====");
        mostrarFuncion(estreno);
        mostrarFuncion(normal);
        teclado.close();
    }

    private static String leerTextoNoVacio(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String valor = teclado.nextLine();
            if (!valor.trim().isEmpty()) {
                return valor;
            }
            System.out.println("ERROR: Este dato no puede estar vacio.");
        }
    }

    private static int leerEnteroPositivo(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (teclado.hasNextInt()) {
                int valor = teclado.nextInt();
                teclado.nextLine();
                if (valor > 0) {
                    return valor;
                }
            } else {
                teclado.nextLine();
            }
            System.out.println("ERROR: Ingrese un numero entero positivo.");
        }
    }

    private static double leerDecimalNoNegativo(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = teclado.nextLine().trim().replace(',', '.');
            try {
                double valor = Double.parseDouble(entrada);
                if (Double.isFinite(valor) && valor >= 0) {
                    return valor;
                }
            } catch (NumberFormatException excepcion) {
                System.out.println("ERROR: Ingrese un valor numerico valido.");
                continue;
            }
            System.out.println("ERROR: El porcentaje no puede ser negativo.");
        }
    }

    private static void venderEntradas(Scanner teclado, FuncionCine funcion) {
        while (true) {
            int cantidad = leerEnteroPositivo(teclado, "Cantidad de entradas a vender: ");
            if (funcion.venderEntradas(cantidad)) {
                return;
            }
        }
    }

    private static void mostrarFuncion(FuncionCine funcion) {
        System.out.println("\nPelicula: " + funcion.getTituloPelicula());
        System.out.println("Sala: " + funcion.getSala());
        System.out.println("Asientos ocupados: " + funcion.getAsientosOcupados());
        System.out.println("Asientos disponibles: " + funcion.getAsientosDisponibles());
        System.out.printf("Recaudacion: $%.2f COP%n", funcion.getRecaudacion());
    }
}
