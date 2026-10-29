public class FuncionEstreno extends FuncionCine {
    private double porcentajeRecargo;

    public FuncionEstreno() {
        super();
        porcentajeRecargo = 20.0;
    }

    public FuncionEstreno(String tituloPelicula, String sala, int asientosDisponibles,
                          double porcentajeRecargo) {
        super(tituloPelicula, sala, asientosDisponibles);
        this.porcentajeRecargo = 20.0;
        setPorcentajeRecargo(porcentajeRecargo);
    }

    public double getPorcentajeRecargo() {
        return porcentajeRecargo;
    }

    public boolean setPorcentajeRecargo(double porcentajeRecargo) {
        if (porcentajeRecargo >= 0) {
            this.porcentajeRecargo = porcentajeRecargo;
            return true;
        }
        System.out.println("ERROR: El porcentaje de recargo no puede ser negativo.");
        return false;
    }

    @Override
    public double calcularRecaudacion() {
        double tarifaEstreno = TARIFA_BASE * (1 + porcentajeRecargo / 100);
        double total = getAsientosOcupados() * tarifaEstreno;
        setRecaudacion(total);
        return total;
    }
}
