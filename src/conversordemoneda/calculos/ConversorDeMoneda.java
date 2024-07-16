package conversordemoneda.calculos;

public class ConversorDeMoneda {
    private double tasaDeCambio;

    public ConversorDeMoneda(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }

    public double convertir(double valor) {
        return valor * tasaDeCambio;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }

    public void setTasaDeCambio(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }
}
