public class FuncionCine {
    public static final double TARIFA_BASE = 12000.0;

    private String tituloPelicula;
    private String sala;
    private int asientosOcupados;
    private int asientosDisponibles;
    private int capacidadSala;
    private double recaudacion;

    public FuncionCine() {
        tituloPelicula = "";
        sala = "";
    }

    public FuncionCine(String tituloPelicula, String sala, int asientosDisponibles) {
        this();
        setTituloPelicula(tituloPelicula);
        setSala(sala);
        setAsientosDisponibles(asientosDisponibles);
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public boolean setTituloPelicula(String tituloPelicula) {
        if (tituloPelicula != null && !tituloPelicula.trim().isEmpty()) {
            this.tituloPelicula = tituloPelicula.trim();
            return true;
        }
        System.out.println("ERROR: El nombre de la pelicula no puede estar vacio.");
        return false;
    }

    public String getSala() {
        return sala;
    }

    public boolean setSala(String sala) {
        if (sala != null && !sala.trim().isEmpty()) {
            this.sala = sala.trim();
            return true;
        }
        System.out.println("ERROR: La sala no puede estar vacia.");
        return false;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public boolean setAsientosOcupados(int asientosOcupados) {
        if (asientosOcupados >= 0 && asientosOcupados <= capacidadSala) {
            this.asientosOcupados = asientosOcupados;
            asientosDisponibles = capacidadSala - asientosOcupados;
            return true;
        }
        System.out.println("ERROR: Los asientos ocupados deben estar entre 0 y la capacidad de la sala.");
        return false;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public boolean setAsientosDisponibles(int asientosDisponibles) {
        if (asientosDisponibles > 0) {
            capacidadSala = asientosOcupados + asientosDisponibles;
            this.asientosDisponibles = asientosDisponibles;
            return true;
        }
        System.out.println("ERROR: La cantidad de asientos disponibles debe ser positiva.");
        return false;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public boolean setRecaudacion(double recaudacion) {
        if (recaudacion >= 0) {
            this.recaudacion = recaudacion;
            return true;
        }
        System.out.println("ERROR: La recaudacion no puede ser negativa.");
        return false;
    }

    public double calcularRecaudacion() {
        double total = asientosOcupados * TARIFA_BASE;
        setRecaudacion(total);
        return total;
    }

    public boolean venderEntradas(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("ERROR: La cantidad de entradas debe ser positiva.");
            return false;
        }
        if (cantidad > asientosDisponibles) {
            System.out.println("ERROR: No hay suficientes asientos disponibles.");
            return false;
        }

        setAsientosOcupados(asientosOcupados + cantidad);
        calcularRecaudacion();
        return true;
    }
}
