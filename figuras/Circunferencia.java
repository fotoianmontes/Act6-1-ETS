package figuras;

/**
 * La clase Circunferencia representa una circunferencia con un radio y un color.
 */
public class Circunferencia {
    private double radio;
    private String color;

    /**
     * Crea una nueva instancia de la clase Circunferencia con el radio especificado.
     *
     * @param radio el radio de la circunferencia
     */
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * Imprime la información de la circunferencia, incluyendo el diámetro, el color y el área.
     */
    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area1 = 2 * 3.1416 * radio * radio;
        double area = area1;
        System.out.println(area);
    }

    /**
     * Compara si la circunferencia actual es igual a otra circunferencia especificada.
     *
     * @param considerarDecimales indica si se deben considerar los decimales en la comparación
     * @param otro                la otra circunferencia a comparar
     * @return true si las circunferencias son iguales, false en caso contrario
     */
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }

    /**
     * Obtiene el radio de la circunferencia.
     *
     * @return devuelve el radio de la circunferencia
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio de la circunferencia.
     *
     * @param radio es el nuevo radio de la circunferencia
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}

