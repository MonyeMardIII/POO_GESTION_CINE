public class FuncionNormal extends FuncionCine {
    public FuncionNormal() {
        super();
    }

    public FuncionNormal(String tituloPelicula, String sala, int asientosDisponibles) {
        super(tituloPelicula, sala, asientosDisponibles);
    }

    @Override
    public double calcularRecaudacion() {
        return super.calcularRecaudacion();
    }
}
