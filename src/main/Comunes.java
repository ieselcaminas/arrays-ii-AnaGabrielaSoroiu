public class Comunes {
    public static String comunes (int[] num1, int[] num2) {
        String resultado = "";

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    resultado += num1[i] + " ";
                    break;
                }
            }
        } return resultado;

    }
    public static void main(String[] args) {
        int[] num1 = {4, 5, 7, 9, 4, 2};
        int[] num2 = {4, 6, 2};
        String resultado = "";

        resultado = comunes(num1, num2);

        System.out.println(resultado);
    }
}
