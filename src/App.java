import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento mO = new MetodoOrdenamiento();

        Scanner sc = new Scanner(System.in);

        int tamanio = leerEnteroValido(sc, "Ingrese el tamaño del arreglo (debe ser un entero positivo):", false);

        int[] arreglo = new int[tamanio];

        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < tamanio; i++) {
            arreglo[i] = leerEnteroValido(sc, "Valor para la posición " + (i + 1) + ":", true);
        }

        mO.sortBubbleAva(arreglo);

        System.out.println("Arreglo ordenado:");
        mO.printArreglo(arreglo);
        sc.close();
    }

    public static int leerEnteroValido(Scanner sc, String mensaje, boolean permitirNegativos) {
        int numero;
        do {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingrese un entero válido.");
                sc.next(); 
            }
            numero = sc.nextInt();
            if (!permitirNegativos && numero <= 0) {
                System.out.println("El número debe ser un entero positivo.");
            }
        } while (!permitirNegativos && numero <= 0);

        return numero;
    }
}