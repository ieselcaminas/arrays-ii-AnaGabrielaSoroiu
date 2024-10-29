public class Duplicados {
    public static String duplicados (int[] numeros) {
        String resultado = "";

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    resultado += numeros[i] + " ";
                    break;
                }
            }
        } return resultado;

    }
    public static void main(String[] args) {
        int [] numeros = {8, 4, 6, 22, 8, 21, 6};

        String resultado = duplicados(numeros);

        System.out.println(resultado);

    }
}
