public class SumaIgual {
    public static String sumaIgual (int[] numeros, int numero) {
        String resultado = "";

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if ((numeros[i] + numeros[j]) == numero) {
                    resultado += "[" + numeros[i] + " " + "+" + " " +numeros[j] + "]" + " ";
                    break;
                }
            }
        } return resultado;

    }
    public static void main(String[] args) {
        int [] numeros = {2, 3, 3, 5, 4, 1};
        int numero;

        numero = Utilidades.leerEntero("Ingrese un número: ");

        String resultado = sumaIgual(numeros, numero);

        System.out.println(resultado);
    }
}
