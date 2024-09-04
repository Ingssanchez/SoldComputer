package ventascomputadoras; // Nombre del paquete debe coincidir con el nombre de la Clase Publica
//Autor @Ingssanchez 2024122424 Celular +573208689548
import java.util.Scanner;

public class ventascomputadoras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de computadoras a comprar: ");
        int cantidadComputadoras = scanner.nextInt();

        double precioUnitario = 500.0;
        double precioTotal = cantidadComputadoras * precioUnitario;
        double descuento = 0.0;

        // Estructura condicional aplicada
        if (cantidadComputadoras < 5) {
            descuento = 0.10; // 10% de descuento
        } else if (cantidadComputadoras >= 5 && cantidadComputadoras < 10) {
            descuento = 0.20; // 20% de descuento
        } else { // 10 o más computadoras
            descuento = 0.40; // 40% de descuento
        }

        double precioFinal = precioTotal - (precioTotal * descuento);

        // Estructura switch muestra el descuento
        String mensajeDescuento;
        switch ((int) (descuento * 100)) {
            case 10:
                mensajeDescuento = "10%";
                break;
            case 20:
                mensajeDescuento = "20%";
                break;
            case 40:
                mensajeDescuento = "40%";
                break;
            default:
                mensajeDescuento = "Este programa no puede calcular esa cantidad"; // En caso de error
        }

        System.out.println("Precio total sin descuento COP" + precioTotal);
        System.out.println("Descuento aplicado COP " + mensajeDescuento);
        System.out.println("Precio final con descuento COP" + precioFinal);

        scanner.close();
    }
}
