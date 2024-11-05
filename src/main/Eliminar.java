import java.util.Arrays;

public class Eliminar {
    public static int[] eliminar(int[] numeros, int numero) {
        int aux = numeros[numero];

        for (int i = numero; i < numeros.length-1; i++) {
            numeros[i] = numeros[i+1];
        }
        numeros[numeros.length-1] = aux;

        return numeros;
    }

    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 10};
        int posicion;

        posicion = Utilidades.leerEntero("Introduce el número a eliminar: ");

        System.out.println(Arrays.toString(eliminar(numeros, posicion)));
    }

}
