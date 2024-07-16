package conversordemoneda.calculos;

public class Moneda {
    public static String getCodigoMoneda(int opcion) {
        switch (opcion) {
            case 1: return "ARS";
            case 2: return "USD";
            case 3: return "BRL";
            case 4: return "USD";
            case 5: return "COP";
            case 6: return "USD";
            default: return null;
        }
    }

    public static String getMonedaBase(int opcion) {
        switch (opcion) {
            case 1:
            case 3:
            case 5: return "USD";
            case 2: return "ARS";
            case 4: return "BRL";
            case 6: return "COP";
            default: return null;
        }
    }
}
